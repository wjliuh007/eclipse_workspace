package com.wjliuh.patch;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import nc.jdbc.framework.exception.DbException;
import oracle.jdbc.pool.OracleDataSource;

/**
 * @author JIE
 *
 */
public class JdbcSession {
	private static Connection conn = null;
	private static String userName = null;
	private static String pwd = null;
	private static String url = null;
	public JdbcSession() {
	}
	public JdbcSession(String dburl) {
		userName = dburl.split("/")[0].split(":")[0];
		pwd = dburl.split("/")[0].split(":")[1];
		url = dburl.split("/")[1];
		try {
			ods = new OracleDataSource();
			ods.setUser(userName);
			ods.setPassword(pwd);
			ods.setDriverType("oracle.jdbc.driver.OracleDriver");
			ods.setURL("jdbc:oracle:thin:@"+url);
			if (conn == null) {
				try {
					conn = ods.getConnection();
				} catch (Exception e) {
					try {
						url = url.replaceAll(".ufsoft.com.cn", "");
						ods.setURL("jdbc:oracle:thin:@"+url);
						conn = ods.getConnection();
					} catch (Exception ex) {
						throw ex;
					}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static Statement statement = null;
	private static ResultSet result = null;

	private static OracleDataSource ods = null;

	/**
	 * 执行无参数查询
	 * 
	 * @param sql
	 *            查询SQL语句
	 * @param processor
	 *            结果集处理对象
	 * @return 查询结果对象
	 */
	public int executeQuery(String sql) throws DbException {
		ResultSet rs = null;
		try {
			int i=0;
			if (statement == null)
				statement = conn.createStatement();
			rs = statement.executeQuery(sql);
			while(rs.next()){
				i++;
			}
			return i;
		} catch (SQLException e) {
			
		} 
		return 0;
	}
	
	/**
	 * 执行无更新操作
	 * 
	 * @param sql
	 *            更新SQL语句
	 * @return 更新行数
	 */
	public int executeUpdate(String sql) throws Exception {
		int updateRows = 0;

		try {
			if (statement == null)
				statement = conn.createStatement();
			updateRows = statement.executeUpdate(sql);
		} catch (Exception e) {
			throw e;
		} 
		return updateRows;
	}
	
	public static void close() {
		try {
			if(null != statement){
				statement.close();
			}
			if(null != result){
				result.close();
			}	
			if(null != conn){
				conn.close();
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
