package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.OracleDatabaseMetaData;
import oracle.jdbc.pool.OracleDataSource;

import org.junit.Test;

public class GetData {
    private static String url = "jdbc:oracle:thin:@10.1.232.164:1521:ORA12C";
    private static String driver = "oracle.jdbc.driver.OracleDriver";
    private static Connection conn = null;
    private static PreparedStatement statement = null;
    private static ResultSet result = null;

    private static OracleDataSource ods = null;

    static {
	try {
	    ods = new OracleDataSource();
	    ods.setUser("c##tst_user02");
	    ods.setPassword("1");
	    ods.setDriverType("oracle.jdbc.driver.OracleDriver");
	    ods.setURL("jdbc:oracle:thin:@10.1.201.35:1521:ORA12C");
	} catch (Exception e) {
	    e.printStackTrace();
	}

    }

    public GetData() {

    }

    public static List<TreeNode> getTreeNodes() {
	List<TreeNode> list = new ArrayList<TreeNode>();
	try {
	    execQuery("select t.funcode,t.fun_name from sm_funcregister t where own_module like '5003%'");
	    result = statement.executeQuery();
	    while (result.next())
		list.add(makeNode(result.getString(1), result.getString(2)));
	} catch (SQLException e) {
	    e.printStackTrace();
	}
	return list;

    }

    public static Connection getConn() {
	if (conn == null) {
	    try {
		Class.forName(driver);
//		System.class.getClassLoader().loadClass(driver);
		conn = DriverManager.getConnection(url, "c##tst_user02", "1");

	    } catch (Exception e) {
		e.printStackTrace();
	    }
	}

	return conn;
    }

    public static void close() {
	try {
	    statement.close();
	    result.close();
	    conn.close();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public static void execQuery(String sql) {
	try {
	    statement = getConn().prepareStatement(sql);
	} catch (SQLException e) {
	    e.printStackTrace();
	}
    }

    private static TreeNode makeNode(String code, String name) {

	TreeNode tn = new TreeNode(code, name);
	return tn;

    }

    @Test
    public static List<TreeNode> loopQueryNodes() {
	List<TreeNode> list = new ArrayList<TreeNode>();
	List<TreeNode> sonlist = new ArrayList<TreeNode>();
	try {
	    execQuery("select t.productcode,t.note from sm_product_version t where  length(t.productcode)=2");
	    result = statement.executeQuery();
	    while (result.next()) {
		String condi = result.getString(1);
		TreeNode me = makeNode(condi, result.getString(2));
		list.add(me);

		PreparedStatement statement1 = getConn()
			.prepareStatement(
				"select t.productcode,t.note from sm_product_version t where  t.productcode like '"
					+ condi + "%'");
		sonlist = new ArrayList<TreeNode>();
		ResultSet result1 = statement1.executeQuery();
		while (result1.next()) {
		    sonlist.add(makeNode(result1.getString(1),
			    result1.getString(2)));
		}
		me.setChildren(sonlist);
	    }

	} catch (SQLException e) {
	    e.printStackTrace();
	}
	return sonlist;

    }

    @Test
    public void testOracleDataSource() {
	try {
	    conn = ods.getConnection();
	    OracleDatabaseMetaData odmd = (OracleDatabaseMetaData)conn.getMetaData();
	    ResultSet rs = odmd.getTables(null, "C##TST_USER02", null, new String[]{"TABLE","VIEW"});
	    while(rs.next()) {
		System.out.println(String.format("%25s",rs.getString("TABLE_NAME")));
	    }
	    
//	    statement = conn.prepareStatement("select t.TABLE_NAME from user_tables t ");
//	    result = statement.executeQuery();
//	    while (result.next())
//		System.out.println(String.format("%20s", result.getString(1)));
	} catch (Exception e) {
	    e.printStackTrace();
	}finally {
	    try {
		conn.close();
	    } catch (SQLException e) {
		e.printStackTrace();
	    }
	}
    }


}
