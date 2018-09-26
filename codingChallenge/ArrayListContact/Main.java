package ArrayListContact;

import java.util.Scanner;
//here we want to create an application which works like a phone contact list
public class Main {
	private static Scanner scanner = new Scanner(System.in);
	
	private static Contact contactList = new Contact();
	
	public static void main (String []args) {
		boolean quit=false;
		String choice;
		printInstruction();
		while(!quit) {
			System.out.println("\n");
			System.out.println("Enter your choice: ");
			choice = scanner.next();
			scanner.nextLine();
			switch(choice) {	
				case "0":
					printInstruction();
					break;
				case "1":
					contactList.printContactList();
					break;
				case "2":
					addContact();
					break;
				case "3":
					modifyContact();
					break;
				case "4": 
					removeContact();
					break;
				case "5":
					searchforContact();
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
		}
		
	}
	
	public static void addContact() {
		System.out.println("Please enter name: ");
		contactList.addContactName(scanner.nextLine());
		//System.out.println("Please enter number: ");
		/*while(Long.toString(scanner.nextLong()).length()<8) {
			System.out.println("Invalid number, please key in 8 digits");
		}*/
		Long number =0000000L;
		int count=0;
		while(Long.toString(number).length()!=8) {
			count++;
			System.out.println("Please enter valid number.");
			if(count>2) {
				System.out.println("*Reminder: Please enter 8 digits.*");
			}
			number=scanner.nextLong();
		}
		contactList.addContactNumber(number);
	}
	
	
	public static void printInstruction() {
		System.out.println("\n Press");
		System.out.println("\t 0 - to print choice options");
		System.out.println("\t 1 - to print the Contact List");
		System.out.println("\t 2 - to add new Contact to to contact list");
		System.out.println("\t 3 - to modify Contact to contact list");
		System.out.println("\t 4 - to remove Contact from contact list");
		System.out.println("\t 5 - to search Contact from list");
		System.out.println("\t 6 - to quit application");

	}
	
	public static void searchforContact() {
		System.out.println("Contact to search for: ");
		String searchContact = scanner.nextLine();
		if(contactList.findContact(searchContact)!=null) { 
			System.out.println("Name: "+ searchContact + " Number: " + contactList.findContact(searchContact));

		}else {
			System.out.print(searchContact + " not found.");
		}
	}
	public static void removeContact() {
		System.out.println("Enter name: ");
		String name = scanner.next();
		scanner.nextLine();
		contactList.removeContactListItem(name);
	}
	public static void modifyContact() {
		System.out.println("Enter name: ");
		String name=scanner.next();
		scanner.nextLine();
		System.out.println("Enter replacement number:");
		Long number = scanner.nextLong();
		contactList.modifyContactNumber(name, number);
		//user input itemNo
		//in list, must minus 1
	}
	
}
