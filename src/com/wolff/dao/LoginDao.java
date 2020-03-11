package com.wolff.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.wolff.model.User;

public class LoginDao extends Conexion{
	
	public List<User> login(User u) {
		this.getConn();
		List<User>listar = null;
		String sql = "select * from users where username=? AND password=?";
		try {
			listar = new ArrayList<>();
			PreparedStatement ps = this.conn.prepareStatement(sql);
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getPassword());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				u = new User(
						rs.getInt(1),rs.getString(2),
						rs.getString(3),rs.getString(4));
				listar.add(u);
			}else {
				listar = null;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return listar;
	}
	
	public String Register(User u) {
		String check = "";
		this.getConn();
		String sql = "insert into users (username,password,email)values(?,?,?)";
		try {
			PreparedStatement ps = this.conn.prepareStatement(sql);
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getPassword());
			ps.setString(3, u.getEmail());
			if(ps.executeUpdate() > 0) {
				check = "welcome.jsp";
			}else {
				check = "404.html";
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return check;
	}

	
}
