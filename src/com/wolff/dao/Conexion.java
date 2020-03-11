package com.wolff.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	Connection conn;

	public void getConn() {
		String url = "jdbc:mysql://localhost:3306/hollys_db";
		String user = "root";
		String pass = "";
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url,user,pass);
		}catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
