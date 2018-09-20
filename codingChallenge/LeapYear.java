package codingChallenge;

public class LeapYear {
	public static void main(String[] args) {
		isLeapYear(0);
	}
	
	
	public static boolean isLeapYear(int year) {
		if (year <1 || year >9999) {
			System.out.println("Error");
			return false;
		}else if ((year%4==0 && year%100 !=0)||(year%400==0)){
			System.out.println(year + " years is a leap year");
			return true;
		}
			System.out.println(year + " years is not a leap year");
			return false;
	}
}
