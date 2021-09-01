package com.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// This class can be used to initialize the database connection
public class databaseConnection {
	private String dbDriver = "com.mysql.jdbc.Driver";
	private String dbURL = "jdbc:mysql:// localhost:3307/advancedjavaassignhotwax";
	private String dbUsername = "root";
	private String dbPassword = "root";

	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;
	}

	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
   public String insert(Member member) {
	   
	   loadDriver(dbDriver);
	   Connection con = getConnection();
	   String result="data entered";
	   String sql = "insert  into  advancedjavaassignhotwax.party  values(?,?,?,?,?,?,?)";
	   try {
		   PreparedStatement st1=con.prepareStatement(sql);
		    st1.setString(2,member.getFirstname());
		    st1.setString(3,member.getLastname());
		    st1.setString(4,member.getAddress());
		    st1.setString(7,member.getZip());
		    st1.setString(5,member.getState());
		    st1.setString(6,member.getCountry());
		    st1.setString(8,member.getPhone());
		    st1.executeUpdate();
		   
	   }
	   catch(SQLException e) {
		   e.printStackTrace();
		   result ="Data not entered";
	   }
	   return result;
   }
public String insertintoLogin(Member member) {
	   
	   loadDriver(dbDriver);
	   Connection con = getConnection();
	   String result="data entered";
	   String query = "insert  into  advancedjavaassignhotwax.userlogin values(?,?)";
	   try {
		   PreparedStatement st=con.prepareStatement(query);
		    st.setString(2,member.getUsername());
		    st.setString(3,member.getPassword());
		    st.executeUpdate();
		   
	   }
	   catch(SQLException e) {
		   e.printStackTrace();
		   result ="Data not entered";
	   }
	   return result;
   }
}