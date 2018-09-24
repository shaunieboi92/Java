package Encapuslation;

public class Printer {
	private int tonerLevel;
	private int pagesPrinted=0;//initialize the pages printed to be 0, here initial pages printed will always be 0;
	private boolean duplex;
	
	public Printer(int tonerLevel, boolean duplex) {
		if(tonerLevel >=1 && tonerLevel <=100) {
			this.tonerLevel=tonerLevel;
		}else this.tonerLevel = -1;
		this.duplex=duplex;
		//here we dont take the pages printed as an argument, because we want it to return pages printed in cumulative.
	}
	
	//create method to replace toner
	//public type
	
	public int addToner(int tonerAmount) {
		if(tonerAmount >0 && tonerAmount<=100) {
			if(this.tonerLevel + tonerAmount>100) {
				return -1;
			}
			this.tonerLevel +=tonerAmount;
			return tonerLevel;
		}else return -1;
	}
	
	
	
	public int printPages(int pages) {
		int pagesToPrint=pages;
		if(duplex) {
			pagesToPrint = (pages/2)+(pages%2);
			System.out.println("Printing in duplex mode");
		}
		//this.pagesPrinted+=pagesToPrint;
		//if we are using this.pagesPrinted we will always be initializing with 0
		//i.e. if we set it to this.pagesPrinted = pagesPrinted, then we have an increasing summation.
		System.out.println("Printing in Single mode");
		pagesPrinted+=pagesToPrint;
		System.out.println("No. of pages selected to be printed is : " + pages);
		
		return pagesPrinted;//here we want to return pagesPrinted cumulative
	}public int getPagesPrinted() {
		return pagesPrinted;
		//this is built after initial pages printed + pages to print
	}

}
