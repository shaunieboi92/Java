package test1;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class test2 {
	public static void main(String[] args) throws IOException {
	    //Blank workbook
	    XSSFWorkbook workbook = new XSSFWorkbook();

	    //Create a blank sheet
	    XSSFSheet sheet = workbook.createSheet("Employee Data");

	    //This data needs to be written (Object[])
	    Map<String, Object[]> data = new TreeMap<String, Object[]>();
	    data.put("1", new Object[]{"ID", "NAME", "LASTNAME"});
	    data.put("2", new Object[]{1, "Amit", "Shukla"});
	    data.put("3", new Object[]{2, "Lokesh", "Gupta"});
	    data.put("4", new Object[]{3, "John", "Adwards"});
	    data.put("5", new Object[]{4, "Brian", "Schultz"});

	    //Iterate over data and write to sheet
	    Set<String> keyset = data.keySet();

	    int rownum = 0;
	    for (String key : keyset) 
	    {
	        //create a row of excelsheet
	        Row row = sheet.createRow(rownum++);

	        //get object array of prerticuler key
	        Object[] objArr = data.get(key);

	        int cellnum = 0;

	        for (Object obj : objArr) 
	        {
	            Cell cell = row.createCell(cellnum++);
	            if (obj instanceof String) 
	            {
	                cell.setCellValue((String) obj);
	            }
	            else if (obj instanceof Integer) 
	            {
	                cell.setCellValue((Integer) obj);
	            }
	        }
	    }
	    try 
	    {
	        //Write the workbook in file system
	        FileOutputStream out = new FileOutputStream(new File("C:\\Users\\shaun.lee\\eclipse-workspace\\JavaFileReader2\\Employeedata.xlsx"));
	        workbook.write(out);
	        out.close();
	        System.out.println("Employeedata.xlsx written successfully on disk.");
	    } 
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    
	    
	    //read file
	    
	  
	        InputStream ExcelFileToRead = new FileInputStream("C:\\Users\\shaun.lee\\eclipse-workspace\\JavaFileReader2\\Employeedata.xlsx");
	        XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead);

	        XSSFWorkbook test = new XSSFWorkbook(); 

	        XSSFSheet sheet1 = wb.getSheetAt(0);
	        XSSFRow row; 
	        XSSFCell cell;

	        Iterator rows = sheet1.rowIterator();

	        while (rows.hasNext())
	        {
	            row=(XSSFRow) rows.next();
	            Iterator cells = row.cellIterator();
	            while (cells.hasNext())
	            {
	                cell=(XSSFCell) cells.next();

	                if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
	                {
	                    System.out.print(cell.getStringCellValue()+" ");
	                }
	                else if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
	                {
	                    System.out.print(cell.getNumericCellValue()+" ");
	                }
	                else
	                {
	                    //U Can Handel Boolean, Formula, Errors
	                }
	            }
	            System.out.println();
	        }
	        
	       
	    

	    
	
	}
}
