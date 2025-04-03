package JDBC_prj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class JDBC_Methods {
	
	// JDBC Connection 
	public static Connection connect() throws ClassNotFoundException, SQLException
	{
	  String jdbcURL = "jdbc:mysql://localhost:3306/mydb1";
	  String dbuname = "root";
	  String dbpwd = "Password@12";
	
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection con = DriverManager.getConnection(jdbcURL,dbuname, dbpwd);
	  return con;
	}
	
	// Insertion of data method
	public static void insert(HashMap<Integer, Student> map) throws ClassNotFoundException, SQLException
	{
		Connection con = JDBC_Methods.connect();
	
		for(Map.Entry<Integer, Student> e: map.entrySet()) 
		{
			  String input = "insert into student(sid,sname,phy,chem) values(?,?,?,?);";
			  PreparedStatement ptmt = con.prepareStatement(input);
			  Student s = e.getValue();
			  ptmt.setInt(1,s.sid);
			  ptmt.setString(2, s.sname);
			  ptmt.setInt(3,s.phy);
			  ptmt.setInt(4,s.chem);
			  ptmt.execute();
		}
		System.out.println("Insertion Successfull...!");
	}
	
	// displaying method
	public static void Display() throws ClassNotFoundException, SQLException
	{
		Connection con = JDBC_Methods.connect();
		String dis = "select * from student";
		java.sql.Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(dis);
		while(rs.next())
		{
			
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getFloat(5));
		}
	}
	
	// update average in table after getting the marks
    public static void add_Avg(HashMap<Integer, Student> map) throws ClassNotFoundException, SQLException
    {
    	Connection con = JDBC_Methods.connect();
    	
    	for(Map.Entry<Integer, Student> e : map.entrySet())
    	{
    		String up = "update student set average = ? where sid = ?";
    		Student s = e.getValue();
    		float a = Student.avg(s.phy, s.chem);
    		PreparedStatement ptmt = con.prepareStatement(up);
    		ptmt.setFloat(1, a);
    		ptmt.setInt(2,s.sid);
    		ptmt.execute();
    	}
    	System.out.println("Average Updated Successfully...!");
    }
    
}
