package com.akhila.jdbc;
import java.sql.*;

public class JdbcDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//step 1:
		
		Class.forName("com.mysql.cj.jdbc.Driver"); //");//ojdbc14.jar	
		
		//step 2:
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");

		//jdbc:mysql://localhost:3306/studentdb","root","Naga@123");//jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger
		
		// step 3 : simple state
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery("select * from student_data");
		System.out.println("Student_ID\tFirst_Name\tLast_Name\tCity\tAge\tdate_of_joining");
		System.out.println("--------------------------------------");
		while(rs.next())0
		{
			//System.out.println(rs.getInt(1)+"\t "+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5)+"\t"+rs.getString(6));
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5)+"\t"+rs.getDate(6));
		}
		con.close();

        
	}

}
