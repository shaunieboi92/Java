package codingChallenge;
/*READ ME
 *this code request for numbers to be input in console until "stop" is used to end the program
 *if not it will request for an integer to be input
 */
import java.io.*;
import java.util.*;
public class minMaxTest {
	public static void main (String [] args) {
		//create scanner
		Scanner scanner = new Scanner(System.in);
		//initialize min and max
		int number;//dont assign value to number first
		int min=0;
		int max=0;
		boolean first=true;
		String obj;
		
		while(true) {
			System.out.println("Please enter number");
		
			boolean isAnInt = scanner.hasNextInt();//method returns only if the next input value is a integer//returns only true or false;
			//isAnInt does not take in any arguments
			//variable isAnInt not method
			if(isAnInt==false) {
				if(scanner.next().equals("stop")) {
					System.out.println("End of application.");
					break;
					}//here you want to break
					else {obj=(String)scanner.next();
						System.out.println(obj + " is not an Integer. Please input again.");	
					}
			}
			else{//if next input is indeed true
				//scan the next number and returns the int scanned from the input
				//used in line with hasNextInt(); so first you check if it is rlly int, then you store the value as an int into a variable
				number=scanner.nextInt();
				
				if(first) {//initialize min and max to be the first number input
					//then you want to end the first by making it false
					first=false;//here first is no longer true, if not they will always make min and max = the next scanned number
					min=number;
					max=number;}
				//when it is no longer first
				if(number<min) {
					min=number;
				}
				if(number>max) {
					max=number;
				}
				//here you want to put the print while it is always true
				System.out.println("Min is : " + min + " and Max is : " + max);
			
				
				
			}scanner.nextLine();	
		}//put scanner close outside of true loop
		scanner.close();
		
	}
	
}
