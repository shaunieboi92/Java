package Interface;
//to use the interface, we have to use the implements keyword
public class DeskPhone implements ITelephone{
	//it will throw an error, because it is shouting at the developer to
	//start implementing the methods, before it can become a valid class
	private int myNumber;
	private boolean isRinging;
	
	//have to implement all the methods that is part and parcel of the contract
	//right click source, implement methods, it will link you to ITelephone
	//all methods must be implemented
	//with the appropriate params, and approprioate return type
	
	//create constructor
	public DeskPhone(int myNumber) {
		this.myNumber = myNumber;
	}
	
	@Override
	public void powerOn() {
		System.out.println("No action taken, deskphone does not have a power button");
	}
	@Override
	public void dial(int phoneNumber) {
		System.out.println("Now ringing " + phoneNumber + " on deskphone." );
	}
	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Answering the desk phone");
			isRinging = false;
		}
	}
	@Override
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber == myNumber) {
			isRinging = true;
			System.out.println("Ring ring!");
		}else isRinging = false;
		return isRinging;
	}
	@Override
	public boolean isRinging() {
		return isRinging;
	}
	
	//implement methods
	
}
