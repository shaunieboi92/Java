package codingChallenge;

public class DayOfWeek {
	public static void main(String[] Args) {
		printDayOfWeek(2);
	}
	
	public static void printDayOfWeek(int day) {
	
		switch(day) {
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
				
			default:
				System.out.println("Invalid day");
				break;
		}
		
	}
}
