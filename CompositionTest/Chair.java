package CompositionTest;

public class Chair {
	private String model;
	private String manufacturer;
	private Dimensions dimensions;
	private int chairlegs;
	
	public Chair(String model, String manufacturer, Dimensions dimensions, int chairlegs) {
		this.model=model;
		this.manufacturer=manufacturer;
		this.dimensions=dimensions;
		this.chairlegs=chairlegs;
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
	public int getchairlegs() {
		return chairlegs;
	}
}
