package Autoboxing.Challenge1;

public class Main {
	public static void main (String args[]) {
		
		Bank bank = new Bank("National Australian Bank");
		
		bank.addBranch("Adelaide");
		bank.addCustomer("Adelaide", "Tim", 50.05);
		bank.addCustomer("Adelaide", "Mike", 40.25);
		bank.addCustomer("Adelaide", "Fred", 89.01);
	
		bank.addBranch("Singapore town");
		bank.addCustomer("Singapore town", "Shaun", 1000.05);
	
		bank.addCustomerTransactions("Singaporetown", "Shaun", 1005);
		bank.addCustomerTransactions("Adelaide", "Tim", 2005.43);
		
		bank.listCustomers("Adelaide", true);
	}
}
