package com.akhila.jdbc;
import java.sql.*;
public class UpdateEmployeesTable {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/crud_lab";
		String UserName = "root";
		String Password = "root";
		Connection con=DriverManager.getConnection(url,UserName,Password);
		//to add designation column
		String alter_query = "alter table employee add Designation varchar(50)";
		Statement st=con.createStatement();
		//executing alter query
		st.executeUpdate(alter_query);
		System.out.println("designation column added successfully");
		//update query to do updates
		String update_query="update employee set age=25,Designation='software developer' where employee_id = 101";
		//executing update query
		st.executeUpdate(update_query);
		System.out.println("record updated successfully");
		 con.close();
	}
}
