package Interface;

public class Main {
//interfaces in java terms specify methods that a particular java class
	//that implements the interface must implemet
	//the inteface is abstract, only supplies the names and parameters
	//use interface to create common behavior
	public static void main(String args[]) {
		//ITelephone timsPhone;
		//you cannot instantiate timsphone with ITelephone timsPhone = ITelephone timsPhone;
		//you can instantiate with both datatype/class Deskphone or ITelephone
		//but here you want to use the interface type, because both classes MobilePhone
		//and DeskPhone implements it
		//if we declare as DeskPhone timsPhone; it will return error when doing for
		//timsPhone = new MobilePhone(XXXXX)
		ITelephone timsPhone;
		timsPhone = new DeskPhone(123456);
		timsPhone.powerOn();
		timsPhone.callPhone(123456);
		timsPhone.answer();
		
		
		timsPhone = new MobilePhone(24565);
		//timsPhone.powerOn();when this is commented out, since powerOn is null/false, it will not turn display
		timsPhone.powerOn();
		timsPhone.callPhone(24565);
		timsPhone.answer();
		
	}
}
