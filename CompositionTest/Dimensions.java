package CompositionTest;

public class Dimensions {
	//here dimensions can be part of table,or room or vase etc.
	private int width;
	private int length;
	private int height;
	
	public Dimensions (int width, int length, int height) {
		this.width=width;
		this.length=length;
		this.height=height;
	}
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getLength() {
		return length;
	}
}
