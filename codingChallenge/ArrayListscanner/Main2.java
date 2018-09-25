package ArrayListscanner;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	//instantiate a new arraylist
	private static GroceryList grocerylist = new GroceryList();
	
	public static void main(String[]args) {
		boolean quit=false;
		String choice;
		printInstruction();
		while(!quit) {
			System.out.println("\n");
			System.out.println("Enter your choice: ");
			choice = scanner.next();
			scanner.nextLine();
			//instead of registering choice as an integer, if you want to ensure that the integers in the form of string are met
			//just use string instead.instead of Integer.parseInt. 
			//Any values<String> not met will be reached by default.
				switch(choice) {
					case "0":
						printInstruction();
						break;
					case "1":
						grocerylist.printGroceryList();
						break;
					case "2":
						addItem();
						break;
					case "3":
						modifyItem();
						break;
					case "4": 
						removeItem();
						break;
					case "5":
						searchforItem();
						break;
					case "6":
					case "quit":{
						System.out.println("End of Application");
						quit=true;
						break;
					}
					default:
						System.out.println("Invalid, please input correct choice");
				}
			
			//else System.out.println("Invalid, please enter valid choice");
				
		}
		
	}
	
	public static void printInstruction() {
		System.out.println("\n Press");
		System.out.println("\t 0 - to print choice options");
		System.out.println("\t 1 - to print the list of grocery items");
		System.out.println("\t 2 - to add item to list");
		System.out.println("\t 3 - to modify item to list");
		System.out.println("\t 4 - to remove item from list");
		System.out.println("\t 5 - to search item from list");
		System.out.println("\t 6 - to quit application");

	}
	
	public static void addItem() {
		System.out.println("Please enter the grocery item:");
		//you are enclosing add item function that takes string in a void
		grocerylist.addGroceryItem(scanner.nextLine());
	}
	public static void modifyItem() {
		System.out.println("Enter item number: ");
		int itemNo=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter replacement item:");
		String newItem = scanner.nextLine();
		grocerylist.modifyGroceryItem(itemNo-1, newItem);
		//user input itemNo
		//in list, must minus 1
	}
	public static void removeItem() {
		System.out.println("Enter number: ");
		int itemNo = scanner.nextInt();
		scanner.nextLine();
		grocerylist.removeGroceryItem(itemNo);
	}
	
	public static void searchforItem() {
		System.out.println("Item to search for: ");
		String searchItem = scanner.nextLine();
		if(grocerylist.findItem(searchItem)!=null) {
			System.out.println("Found "+ searchItem + "in grocery list");	
		}else {
			System.out.print(searchItem + " not found.");
		}
	}
	
	
}
