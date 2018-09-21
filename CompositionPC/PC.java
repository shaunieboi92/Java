package CompositionPC;

public class PC {
	//you will see that there is no inheritance
	//i.e. subclass extends superclass;
	//there is no instantiation 
	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;
	
	//this are composite fields
	//the PC consists of 3 other classes
	public PC (Case theCase, Monitor monitor, Motherboard motherboard) {
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
	
	public void powerUp() {
		getTheCase().pressPowerButton();
		drawLogo();
	}
	//make the fields below inaccessible outside of this class
	private void drawLogo() {
		monitor.drawPixelAt(1200, 50, "yellow");
	}
	private Case getTheCase() {
		return theCase;
	}
	private Monitor getMonitor() {
		return monitor;
	}
	private Motherboard getMotherboard() {
		return motherboard;
	}
}
