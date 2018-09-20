package Car;

public class Main {
	public static void main(String []args) {//outlander will now only take 1 input parameter -> roadServiceMonths
		Outlander outlander = new Outlander (36);
		//direction still remains at zero
		outlander.accelerate(30);
		outlander.accelerate(20);//velocity is now added by 20
		//here it is calculated based on CurrentVelocity=0;
		
		outlander.steer(30);//now the vehicle will move at velocity of 50 and direction at 30
		outlander.accelerate(40);
	}
}
