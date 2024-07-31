package com.akhila.jdbc;
import java.sql.*;
public class Employees {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// step 1
	 Class.forName("com.mysql.cj.jdbc.Driver"); //");
		// query to create employee table
  String create_query = "create table employee(employee_id int primary key auto_increment,first_name varchar(30),last_name varchar(50),age int )";

	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_lab","root","root");
		// step 3 : simple statement
		 Statement st = con.createStatement();
		//executing query
	        st.executeUpdate(create_query);
	        System.out.println("table created successfully");
	        con.close();

	}

}
