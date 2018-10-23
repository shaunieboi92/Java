package test1;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.*;

public class test1 {
   public static void main(String[] args)throws Exception {

      //Create file system using specific name
      File file = new File("test2.xls");
      PrintWriter output = new PrintWriter(file);
      output.println("Scores");
      Integer[] score = {24,54,65,21,99,100,43,23}; //use Integer wrapper class to contain instead of int
		List<Integer> Score = Arrays.asList(score);
		output.println(Score);
      //write operation workbook using file out object 
  
      output.close();
      System.out.println("createworkbook.xlsx written successfully");
      
      try {
    	  Scanner input = new Scanner(file);
    	  while(input.hasNextLine()) {
    		//for reading the next line from input string
    		  System.out.printf(input.nextLine());
    	  }
      }catch (FileNotFoundException ex) {
    		  System.out.printf("Please choose a different file %s\n", ex);
      }
      
   }
}