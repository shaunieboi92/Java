package file_reader_io;

import java.io.*;//create Class of file contains all io API
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

//IOException is thrown whenever an input or output operation is failed.
//A FileNotFoundException is thrown whenever there is a possibility of no file

public class ObjectSerialization {//throw filenotfound exception in main
	public static void main (String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		File file = new File("students.txt");//does not exist at this point
		/*
		in ArrayList the <?> means a wildcard
		<wildcard> must link to another class i.e. Binary_File_io
		instantiate array with array name studetns link to another class
		*/
		
		
		ArrayList<Binary_File_io> students = new ArrayList<Binary_File_io>();
		students.add(new Binary_File_io("Tom", 3.921));
		students.add(new Binary_File_io("Max", 4.9245));
		students.add(new Binary_File_io("Bill", 9.9251));
		
		/*
		Write to entire collection to a file
		serialize the collection of students
		if i did not try to catch exception, must makesure main throws exception
		*/
		
		FileOutputStream fo = new FileOutputStream(file);
		//object output stream
		//it will take not the file, but the file output stream
		ObjectOutputStream output = new ObjectOutputStream(fo);
		for (Binary_File_io e : students) {
			output.writeObject(e);
		}
		//finally you want to close the code;
		output.close();
		fo.close();
		//here upon compiling you will receive a seralized file in the project folder
		
		//deserialize file back into collection
		FileInputStream fi = new FileInputStream(file);
		ObjectInputStream input = new ObjectInputStream(fi);
		ArrayList<Binary_File_io> students2 = new ArrayList<Binary_File_io>();
		
		//program generated exception, you want to catch this
		//hence use try and catch
		try {
			while(true) {
				Binary_File_io s = (Binary_File_io)input.readObject();
				students2.add(s);
			}//catch End of File exception, when do, done with reading
		}catch(EOFException ex) {//stop looping
			//add another Classnotfound exception in the main
		}
		for (Binary_File_io s : students2) {
			System.out.println(s);
		}
	
	}
}
