package TicketBooking;

public class BusRoute {
	String Route_ID;
    String From_place;
    String To_place;
    int  Total_seats;
    int  Remaining_seats;
    int Cost;
	public BusRoute(String route_ID, String from_place, String to_place, int total_seats, int remaining_seats,
			int cost) {
		super();
		Route_ID = route_ID;
		From_place = from_place;
		To_place = to_place;
		Total_seats = total_seats;
		Remaining_seats = remaining_seats;
		Cost = cost;
	}
	public BusRoute() {
		// TODO Auto-generated constructor stub
	}
	
}
