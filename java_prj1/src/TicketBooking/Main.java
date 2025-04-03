package TicketBooking;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Ticket_Booking.display_BusRoute();
		
    	DataFunction.getdata();
	
		Ticket_Booking.book_seat();
		
		Ticket_Booking.display_Booking();
		
		Ticket_Booking.Grand_total();
	}

}
