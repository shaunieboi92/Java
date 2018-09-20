package codingChallenge;

import java.math.RoundingMode;
import java.text.DecimalFormat;

//create a wrappper class
public class DecimalComparator3 {
	//2 arguments
	public static void main(String[] args) {
		areEqualByThreeDecimalPlaces(3.012,2.0121);
		}

	public static void areEqualByThreeDecimalPlaces(double num1,double num2) {
		
		DecimalFormat df = new DecimalFormat ("0.000");
		//df will now round to 3 dec places, but not extract exact number of 0.175
		//hence need to use RoundingMode
		df.setRoundingMode(RoundingMode.DOWN);
		String result1=df.format(num1%1);
		String result2=df.format(num2%1);
		
		System.out.println("the 3 decimals of " + num1 + " and " + num2 + "is " + result1 + " and " +result2);
		
		/*if(result1==result2) {*/
		//cannot use == for strings, since == compares objects, not its value
		//use Objects.equals() where Objects is item 1 u want to test, and item2 is in the parentheses
		if(result1.equals(result2)) {
			System.out.println("the 3 decimals are the same");
		}else {
			System.out.println("the 3 decimals are not the same");
		}
	}
	
}