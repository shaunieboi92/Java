package testest.Interface;

import testest.great1;

public abstract class implementer extends great1 implements test2 {

	@Override
	public void sayHello() {
		System.out.println("hello you!");
	}
	//doshit is not written here
	//but being subclassed
	

	@Override
	public int sum2() {
		// TODO Auto-generated method stub
		return 5;
	}
	
}
