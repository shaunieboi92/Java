package codingChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {
	//readIntegers() + param count that rep how many integers users needs to enter.
	//return array from readIntegers
	//findMin() array as param
	//use arrays.sort for ascending order
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[]args) {
		Integer[] myIntegers = readIntegers(10);
		System.out.println(Arrays.toString(myIntegers));
		System.out.println("The minimum is " + findMin(myIntegers));
	}
	public static Integer[] readIntegers(int count) {
		//set a new integer array with length based on count
		System.out.println("Enter " + count + " integer values. \r");
		Integer [] array = new Integer [count];
		for(int i=0; i< array.length; i++) {
			array[i]=scanner.nextInt();
		}
		return array;
		
	}
	public static int findMin(Integer[]array) {
		Arrays.sort(array);
		return array[0];
	}
	
}
