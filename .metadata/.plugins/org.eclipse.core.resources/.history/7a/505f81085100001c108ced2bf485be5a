package com.app.dao.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlDbConnection {
	
	private static Connection connection; 
	
	private MySqlDbConnection()
	
	{
		
	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	
	{
		// step 1-Load driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//System.out.println("Driver loaded Successfully");
		//step 2 open connection
		String url="jdbc:mysql://localhost:3306/delicious";
		String username="root";
		String password="Gokul@9900raja";
		connection= DriverManager.getConnection(url,username,password);
		//System.out.println("Connection Established");
		return connection;
	}

}
