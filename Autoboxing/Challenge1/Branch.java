package Autoboxing.Challenge1;
import java.util.ArrayList;

public class Branch {
	private String branchName;
	//here we create an ArrayList<class> that points to Customer Class
	private ArrayList<Customer> customers;

	public Branch(String branchName) {
		this.branchName= branchName;
		this.customers = new ArrayList<Customer>();
	}
	
	public String getBranchName() {
		return branchName;
	}
	
	public ArrayList<Customer> getCustomers(){
		return customers;
	}
	
	
	
	//method to check if customer already exist
	public boolean newCustomer(String customerName, double initialAmount) {
		if(findCustomer(customerName)==null) {
		//customerName is not found in the list, then add a new Customer class object
			//prevent duplicate
			//typically Customer varname = new Customer();
			this.customers.add(new Customer(customerName, initialAmount));
			return true;
		}else return false;
	}
	//add the findcustomer method
	
	//create add transaction method when called upon, if and only if customer name exists in database.
	public boolean addCustomerTransaction(String customerName, double amount) {
		Customer existingCustomer = findCustomer(customerName);
		
		if(existingCustomer!=null) {
			System.out.println(customerName + " has added S$" + amount);
			existingCustomer.addTransactions(amount);
			return true;
		}else return false;
	}
	//create method that is used internally so use private
	/*private Customer findCustomer(String customerName) {
		for (int i=0; i<this.customers.size(); i++) {
			if(this.customers.get(i).getName().equals(customerName)) {
				return this.customers.get(i);
				//return customerName;
				//here we are simply showing that if the customer returned from the index is equals to the customer name said,
				//then we return that customer name itself, alternatively just return customerName;
				//remember why we put null?
				//if object not equals object it will return null.
			}
		}return null;
	}*/
	
	private Customer findCustomer(String customerName) {
		for (int i=0; i<this.customers.size(); i++) {
			Customer checkedCustomer = this.customers.get(i);
			if(checkedCustomer.getName().equals(customerName)) {
				return checkedCustomer;
				
			}
		}return null;
	}
	
}
