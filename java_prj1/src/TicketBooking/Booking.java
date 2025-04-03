package TicketBooking;

public class Booking {
	   String    Booking_ID ;
	   String  Route_id ;
	   int  No_of_seats;
	   int Total_am;
	public Booking(String booking_ID, String route_id, int no_of_seats, int total_am) {
		super();
		Booking_ID = booking_ID;
		Route_id = route_id;
		No_of_seats = no_of_seats;
		Total_am = total_am;
	} 
}
