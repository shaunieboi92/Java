package codingChallenge;

public class ControlFlow_SwitchStatement {
	public static void main(String[] Args) {
	//instead of using if else
		
		int switchValue=3;//where switchValue is the var name;
		switch(switchValue) {
			case 1://if switchValue==1
				System.out.println("Value is 1");
				break;//code is executed once fulfiled.
		
			case 2:
				System.out.println("Value is 2");
				break;
			
			//short cut
			case 3: case 4: case 5:
				System.out.println("it was 3, 4 or 5");
				break;//must put break, if not it will execute until the next break statement
				
			default:
				System.out.println("value was neither 1 or 2");
				break;
				
			//switch used with short long, byte, char	
		}
	}
}//can only test different value for single variable type in switch statement;

