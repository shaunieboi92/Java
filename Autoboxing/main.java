package Autoboxing;

import java.util.ArrayList;

//create class
class IntClass{
	private int myValue;
	
	public IntClass(int myValue) {
		this.myValue = myValue;
	}
	public int getMyValue() {
		return myValue;
	}
	public void setMyValyue(int myValue) {
		this.myValue=myValue;
	}
	
}

public class main {
	public static void main(String args[]) {
		String [] strArray = new String[10];
		int[] intArray = new int[10];
		
		ArrayList<String> strArrayList = new ArrayList<String>();
		strArrayList.add("Tim");
		
		System.out.println(strArrayList);
		
		//type argumentcannot use int since int is primitive type
		//primitive type is not a class, we need a class reference to ciphon to a array list
		//ArrayList<int> intArrayList = new ArrayList<int>();
		ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
		intClassArrayList.add(new IntClass(54));
		Integer integer = new Integer(54);
		Double doubleValue = new Double(12.15);
		
		//concept of autoboxing and unboxing
		//Autoboxing is where u put a primitive type value into an Integer - non primitive type
		ArrayList<Integer> intArrayListprim = new ArrayList<Integer>();
		ArrayList<Integer> intArrayListnonprim = new ArrayList<Integer>();

		for(int i = 0; i<=10;i++) {
			intArrayListprim.add(i);
			intArrayListnonprim.add(Integer.valueOf(i));
		}
		System.out.println(intArrayListprim);
		System.out.println(intArrayListnonprim);
//they have the same inptu
		
		//unboxing is when you convert a Integer type into a primitve
		for(int i=0 ; i<=10; i++) {
			System.out.println(i + " --> " + intArrayListnonprim.get(i).intValue());
		}//take from the class, the object wrapper
		for(int i=0 ; i<=10; i++) {
			System.out.println(i + " --> " + intArrayListprim.get(i).intValue());
		}
		
		Integer myIntValue = 56;
		//Integer is a class
		//java does the hard work of compiling
		//at compiled time the value is 56;
		//in actual before compiling, Integer myIntValue = Integer.valueOf(56);
		int myInt = myIntValue;
		//here we see that a primitive type equates to a object/non primitive type;
		//java does this
		//myInt.intValue.intValue()
		//intValue() returns int value
		
		ArrayList<Double>myDoubleValues = new ArrayList<Double>();
		for(double dbl=0.0; dbl<=10.0; dbl+=0.5) {
			myDoubleValues.add(Double.valueOf(dbl));
		}
		for(int i=0; i<myDoubleValues.size();i++){
			double value= myDoubleValues.get(i).doubleValue();
			System.out.println(i + " --> " + value);
		}
	
	}
	
	
	
}
