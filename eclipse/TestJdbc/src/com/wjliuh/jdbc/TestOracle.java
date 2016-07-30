package com.wjliuh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestOracle {

	public static void main(String[] args){
		testOracle();
	}
	/**
	 * 一个非常标准的连接Oracle数据库的示例代码
	 */
	public static void testOracle()
	{
	    Connection con = null;// 创建一个数据库连接
	    PreparedStatement pre = null;// 创建预编译语句对象，一般都是用这个而不用Statement
	    ResultSet result = null;// 创建一个结果集对象
	    try
	    {
	        con = ConnectionUtils.getConnection();
	        System.out.println("连接成功！");
	        String sql = "select table_name,tablespace_name,last_analyzed from user_tables";// 预编译语句，“？”代表参数
	        pre = con.prepareStatement(sql);// 实例化预编译语句
	        //pre.setString(1, "刘显安");// 设置参数，前面的1表示参数的索引，而不是表中列名的索引
	        result = pre.executeQuery();// 执行查询，注意括号中不需要再加参数
	        String tableName = "";
	        while (result.next()){
	        	tableName = result.getString(1);
	        }
	            // 当结果集不为空时
	            System.out.println("table_name:" + result.getString(1) + "tablespace_name:"
	                    + result.getString(2)+ "last_analyzed:"
	    	                    + result.getString(3));
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    finally
	    {
	        try
	        {
	            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
	            // 注意关闭的顺序，最后使用的最先关闭
	            if (result != null)
	                result.close();
	            if (pre != null)
	                pre.close();
	            if (con != null)
	                con.close();
	            System.out.println("数据库连接已关闭！");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	}
}
