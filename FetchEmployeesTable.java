package com.akhila.jdbc;
import java.sql.*;
public class FetchEmployeesTable {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/crud_lab";
		String UserName = "root";
		String Password = "root";
		Connection con=DriverManager.getConnection(url,UserName,Password);
		//sql query to display entire table
		String select_query="select * from employee";
		Statement st=con.createStatement();
		ResultSet rs =st.executeQuery(select_query);
		//displaying the table
		while(rs.next())
		{
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
		}
		 con.close();
	}
}
