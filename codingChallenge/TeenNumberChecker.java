package codingChallenge;

import java.math.MathContext;
public class TeenNumberChecker {
	public static void main(String[] args) {
		hasTeen(3,3,21);
		}
	public static void hasTeen(int tn1, int tn2, int tn3) {
		if((tn1>=13 && tn1<=19) ||(tn2>=13 && tn2<=19) || (tn3>=13 && tn3<=19)) {  
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
	
	}


	
}
