package codingChallenge;

public class isPrime {
	public static void main(String[] Args) {
		//to list out the prime numbers
		
		for(int x=1;x<50;x++) {
			if(isPrime(x)) {
				System.out.println(x + " is a prime");
			}
		}
	
	}
	public static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}else {
			for(int i=2; i<n;i++) {
				if(n%i==0) {
					return false;
				}
			}
		}
		return true;
	}
	
}
