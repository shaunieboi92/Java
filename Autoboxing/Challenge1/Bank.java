package Autoboxing.Challenge1;

import java.util.ArrayList;

public class Bank {
	//ability to add new branch
	//ability to add customer
	//ability to addCustomer transaction
	private String name;
	private ArrayList<Branch>branches;
	
	public Bank(String name) {
		this.name = name;
		this.branches = new ArrayList<Branch>();
	}
	public boolean addBranch(String branchName) {
		if(findBranch(branchName)==null) {
			this.branches.add(new Branch(branchName));
			return true;
		}return false;
	}
	
	public boolean addCustomer(String branchName, String customerName, double initialAmount) {
		Branch branch = findBranch(branchName);
		if(branch!=null) {
			return branch.newCustomer(customerName, initialAmount);
		}//aka return true;
		return false;
	}
	
	public boolean addCustomerTransactions(String branchName, String customerName, double amount) {
		Branch branch = findBranch(branchName);
		if(branch!=null) {
			return branch.addCustomerTransaction(customerName,amount);
			
		}return false;
	}
	
	private Branch findBranch(String branchName) {
		for (int i=0; i<this.branches.size(); i++) {
			Branch checkedBranch = this.branches.get(i);
			if(checkedBranch.getBranchName().equals(branchName)) {
				return checkedBranch;
			}
		}return null;
	}
	
	public boolean listCustomers(String branchName, boolean showTransactions) {
		Branch branch = findBranch(branchName);
		if(branch!=null) {//can use + branchName;
			System.out.println("Customers for branch " + branch.getBranchName());
		
			ArrayList<Customer> branchCustomers = branch.getCustomers();
			//return list of customers
			for(int i=0; i<branchCustomers.size(); i++) {
				Customer branchCustomer=branchCustomers.get(i);
				System.out.println("Customer: " + branchCustomer.getName() + " [ " + (i+1) + "]");
				if(showTransactions) {
					System.out.println("Transactions");
					ArrayList<Double> transactions = branchCustomer.getTransactions();
					for(int j=0; j<transactions.size(); j++) {
						Double transaction = transactions.get(j);
						System.out.println("[" + (j+1)+ "] " + transaction);
					}
				}
			}
			return true;
			
		}else{
			return false;
		}
	}
	
}
