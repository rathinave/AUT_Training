package jdbc;

import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

public class JDBC_Connect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String jdbcURL = "jdbc:mysql://localhost:3306/mydb1";
		String dbuname = "root";
		String dbpwd = "Password@12";
		
		// load the JDBC driver 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Establish a connection 
		Connection con = DriverManager.getConnection(jdbcURL,dbuname, dbpwd);
		
		// Create a statement
		Statement stmt = con.createStatement();
		
		// Execute a query
		String q = "select * from student"; // student table
		
		String p = "insert into student values(?,?,?,?,?);";
		
		//  insert a values in the table
		PreparedStatement ptmt = con.prepareStatement(p);
		ptmt.setInt(1, 111);
		ptmt.setString(2, "Ravi");
		ptmt.setInt(3, 97);
		ptmt.setInt(4, 60);
		ptmt.setInt(5, 22);
		
		// delete a data in a table 
		String d = "delete from student where sid = ?";
		PreparedStatement ptmt1 = con.prepareStatement(d);
		ptmt1.setInt(1,111);
		
		// check the result of query execution
//		int res = ptmt1.executeUpdate(); 
//		if(res >  0)
//		{
//			System.out.println("Delete Updated Successfully...!");
//		}
		
		ResultSet rs =  stmt.executeQuery(q);
		
		while(rs.next())
		{
//			int id = rs.getInt(1);
//			String n = rs.getString(2);
//			int d_id = rs.getInt(3);
//			int m = rs.getInt(4);
//			int a = rs.getInt(5);
//			System.out.println(id+" "+n+" "+d_id+" "+" "+m+" "+a);
			
			// or 
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
		}
		
	}

}
