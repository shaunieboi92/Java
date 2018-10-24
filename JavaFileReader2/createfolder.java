package test1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class createfolder {
	public static void main (String args[]) {
		String dirPath = "C:\\Users\\shaun.lee\\eclipse-workspace\\JavaFileReader2";
		String dirName = "OUTPUT";
		
		File file = new File(dirPath + File.separator + dirName);
		if(!file.exists()) {
			if(file.mkdirs()) {
				System.out.println("New folder: " + dirName + " created in Directory");
			}else {
				System.out.println("Failed to created folder");
			}
		
		}
		
	}
}
