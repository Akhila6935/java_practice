package com.akhila.jdbc;
import java.sql.*;
public class InsertingEmployeesTable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_lab","root","root");
		//insering values into employee table
		String insert_query = "insert into employee values(101,'John','Doe',30)";
		//statement
		Statement st=con.createStatement();
		//to know the number of records inserted
		int countOfInsertedRows=st.executeUpdate(insert_query);
		System.out.println("record inserted successfully");
		System.out.println("No of records inseted : "+countOfInsertedRows);
		 con.close();
	}
}
