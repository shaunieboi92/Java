package DataExtraction;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.annotation.processing.Filer;
import javax.swing.text.AbstractDocument.BranchElement;

import org.apache.poi.xwpf.usermodel.BreakClear;

//this bufferedreader will return the url underlying html code 
//just like reading from any file format in local
public class test1 {
	private static String filename = "filename.txt";
	private static String dirPath = "C:\\Users\\shaun.lee\\eclipse-workspace\\JavaFileReader2";
 	
	
	public static void main(String[] args) throws IOException {
        String url = "https://madison.craigslist.org/search/sub";
        readFromFile(filename);
        readFromWeb(url);
    }
	 public static void readFromWeb(String webURL) throws IOException {
	        URL url = new URL(webURL);
	        InputStream is =  url.openStream();
	        try( BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }
	        }
	        catch (MalformedURLException e) {
	            e.printStackTrace();
	            throw new MalformedURLException("URL is malformed!!");
	        }
	        catch (IOException e) {
	            e.printStackTrace();
	            throw new IOException();
	        }
	 }
	 public static void readFromFile(String filename) throws IOException{
		 File file = new File(dirPath + File.separator + filename);
		 System.out.println(file.getAbsolutePath());
		 if(file!=null) {
			 try(
					FileReader fr = new FileReader(file.getAbsolutePath());
					BufferedReader br = new BufferedReader(fr)) {
		            String line =null;
		            while ((line = br.readLine()) != null) {
		                System.out.println(line);
		            }
		        }
		        catch (MalformedURLException e) {
		            e.printStackTrace();
		            throw new MalformedURLException("URL is malformed!!");
		        }
		        catch (IOException e) {
		            e.printStackTrace();
		            throw new IOException();
		        }
		 }
	 }
    	 
    	   
    
}
