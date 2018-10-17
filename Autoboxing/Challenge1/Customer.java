package Autoboxing.Challenge1;
import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Double> transactions;
	
	//set constructor
	public Customer(String name, double initialAmount) {
		this.name=name;
		this.transactions = new ArrayList<Double>();
		//same as ArrayList<Double>transactions = new ArrayList<Double>(
;	
		addTransactions(initialAmount);
	}
	public void addTransactions(double amount) {
		this.transactions.add(amount);
	}
	
	public String getName() {
		return name;
	}
	//return transaction list
	public ArrayList<Double> getTransactions(){
		return transactions;
	}
}
