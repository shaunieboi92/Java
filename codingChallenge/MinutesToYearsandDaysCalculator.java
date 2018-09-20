package codingChallenge;

public class MinutesToYearsandDaysCalculator {
	
	public static final String INVALID_VALUE = "Invalid Value";
	public static void main(String[] Args) {
		printYearsAndDays(1051200);
	}
	public static void printYearsAndDays (long minutes) {
		long XX=minutes;
		long YY=XX/(60*24*365);
		long ZZ=(XX%(60*24*365))/60/24;//enough to make up days but not enough for year but must convert back to days
		if (minutes<0) {
			System.out.print(INVALID_VALUE);
		}
		System.out.println(XX + " min = " + YY + " y and " + ZZ + " d");
	}
}
