package CompositionTest;

import CompositionPC.Resolution;

public class Table {
	//we want to make a vase a component of Table
	//here we specify dimensions
	private String model;
	private String manufacturer;
	private Dimensions dimensions;
	private Vase vase;
	
	public Table(String model, String manufacturer, Dimensions dimensions, Vase vase) {
		this.model=model;
		this.manufacturer=manufacturer;
		this.dimensions=dimensions;
		this.vase=vase;
	}
	
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public Dimensions getDimensions() {
		return dimensions;
	}
	public Vase getVase() {
		return vase;
	}
	public void setVase(Vase vase) {
		this.vase=vase;
	}
}
