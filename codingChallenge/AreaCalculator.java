package codingChallenge;

public class AreaCalculator {
	
	//public static final double PI = 3.14159;

	public static void main(String[] Args) {
		
	}
	
	public static double area (double radius) {
		if(radius<0) {
			return -1.0;
		}
		return Math.PI*Math.pow(radius, 2);
	}
	
	public static double area (double x, double y) {
		if(x<0 || y<0) {
			return -1.0;
		}
		return x*y;
	}
	
}
