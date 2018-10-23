package File_Reader;

import java.io.*;//import java.io.File
import java.util.Scanner;
//we practice writing to a file
//where to find? will be same location as project

public class File_reader {
	public static void main(String args[]) {  
	  File file =  new File ("test.txt");
	  //Writes to the file
	  try{
	  //Write your name and age to the file;
	  PrintWriter output = new PrintWriter(file);//this may throw and exception, hence need to catch exception
	  output.println("Mike Fudge");
	  output.println(42);
	  output.close();
	  
	  
	  }catch (IOException ex) {
		  System.out.printf("ERROR: %s\n", ex);
	  }
	  
	  //then we test reading of file
	//Read to the file
	  try {
	  Scanner input = new Scanner(file);
	  String name = input.nextLine();//for reading the next line from input string
	  int age =  input.nextInt();
	  
	  System.out.printf("Name is %s and number is %d", name,age );
	  }catch (FileNotFoundException ex) {
		  System.out.printf("Please choose a different file %s\n", ex);
	  }
	}
}