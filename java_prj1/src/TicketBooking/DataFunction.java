package TicketBooking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;


public class DataFunction {
	
	    static HashMap<String, BusRoute> hmt1 = new HashMap<>();
	    
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
		
		// Read the data from BusRoute database and store it in HashMap hmt1
		public static void getdata() throws ClassNotFoundException, SQLException
		{
				Connection con = DataFunction.connect();
				String dis = "select * from busroute";
				java.sql.Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(dis);
			while(rs.next())
			{
				
				hmt1.put(rs.getString(1),new BusRoute(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getInt(6)));
			}
		}
		
         // putdatab function for insert the data in the booking table and update the remaining seats in the busroute table.
		public static void putdata(String b_id,String r_id,int n) throws ClassNotFoundException, SQLException
		{
			
			Connection con = DataFunction.connect();
			
			BusRoute br = hmt1.get(r_id);
			
			if(n <= br.Remaining_seats) 
			{
					String input = "insert into booking values(?,?,?,?)";
				    PreparedStatement ptmt = con.prepareStatement(input);
					ptmt.setString(1,b_id);
				    ptmt.setString(2, r_id);
				    ptmt.setInt(3, n);
				    ptmt.setInt(4, br.Cost*n);
				    ptmt.execute();
			    
					String up = "update busroute set Remaining_seats = ? where Route_ID = ?";
					PreparedStatement ptmt2 = con.prepareStatement(up);
					ptmt2.setInt(1, br.Remaining_seats-n);
					ptmt2.setString(2, r_id);
					ptmt2.execute();
					System.out.println("Data Put in the Booking Table");
			}
			else
			{
				    System.out.println("Out Of Seats, Next Time...!");
			}
		}

}
