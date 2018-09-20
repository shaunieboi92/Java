package codingChallenge;

public class LastDigitChecker {
	public static void main (String[]args) {
		if(hasSameLastDigit(26,232,52)){
			System.out.print("Yes there is same");
		}else {
			System.out.print("None");
		}
	}
	
	public static boolean hasSameLastDigit (int num1, int num2, int num3){
		if(num1 <10 || num2 <10|| num3<10 || num1 >1000|| num2>1000 || num3>1000) {
			return false;
		}else {
			int digit1 = num1%10;
			int digit2 = num2%10;
			int digit3 = num3%10;
			if(digit1==digit2|| digit2==digit3 ||digit1==digit3) {
				return true;
			}return false;
		}
	}
}
