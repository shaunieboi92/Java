package codingChallenge;
//create a wrappper class
public class DecimalComparator2 {
	
	public static void main(String[] args) {
		areEqualByThreeDecimalPlaces(3.1756);
		}

	public static void areEqualByThreeDecimalPlaces(double num1) {
		double result=num1%1;
		System.out.println("the decimal of " + num1 + "is " + result);
	}
	
}