package JavaCollections;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
	private final String theatreName;
	
	private List <Seat>seats = new ArrayList<>(); 
	

	public Theatre(String theatreName, int numRows, int seatsPerRow) {//constructor for theatre
		this.theatreName = theatreName;
		int lastRow = 'A' + (numRows -1);//this is purely ASCII conversion
		for(char row = 'A'; row<= lastRow; row++) {
			for(int seatNum =1; seatNum<= seatsPerRow; seatNum++) {
				//%02d means format the integer with 2 digits left padding with 0
				Seat seat =new Seat(row+ String.format("%02d", seatNum));
				seats.add(seat); //here we are adding seat from class Seat to ArrayList in Seat
			}
				
		}
	}public String getTheatreName() {
		return theatreName;
	}
	
	public boolean reserveSeat(String seatNumber) {
		Seat requestedSeat = null;//no such seat
		for(Seat seat: seats ) {
			if(seat.getSeatNumber().equals(seatNumber)) {
				requestedSeat = seat;//here seat is an object, we assign requestedSeat to the seat object 
				break;
			}
		}
		if(requestedSeat == null) {
			System.out.println("There is no seat " + seatNumber);
			return false;
		}
		return requestedSeat.reserve();//here we are returning that the requested seatobject--> reservation is boolean true or false;
		
		
		
	}
	//for testing
	public void getSeats() {
		for(Seat seat: seats) {
			System.out.println(seat.getSeatNumber());
		}
	}
	//create internal class
	private class Seat {
		private final String seatNumber;
		
		private boolean reserved = false;
		
		public Seat(String seatNumber) {
			this.seatNumber = seatNumber;
		}
		public boolean reserve() {
			if(!this.reserved) {
				this.reserved = true;//here we are able to reserve if it is not reserved
				System.out.println("Seat " + seatNumber + " will be reserved.");
				return true;
			}else {
				System.out.println("Seat " + seatNumber + " is already reserved.");
				return false;
			}
		}
		public boolean cancel() {
			if(this.reserved) {//if the seat is already reserved, then we can cancel it
				this.reserved = false;
				System.out.println("Reservation of seat " + seatNumber + "is cancelled.");
				return true;
			}else {
				return false;
			}
		}public String getSeatNumber() {
			return seatNumber;
		}
	}
	
}
