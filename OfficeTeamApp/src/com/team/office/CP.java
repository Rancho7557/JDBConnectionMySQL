package com.team.office;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	
	static Connection con;

	public static Connection createC() {
		
		try {
			
			//load the driver
			
			Class.forName("com.mysql.jdbc.Driver");
			
			//create the connection...
			
			String user = "root";
			String password = "root";
			String url = "jdbc:mysql80://localhost:3306/myteam_manage";
			con = DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			e.printStackTrace();
			//TODO: handle exception
		}
		
		return con;
	}
}
