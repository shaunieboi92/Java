package CompositionTest;

import CompositionPC.Case;

public class House {
	public static void main (String []args) {
		
		//	public Table(String model, String manufacturer, Dimensions dimensions, Vase vase) {
		//public Vase(String flowertype, String farmer, int noflowers) {
		Vase vase=new Vase("Bougainvilla","Farmer Thomas",25);
		Vase vase2=new Vase("Rose","Farmer Green",4);
		
		Dimensions tableDim = new Dimensions(10,10,6);
		Table theTable = new Table("433-22-50321","COWAY",tableDim, vase);
	
		Dimensions chairDim = new Dimensions(4,4,5);
		Chair theChair = new Chair ("120-5434-001","IKEA", chairDim,4);
		
		//declare a new room in the house
		Room masterBedRoom = new Room(theTable, theChair, "Master Bedroom");
		
		//(String model, String manufacturer, Dimensions dimensions, Vase vase)
		/*masterBedRoom.getTheTable().getVase();
		masterBedRoom.setTheTable(theTable);
		theTable.setVase(vase);*/
		
		vase.lookAtFlowers();
		vase2.lookAtFlowers();
		
		
		
	}
}
