package codingChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;  


public class LargestPrime {
	public static void main(String[]args) {
		int num=-1;
		//if(isPrime(num)) {
			//System.out.println(num + " is prime");
		//}else System.out.println(num + " is not prime");
		//listPrimes(num);
		System.out.println(getLargestPrime(num));
	}
	public static List listPrimes(int number) {
		List primelist = new ArrayList();
		for(int n=1;n<=50; n++) {
			if(isPrime(n)) {
					primelist.add(n);
			}
		}return primelist;
	}
	public static boolean isPrime(int number) {
		if(number<0 || number==0 || number==1) {
			return false;
		}else {
			for(int i=2;i<number;i++) {
				if(number%i==0) {
					
					return false;
					
				}
			}
		}return true;
	}
	//public static void getLargestPrime(int number) {//must only be divisible by prime numbers
	public static int getLargestPrime(int number) {//must only be divisible by prime numbers
		if(number<0 || number==0 || number==1) {
			//System.out.println("Invalid");
			return -1;
		}else {
			Integer[] arrayPrimes = new Integer[listPrimes(number).size()];
			//convert list to array then can iterate
			//arrPrimes=listPrimes(number).toArray(arrPrimes);
			for(int i=0;i<listPrimes(number).size();i++) {
				arrayPrimes[i]=(Integer)listPrimes(number).get(i);//cast object to integer
			}//System.out.println(Arrays.toString(arrayPrimes));
			int max=arrayPrimes[0];
			for(int s: arrayPrimes) {
				if(number%s!=0) {
					continue;//continue if it is not divisible
				}
				if(s>max) {
					max=s;
				}
					
			}return max;
		}
	}
	
//Arrays.stream(array).max().getAsInt()

}
