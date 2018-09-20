package codingChallenge;
import java.lang.*;

public class NumberToWords {
	public static void main (String[]args) {
		System.out.println(numberToWords(10));
		//System.out.println(getDigitCount(2100));
		//System.out.println(reverse(2100));
	}
	public static String numberToWords (int number) {
		String finalnumber="";
		if(number<0) {
			System.out.println("Invalid Value");
		}else{
			int revnumber = reverse(number);
			int diff=getDigitCount(number) - getDigitCount(revnumber);
			while(revnumber!=0) {
				int lastDigit = revnumber%10;
				
				switch(lastDigit) {
				case 0: 
					finalnumber += "ZERO ";
					break;
				case 1:
					finalnumber += "ONE ";
					break;
				case 2:
					finalnumber += "TWO ";
					break;
				case 3:
					finalnumber += "THREE ";
					break;
				case 4:
					finalnumber += "FOUR ";
					break;
				case 5:
					finalnumber += "FIVE ";
					break;
				case 6:
					finalnumber += "SIX ";;
					break;
				case 7:
					finalnumber += "SEVEN ";
					break;
				case 8:
					finalnumber += "EIGHT ";
					break;
				case 9:
					finalnumber += "NINE ";
					break;}
					
				revnumber/=10;
				
				
			}for(int i=1; i<=diff;i++) {
				finalnumber += "ZERO ";
			}
		}return finalnumber;
	}
	public static int reverse (int number) {
		String strevnumber="";//reverse set to be blank
		String stnumber = Integer.toString(number);
		
		int length=stnumber.length();
		for(int i=length-1; i>=0;i--) {
			strevnumber =  strevnumber + stnumber.charAt(i);
		}
		int revnumber=Integer.parseInt(strevnumber);
		return revnumber;
	}
	public static int getDigitCount (int number) {
		int digit=number;
		int i=0;
		while(digit!=0) {
			digit/=10;
			i++;
			
		}return i;
	}
}
/*
String Rn2S="";//reverse set to be blank
String n2S = Integer.toString(Math.abs(number2));
int length=n2S.length();
for(int i=length-1; i>=0;i--) {
	Rn2S =  Rn2S + n2S.charAt(i);
*/