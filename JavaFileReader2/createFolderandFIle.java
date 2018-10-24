package test1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class createFolderandFIle {
	public static void main (String args[]) {
		String dirPath = "C:\\Users\\shaun.lee\\eclipse-workspace\\JavaFileReader2";
		String dirName = "OUTPUT";
		String textFile = "test5.txt";
		
		File file = new File(dirPath + File.separator + dirName);
		if(!file.exists()) {
			if(file.mkdirs()) {
				System.out.println("New folder: " + dirName + " created in Directory");
			}else {
				System.out.println("Failed to created folder");
			}
		
		}

		String outputpath = file.getAbsolutePath();
		
		try {
			File resultfile = new File(outputpath + File.separator + "test5.txt");
			if(!resultfile.exists()) {
					System.out.println("New file: " + textFile + " created in Directory");
					PrintWriter outputtext = new PrintWriter(resultfile);
					outputtext.println("This is a test");
					outputtext.close();
			}else {
				System.out.println("File already exists");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
			
	}
}




