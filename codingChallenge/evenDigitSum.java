package codingChallenge;

public class evenDigitSum {
	public static void main (String []args) {
		System.out.println(getEvenDigitSum(2452258));
	}
	
	public static int getEvenDigitSum ( int number) {
		if(number<0) {
			return -1;
		}
		else {
			int sum =0;
			while(number>0) {
				//extract least significant digit
				int digit = number%10;//return final number
				if(digit%2==0) {//if final number is odd, continue
					sum+=digit;
					number/=10;//drop number after summing
				}	else {
					number/=10;//else just drop
				}
					
			}return sum;
		}
	}
		
	
}
