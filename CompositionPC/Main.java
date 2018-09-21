package CompositionPC;
//composition is not a component of OOP

public class Main {
	public static void main (String []args) {
		Dimensions dimension = new Dimensions(20,20,5);
		//here dimension is pointing to a new object reference for the PC, and stored 
		Case theCase = new Case ("2200","Dell", "240", dimension);
		
		Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27, new Resolution(2540,1440) );
		//here we are not creating a new object variable
		//i.e. Resolution nativeResolution = new Resolution
		//we can just set it inside the object Monitor with parameters set inside;
	
		Motherboard theMotherboard= new Motherboard("BJ-200","Asus",4,6,"v2.44");
		
		PC thePC=new PC(theCase, theMonitor, theMotherboard);
		
		//if want to draw someting using the monitor,how to go access it using PC
		//we access class within classes, this is the basis of the java lib
		thePC.powerUp();
	
	}
}
