package TicketBooking;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Ticket_Booking {
	static Scanner sc = new Scanner(System.in);
	
	// Display function for BusRoute table 
	public static void display_BusRoute() throws ClassNotFoundException, SQLException
	{
		Connection con = DataFunction.connect();
		String dis = "select * from busroute";
		java.sql.Statement stmt = con.createStatement();
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n", "Route_ID", "From_place", "To_place", "Total_seats", "Remaining_seats", "Cost");
        System.out.println();
		ResultSet rs = stmt.executeQuery(dis);
		while(rs.next())
		{
			
			System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n",rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getInt(6));
		}
	}
	
	// Seat Booking function
	public static void book_seat() throws ClassNotFoundException, SQLException
	{
		
		System.out.println("Enter the Booking ID : ");
		String b_id = sc.next();
		
		System.out.println("Enter the Route ID : ");
		String r_id = sc.next();
		
		System.out.println("Enter the No.Of.Seats : ");
		int set = sc.nextInt();
		DataFunction.putdata(b_id, r_id, set);
	}
	
	// Display function for Booking table
	public static void display_Booking() throws ClassNotFoundException, SQLException
	{
		Connection con = DataFunction.connect();
		String dis = "select * from booking";
		java.sql.Statement stmt = con.createStatement();
        System.out.printf("\n%-12s %-12s %-12s %-12s\n", "Booking_ID", "Route_ID", "No_of_seats", "Total_am");
        System.out.println();

		ResultSet rs = stmt.executeQuery(dis);
		while(rs.next())
		{
			
			System.out.printf("%-12s %-12s %-12s %s\n",rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4));
		}
	}
	
	// Grand total function for calculate the total amount of booking
	public static void Grand_total() throws ClassNotFoundException, SQLException
	{
		
		Connection con = DataFunction.connect();
		String tt = "select sum(total_amt) from booking";
		java.sql.Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(tt);
		
		while(rs.next())
		System.out.println("Grand Total : "+rs.getInt(1));
	}
}
