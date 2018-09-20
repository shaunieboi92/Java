package codingChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;  


public class LargestPrime2 {
	public static void main(String[]args) {
		int num=45;
		//if(isPrime(num)) {
			//System.out.println(num + " is prime");
		//}else System.out.println(num + " is not prime");
		System.out.println(listPrimes(num));
		//System.out.println(getLargestPrime(num));
	}
	public static List listPrimes(int number) {
		List primelist = new ArrayList();
		for(int n=1;n<=50; n++) {
			if(n<0 || n==0 || n==1) {
				continue;
			}else {
				for(int i=2;i<number;i++) {
					if(number%i==0) {
						continue;
					}
				}
			}primelist.add(n);
		}return primelist;
	}
	
	//public static void getLargestPrime(int number) {//must only be divisible by prime numbers
	public static int getLargestPrime(int number) {//must only be divisible by prime numbers
		if(number<0 || number==0 || number==1) {
			return -1;
		}else {
			//get primes
			for(int i=2;i<number;i++) {
				if(number%i==0) {
					return -1;
				}else {
					
				}
			}
		
	
			for(int i=0;i<listPrimes(number).size();i++) {
				arrayPrimes[i]=(Integer)listPrimes(number).get(i);
			}
			int max=arrayPrimes[0];
			for(int s: arrayPrimes) {
				if(number%s!=0) {
					continue;
				}
				if(s>max) {
					max=s;
				}
					
			}return max;
		}
	}
	
//Arrays.stream(array).max().getAsInt()

}
