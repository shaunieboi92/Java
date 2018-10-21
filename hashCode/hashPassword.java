package hashCode;

import java.util.*;

//Say for example you want to convert a alpha numeric password into an integer hash code
public class hashPassword {
	static HashMap<Character, Integer> map = new HashMap<>();
	
	
	
	public static void main (String args []) {
		
		//for alphabets
		/*int i =0;
		for(char a = 'A'; a<='Z';a++) {
			i++;
			//System.out.println(a);
		}System.out.println("Total of " + i + " characters.");*/
		
		//for numbers
		/*int j =0;
		for(char b = '0'; b<='9';b++) {
			j++;
			//System.out.println(b);
		}System.out.println("Total of " + j + " characters.");*/
		
		//populate key to key array
		//populate value to integer array

		
		//create new arraylist
		char [] charArray= new char [26];
		int c=0;
		for (char a='A'; a <='Z'; a++) {
			charArray[c] = a;
			//System.out.println(charArray[c]);
			c++;
			
		}//System.out.println(Arrays.toString(charArray));
		char [] numArray= new char [10];
		int d=0;
		for (char b='0'; b <='9'; b++) {
			numArray[d] = b;
			//have to use valueof for numbers to output the String representation 
			//System.out.println(String.valueOf(numArray[d]));
			d++;
		}//System.out.println(Arrays.toString(numArray));

				
		//assignment
				
		for(int i=0; i<=charArray.length-1;i++) {
			for(int j=26;j<=(charArray.length-1+10);j++) {
				map.put(charArray[i], i);
				map.put(numArray[j-26], j);
			}
		}
		Set set = map.entrySet();
		System.out.println("Set values: " + set);
	
		String inputstring = "A6HJ92B";
	    char[] inputchar = inputstring.toCharArray();
	    int sum =0;
	    for(char s: inputchar ) {
	    	System.out.println(map.get(s));
	    	sum=sum+map.get(s);
	    }System.out.println("The sum is : " +sum);


		
	}
}

		
		
