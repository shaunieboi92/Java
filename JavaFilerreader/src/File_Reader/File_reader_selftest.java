package File_Reader;

//for io implementation need to import a few things
//import java.io.* where it allows all functions underneath
//import util scanner

import java.io.*;
import java.util.*;

public class File_reader_selftest {
	//start main class
	public static void main(String[]args) {
		//use the File class under java.io.File
		//input the name of the format file that you want to input
		//now we try with doc
		File file = new File("test2.xlsm");
		
		//here we want to catch IOException
		//the exception is the a human generated exception
		//use the conventional try catch 
		
		try {
			
			//PrintWriter will print formated representations in text
			//PrintWriter <variable name> = new PrintWrite(file variable name)
			//PrintWriter is part of java.io
			
			PrintWriter output = new PrintWriter(file);
			output.println("Scores");
			
			//print next line with a array
			Integer[] score = {24,54,65,21,99,100,43,23}; //use Integer wrapper class to contain instead of int
			List<Integer> Score = Arrays.asList(score);
			//now the array is stored as a list
			//then we print it into the excel table
			//this takes up one cell in excel as [xxxx] format
			output.println(Score);
			//if we want to split into individual cells, we must use nextln using enhanced for loop
			for (int s : Score) {
				output.println(s);
			}
			//close the output
			
			output.close();
		}//then we include a catch
			catch (IOException exception) {
				System.out.printf("error: %s\n",exception);
			}//here after compilation we can test for the existence of the file in the proj folder
	}
}
