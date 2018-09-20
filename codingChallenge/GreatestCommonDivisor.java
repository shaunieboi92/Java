package codingChallenge;

public class GreatestCommonDivisor {
	public static void main (String[]args) {
		int first=1010;
		int second=10;
	System.out.println(getGreatestCommonDivisor(first,second));
	}
	
	public static int getGreatestCommonDivisor (int first, int second) {
		if(first<10 || second<10) {
			return -1;
		}else {
			int gcd=1;
			for( int i=1;i<= first && i<=second ; i++) {
				if(first%i==0 && second%i==0) {
					gcd=i;
				}
					
			}return gcd;
			
		}
	}
}
