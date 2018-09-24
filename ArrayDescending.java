package codingChallenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//here we want to sort input array of integers in descending order
public class ArrayDescending {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main (String []args) {
		Integer[] revIntegers = getIntegers(5);//create new array object
		for(int i=0; i< revIntegers.length;i++) {
			System.out.println("Element " + i +", typed value was " + revIntegers[i]);
		}System.out.println(Arrays.toString(revIntegers));
		
		
	}
	public static Integer[] getIntegers (int number) {
		System.out.println("Enter " + number + " integer values. \r " );
		Integer [] values =  new Integer[number];
		
		for(int i=0; i< values.length; i++) {
			values[i]=scanner.nextInt();
		}
		
		Arrays.sort(values, Collections.reverseOrder());
		//sort array in reverse order
		
		return values;
	}
	/*public static Integer[] descendingOrder (Integer[] values) {
		
		Integer [] reverseorder = new Integer[values.length];
		Arrays.sort(reverseorder, Collections.reverseOrder());
		return reverseorder;
	}*/ //cant use this because we cannot be creating a new Object non primitive array with no argument intake from the start
	//this will cause java.lang.NullPointerException
	
	
}
