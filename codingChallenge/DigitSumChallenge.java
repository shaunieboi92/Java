package codingChallenge;

public class DigitSumChallenge {
	public static void main (String [] args) {
		int x=sumDigits(12545);
		System.out.println(x);
	}
	public static int sumDigits (int number) {
		if(number<10) {
			return -1;
		}int sum =0;
		while(number>0) {
			//extract least significant digit
			int digit = number%10;//return final number
			sum+=digit;
			number/=10;//drop final number
		
		}return sum;
	}
}
