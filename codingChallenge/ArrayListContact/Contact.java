package ArrayListContact;

import java.util.ArrayList;
import java.util.Scanner;

public class Contact {
	private ArrayList<String>contactListName = new ArrayList<String>();
	private ArrayList<String>contactListNumber = new ArrayList<String>();
	private static Scanner scanner = new Scanner(System.in);

	public void addContactName(String name) {
		contactListName.add(name);
	}
	public void addContactNumber(Long number) {
		 contactListNumber.add("+65 " + number);
	}
	public void printContactList() {
		//System.out.println(" Contact Name    Number ");
		for(int i=0; i<contactListNumber.size();i++) {
			System.out.println((i+1) + ". " + contactListName.get(i) + " | " + contactListNumber.get(i));
		}
	}
	public String findContact(String searchContact) {
		int position = contactListName.indexOf(searchContact);
		if(position>=0) {
			return contactListNumber.get(position);
			
		}return null;
		
	}

	public void removeContactListItem(String name) {
		int position = contactListName.indexOf(name); 
		contactListName.remove(position);
		contactListNumber.remove(position);

	}
	public void modifyContactNumber(String name, Long number) {
		int position = contactListName.indexOf(name); 
		contactListNumber.get(position);
		String newnumber = "+65 " + Long.toString(number);
		contactListNumber.set(position, newnumber);
		System.out.println("Number of " + name + " has been modified to " + number);
		//.set replace item with that position
		//comp starts from 0, hence position +1;
	}
	
	
}
