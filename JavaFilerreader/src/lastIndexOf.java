
public class lastIndexOf {
	public static void main (String args []) {
		
		String name = "Shaun.com";
		String name2="dickson";
		System.out.println(name.lastIndexOf("."));
		System.out.println(name.substring(0,5));
		//substring will print from the start element to the end element inclusive
		System.out.println(name.substring(0,name.lastIndexOf(".")));
		System.out.println(name.contains("."));
		
		//here we use conditional operator ?:  or ternary operator
		// variable x =(expression)? value if true: value if false;
		//name.contains(".") will return true? hence if true, return the full name before "." if not return full name
		name=name.contains(".")?name.substring(0,5): name;
		name2=name2.contains(".")?name2.substring(0,name2.lastIndexOf(".")): name2;

		System.out.println(name);
		System.out.println(name2);
		//this will just print before the element in question
		//this will essentially print out the number of characters before the character in question
	}
}
