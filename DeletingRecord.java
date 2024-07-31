package com.akhila.jdbc;
import java.sql.*;
public class DeletingRecord {

	public static void main(String[] args) throws Exception {
	// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/crud_lab";
		String UserName = "root";
		String Password = "root";
		Connection con=DriverManager.getConnection(url,UserName,Password);
		//delete query to delete all records
		String delete_query = "delete from employee";
		Statement st=con.createStatement();
		//counting number of records deleted;
		int deleteCount=st.executeUpdate(delete_query);
		System.out.println("records deleted successfully");
		System.out.println("number of record deleted:"+deleteCount);
		con.close();
	}

}
