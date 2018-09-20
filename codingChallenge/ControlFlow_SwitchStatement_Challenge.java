package codingChallenge;

public class ControlFlow_SwitchStatement_Challenge {
	public static void main(String[] Args) {

		char charValue='C';
		switch(charValue) {
		case 'A':
			System.out.println("Value is A");
			break;
		case 'B': case 'C': case 'D': case 'E': 
			System.out.println("Value is "+ charValue);
			break;
		
		default:
			System.out.println("Not any was found");
		}
		
		String month="January";
		switch(month) //to make case insentitive apply .equalsIgnoreCase
		{
		case "February":
			System.out.println("Not match");
			break;
			
		case "january": case "jAnuary": case "jaNuary": case "januarY": 
			System.out.println("Match found");
			break;
		
		default:
			System.out.println("Not any was found");
		}
	}	
}
