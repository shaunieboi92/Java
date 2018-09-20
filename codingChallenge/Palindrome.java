package codingChallenge;


public class Palindrome {
	public static void main(String args[]) {
		int x=-222;
		System.out.println(countDigit(x));
		isPalindrome(x);
	}
	public static int countDigit(int number) {
		//palindrome number is a number that if reversed is the same;
		/*int i=1;
		while(i<=number) {
			number/=10;
			i++;*/
		
		//alternate way
		//use log base 10 and (int)
		return (int)Math.log10(number)+1;
		
		}//return i;//return final value of i
		//%10 returns least sig digit

	public static void isPalindrome (int number2) {
		String Rn2S="";//reverse set to be blank
		String n2S = Integer.toString(Math.abs(number2));
		int length=n2S.length();
		for(int i=length-1; i>=0;i--) {
			Rn2S =  Rn2S + n2S.charAt(i);
		}if (n2S.equals(Rn2S)) {
			System.out.println(Integer.parseInt(Rn2S));
		}else System.out.println("It is not Palindrome");
		
	
		
	}
}
