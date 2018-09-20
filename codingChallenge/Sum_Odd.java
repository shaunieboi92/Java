package codingChallenge;

public class Sum_Odd {
	
	public static void main (String args[]) {
		
		int x=11;
		int start =1;
		int end =100;
		if(isOdd(x)) {
			System.out.println(x+ " is odd");
		}else System.out.println(x +" is even");
		
		System.out.println("The sum from " + start + 
				" to " + end + " is " + sumOdd(start,end));
	}
	
	public static boolean isOdd (int number) {
		if(number>0) {
			if(number%2!=0) {
				return true;
			}else return false;
		}else return false;
	}
	public static int sumOdd(int start, int end) {
		int sum=0;
		if(end>=start && start>0 &&end >0) {
			for(int i=start; i<=end; i++) {
				if(isOdd(i)) {
					sum+=i;
				}
			}return sum;
		}return -1;
	}
}
