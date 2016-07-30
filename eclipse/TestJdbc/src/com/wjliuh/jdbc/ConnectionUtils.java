package com.wjliuh.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtils {

	private static Properties prop;
	static {
		prop = new Properties();
		try {
			prop.load(ConnectionUtils.class.getResourceAsStream("jdbc.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public ConnectionUtils(){
		
	}
	
	public static Connection getConnection(){
		Connection connection = null;
        try {
			Class.forName(prop.getProperty("driver"));
			connection = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"), prop.getProperty("password"));// 获取连接
		
			connection.setAutoCommit(false);
        
        } catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		
		return connection;
		
	}
	
	public void commit(Connection conn){
		synchronized (conn) {
			try {
				conn.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
