package com.tka.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class ElectionUtility {
	
	public static Connection getConnection()
	{
		String path="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/advjava193";
		String uname="root";
		String pwd="@Atharva_123";
		Connection connection =null;
		try {
			Class.forName(path);
			connection = DriverManager.getConnection(url, uname, pwd);
		}
		catch(Exception e)
		{
			e.printStackTrace();		
		}
	return connection;

}
}
