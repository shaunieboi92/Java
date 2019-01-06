package testest.Interface;

public class extender extends implementer {
	

	@Override
	public String doshit() {
		// TODO Auto-generated method stub
		return "doshit";
	}
	
	public static void main (String args[]) {
		implementer yo = new extender();
		yo.sayHello();
		System.out.println(yo.sum2());
		yo.saygood();
		System.out.println(yo.doshit());
	}
}
