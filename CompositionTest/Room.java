package CompositionTest;

public class Room {
	private Table theTable;
	private Chair theChair;
	private String roomtype;
	
	
	public Room (Table theTable, Chair theChair, String roomtype) {
		this.theTable=theTable;
		this.theChair=theChair;
		this.roomtype=roomtype;
	}
	
	public Table getTheTable() {
		return theTable;
	}
	public Chair getTheChair() {
		return theChair;
	}
	public String getRoomType() {
		return roomtype;
	}
	public void setTheTable(Table theTable) {
		this.theTable=theTable;
	}
	public void setTheChair(Chair theChair) {
		this.theChair=theChair;
	}
	public void setRoomType(String roomtype) {
		this.roomtype=roomtype;
	}

}
