package Encapuslation;

public class Main {
	public static void main(String []args) {
		Printer printer =  new Printer(50, true);
		System.out.println("Initial page count = " + printer.getPagesPrinted());
		int pagesPrinted = printer.printPages(4);//when we print pages 4, we will keep adding to the initial pagesPrinted
		System.out.println("Total cumulative Pages printed was " + pagesPrinted);
	
		pagesPrinted = printer.printPages(10);
		
		System.out.println("Total cumulative Pages printed was " + pagesPrinted);
		System.out.println("");
		Printer printer2 =  new Printer(50, false);
		int pagesPrinted2 = printer2.printPages(10);
		//this should return 10 pages instead
		System.out.println("Pages printed was " + pagesPrinted2);

	}

}
