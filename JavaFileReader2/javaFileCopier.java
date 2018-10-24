package test1;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.swing.JOptionPane;

public class javaFileCopier {
	//create source and destination folders
	private static final String PARENT_DIR = "C:\\\\Users\\\\shaun.lee\\\\eclipse-workspace\\\\JavaFileReader2";
	private static final String SOURCE_FOLDER = "C:\\\\Users\\\\shaun.lee\\\\eclipse-workspace\\\\JavaFileReader2\\\\Source2";
	private static final String DEST_FOLDER = "Result2";
	//create source and destination files
	private static final String TEXT_FILE = "SourceFile.txt";
	private static final String TEXT_DEST_FILE = "DestFile.txt";
	
	
	public static void main (String args[]){
		
		//create new file in new source folder
		File inputFolder = new File(SOURCE_FOLDER);
		//check if SOURCE_FOLDER already exists.
		if(!inputFolder.exists()) {
			JOptionPane.showMessageDialog(null, "Input Folder does not exist. Creating new Input Folder");
		}
		File sourceText =  new File (SOURCE_FOLDER + File.separator + TEXT_FILE);
		try {
			sourceText.getParentFile().mkdirs();
			PrintWriter printWriter = new PrintWriter(sourceText);
			printWriter.println("This is a text");
			printWriter.close();
			System.out.println(TEXT_FILE + " is created in folder: " + SOURCE_FOLDER);
			
		}catch(Exception e)
	    {
	        e.printStackTrace();
	    }
		
		
		//create new folder as destination folder
		//
		//put outputFolder declaration outside to be readable by all
		File outputFolder = new File(PARENT_DIR + File.separator + DEST_FOLDER);

		try {
			if(!outputFolder.exists()) {
				if(outputFolder.mkdirs()){
					System.out.println("Destination folder created in : " + outputFolder.getAbsolutePath());
					File resultfile = new File(outputFolder.getAbsolutePath() + File.separator + TEXT_DEST_FILE);
					if(!resultfile.exists()) {
						System.out.println("New file: " + TEXT_DEST_FILE + " created in Directory");
						Path sourcePath = Paths.get(sourceText.getAbsolutePath());
						Path resultPath = Paths.get(resultfile.getAbsolutePath());
						System.out.println(sourcePath);
						Files.copy(	sourcePath, 
								resultPath,
								StandardCopyOption.REPLACE_EXISTING);
					}
				}
			}else JOptionPane.showMessageDialog(null, "Output Folder already exist.");
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
