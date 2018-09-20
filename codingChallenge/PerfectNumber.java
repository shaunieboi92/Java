package codingChallenge;

public class PerfectNumber {
	
	public static void main (String[]args) {
		
		isPerfectNumber(10);
	}
	public static void isPerfectNumber (int number) {
		int sum=0;//declare variable out side of ifs if u want it to be recognized throughout.
		//the final value can be declared out of the if(loop)
		if(number<1) {
			System.out.println("Invalid");
		}else {
			//initiate positive proper divisor
			
			for(int i=1; i<number; i++) {
				if(number%i==0) {
					System.out.println(i);
					sum=sum+i;
					System.out.println("sum = " + sum);		
				}
			}
		}if(sum==number) {
			System.out.println(number + " is a perfect number!");
		}else System.out.println(number + " is NOT a perfect number!");
	}
}

//		System.out.println(number + " is a perfect number!");