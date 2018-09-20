package codingChallenge;

public class DecimalComparator {
	public static void main(String[] args) {
		System.out.println(areEqualByThreeDecialPlaces(5.44));
	}
	
	
	public static double areEqualByThreeDecialPlaces(double num1) {
		return Math.round(num1);
	}
}
