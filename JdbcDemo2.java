package com.akhila.jdbc;

import java.sql.*;

public class JdbcDemo2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String sql_query = "create table product_info(p_id int,pName varchar(10),product_avail int)";
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_info","root","root");
        Statement st = con.createStatement();
        st.executeUpdate(sql_query);
        System.out.println("table created successfully");
        con.close();
	}

}
