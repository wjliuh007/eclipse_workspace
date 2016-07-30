package com.wjliuh.patch;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nc.jdbc.framework.exception.DbException;

/**
 * 
 */

/**
 * @author JIE
 *
 */
public class SqlTool2 {

	private List<String> sql =null;
	private String tableName = null;
	private String primaryKey = null;
	private String[] cloumns = null;
	private String[] values = null;
	private int indexKey =0;
	private Logger log;
	private JdbcSession session;
	public SqlTool2(List<String> _sql, Logger _log,JdbcSession _session){
		session = _session;
		this.sql = _sql;
		this.log = _log;
		init();
	}

	private void init() {
		if(this.sql.size()<1){
			return;
		}
		getTableName();
		getCloumns();
	}

	public List<String> getSql() {
		return sql;
	}

	public void setSql(List<String> sql) {
		this.sql = sql;
	}

	public String getTableName() {
		try{
			if(tableName !=null){
				return tableName;
			}
			Pattern p = Pattern.compile("insert(\\s){1}into(\\s){1}((\\w)+)\\(");
			Matcher m =null;
			m = p.matcher(sql.get(0));
			while(m.find()){
				setTableName(m.group(3));
			}

		}catch(IndexOutOfBoundsException e){
			System.out.println(tableName);
		}
		
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getPrimaryKey() {
		primaryKey = Constants.TEMPLATE_MAPING.get(tableName);
		return primaryKey;
	}

	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}

	public String[] getCloumns() {
		if(cloumns !=null){
			return cloumns;
		}
		Pattern p = Pattern.compile("(\\(([^\\)]+)\\))");
		Matcher m =null;
		m = p.matcher(sql.get(0));
		String temp = null;
		while(m.find()){
			temp = m.group(2);
			if(temp.indexOf("\'")<0){
				cloumns = temp.split(",");
				break;
			}
		}
		
		for(int i=0;i<cloumns.length;i++){
			if(Constants.TEMPLATE_MAPING.get(tableName).equals(cloumns[i])){
				indexKey = i;
				break;
			}

		}
		return cloumns;
	}

	public String[] getValues(int index) {
		Pattern p = Pattern.compile("(\\(([^\\)]+)\\))");
		Matcher m =null;
		m = p.matcher(sql.get(index));
		String temp = null;
		while(m.find()){
			temp = m.group(2);
			if(temp.indexOf("\'")>=0){
				values = getColValue(temp);
				break;
			}
		}
		return values;
	}

	private String[] getColValue(String str3) {
		List<String> v = new ArrayList<String>();
		int p1 = 0;
		int count = 0;
		for (int i = 0, n = str3.length(); i < n; i++) {
			char ch = str3.charAt(i);
			if (ch == '\'') {
				count++;
				continue;
			}
			if (ch == ',' && count % 2 == 0) {
				v.add(str3.substring(p1, i).trim());
				p1 = i + 1;
			}
		}
		v.add(str3.substring(p1));
		return v.toArray(new String[0]);
	}
	public void deleteData() throws Exception{
		if("bd_refinfo".equals(tableName)){
			for(int i=0;i<2;i++){
				
				String delSql = "delete from "+tableName+" where "+getPrimaryKey()+" = "+getValues(i)[indexKey];
				try {
					session.executeUpdate(delSql);
					this.log.log(Level.INFO, "success :"+delSql);
				} catch (DbException e) {
					this.log.log(Level.WARNING, "É¾³ýÊý¾Ý´íÎó£º"+delSql);
				}
			}
		}else{
			String breakpoint = getValues(0)[indexKey];
			if("'1002ZA10000000002W61'".equals(breakpoint)){
				System.out.println("stop");
			}
			String delSql = "delete from "+tableName+" where "+getPrimaryKey()+" = "+getValues(0)[indexKey];
			try {
				session.executeUpdate(delSql);
				this.log.log(Level.INFO, "success :"+delSql);
			} catch (DbException e) {
				this.log.log(Level.WARNING, "É¾³ýÊý¾Ý´íÎó£º"+delSql);
			}
		}

	}
	
	public void insert() throws Exception{
		for(int i=0;i<sql.size();i++){
			try {
				session.executeUpdate(sql.get(i));
				this.log.log(Level.INFO, "success :"+sql.get(i));
			} catch (DbException e) {
				this.log.log(Level.WARNING, "²åÈëÊý¾Ý´íÎó£º"+sql.get(i));
			}
		}
	}
	public void closeAll(){
		session.close();
	}
}
