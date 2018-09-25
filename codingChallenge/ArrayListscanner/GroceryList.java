package ArrayListscanner;

import java.util.ArrayList;

public class GroceryList {
	//unlike types i.e. int
	//ArrayList can hold Objects
	//ArrayList<type>
	//ArrayList is a class - rmb what we learnt for composite
	private ArrayList<String> groceryList = new ArrayList<String> ();
	
	public void addGroceryItem(String item) {
		//use .add to the ArrayList
		groceryList.add(item);
	}
	public void printGroceryList() {
		System.out.println("You have " + groceryList.size() + " items in your grocery list");
		for(int i=0; i<groceryList.size();i++) {
			System.out.println((i+1) + ". " + groceryList.get(i));
			//here you will set the numbering starting from 1. item(1)
			//to access an element within an ArrayList, use .get method
		}
	}
	
	public void modifyGroceryItem(int position, String newItem) {
		groceryList.set(position, newItem);
		System.out.println("Grocery item " + (position +1)+ " has been modified.");
		//.set replace item with that position
		//comp starts from 0, hence position +1;
	}
	public void removeGroceryItem(int position) {
		String theItem=groceryList.get(position);
		groceryList.remove(position);
		//position is the index in the arraylist
		//arraylist.get(position) returns the item contained
	}
	//contains function which checks whether it contains the following element
	
	public String findItem(String searchItem) {
		//fast search
		//boolean exists = groceryList.contains(searchItem);
		//returns true or false;
		//you want to return the item back
		//use index function
		int position = groceryList.indexOf(searchItem);
		//returns index position of that item upon searching
		//returns -1 if doesnt exist
		if(position>=0) {
			return groceryList.get(position);
		}return null;
		
	}
}
