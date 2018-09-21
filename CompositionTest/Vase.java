package CompositionTest;

public class Vase {
		private String flowertype;
		private String farmer;
		private int noflowers;
		
		public Vase(String flowertype, String farmer, int noflowers) {
			this.flowertype=flowertype;
			this.farmer=farmer;
			this.noflowers=noflowers;
		}
		
		public String getFlowertype() {
			return flowertype;
		}
		public String getFarmer() {
			return farmer;
		}
		public int getNoFlowers() {
			return noflowers;
		}
		//here if we want to return the value and set the value to be printed inside the main statement, there must be a get and set statement.
		/*int x=this.noflowers;
		String y=this.flowertype;
		String z=this.farmer;*/
		public void lookAtFlowers() {
			System.out.println("These " + noflowers + " of " + flowertype + " are grown by " + farmer);
		}
		
}
