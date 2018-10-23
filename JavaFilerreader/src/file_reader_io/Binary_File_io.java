package file_reader_io;

import java.io.Serializable;

public class Binary_File_io implements Serializable{
	//object to disk --> serialization
	//disk to object --> deserialization
	//in order for the object to be serializable,
	//simply use keyword implements Serializable;
	//this type of I/O use streams of raw bytes
	//treat file like bytes, and not like text
	
	private String Name;//original private variable, 
	//public class called name instead, is a better way of identifying
	private double GPA;
	
	//constructor//make visible
	public Binary_File_io (String name, double gpa) {
		this.Name = name;
		this.GPA = gpa;
	}
	//create getter
	public String getName() {
		return this.Name;
	}
}
