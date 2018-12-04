package Interface;

//here we create interface instead of class
//define just the method that the class that implements the interface needs to implement
public interface ITelephone {
//	//here we are creating the signature
//	public void powerOn();
//	public void dial(int phoneNumber);
//	//however we not not actually defining the params
//	//the class that inherits this interface does it
//	//we are simply defining the methods that form this interface
//	public void answer();
//	public boolean callPhone(int phoneNumber);
//	public boolean isRinging();
//	//hence for a class that is going to implement from this interface
//	//this are the methods that it has to implement
	//we can remove public, because it works in the class itself whether isit a private or public
	void powerOn();
	void dial(int phoneNumber);
	void answer();
	boolean callPhone(int phoneNumber);
	boolean isRinging();
	
}
