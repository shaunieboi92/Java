package JavaCollections;

public class Main {
	public static void main(String[] args) {
		Theatre theatre =  new Theatre("GoldenVillage", 8, 12);
		theatre.getSeats();
	//make reservation
		if(theatre.reserveSeat("H1X1")) {//if reservation is true;
			System.out.println("Please pay");
		}else {
			System.out.println("Sorry, seat is taken");
		}
//		if(theatre.reserveSeat("H11")) {
//			System.out.println("Please pay");
//		}else {
//			System.out.println("Sorry, seat is taken");
//		}
	}
}
