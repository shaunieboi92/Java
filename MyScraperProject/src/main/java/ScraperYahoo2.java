import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.w3c.dom.css.Counter;

public class ScraperYahoo2 {
	private static String counterName;
	private static String UrlName;
	static boolean isValid = false;
	
	public static void main(String[] args) {
		String counter = requestCounter();
		if(counter==null) {
			return;
		}else retrieveStockInfo(counter);
	}
	
	//create data extraction
	public static String requestCounter() {
		Scanner s = new Scanner(System.in) ;
		System.out.println("Please enter a counter");
		String counterName = s.next();
		UrlName = "https://finance.yahoo.com/quote/" + counterName;
	    URI uri = null;

		try {
			uri = new URI(UrlName);
			//System.out.println(UrlName);
		    // perform checks for scheme, authority, host, etc., based on your requirements
    		isValid = true;
    		System.out.println("Valid counter\n");
    		Thread.sleep(1000);
    		System.out.println("loading...\n");
    		Thread.sleep(1000);
    		System.out.println(counterName);
    		return counterName;
	    	
		} catch (URISyntaxException | InterruptedException e) {
			JOptionPane.showMessageDialog(null, "Error 400, Invalid input URI " + uri);
		    return null;
		}
	}
	public static void retrieveStockInfo(String counterName) {
		HashMap<String, String> map = new HashMap<>();
		try {
		Document doc = Jsoup.connect("https://finance.yahoo.com/quote/" + counterName).userAgent("Mozilla").get();

		//get the root element
		for(Element e : doc.select("table")){
			Elements rows = e.select("tr");
			for (int i = 0; i < rows.size(); i++){
	            Elements data = rows.get(i).select("td");
	            for (int k = 0; k < data.size(); k++){
                    //go through td data of row and print out
                    map.put(data.get(0).text(), data.get(1).text());
                }
			}
		}
		//if(map.containsKey("Previous Close")) {System.out.println("Exist");}
		//else System.out.println("none");
		//System.out.println(map.get("Previous Close"));
		//use lambda get all map set
		map.entrySet()
	    .stream()
	    .sorted(Comparator.comparing(Map.Entry::getValue))
	    .forEach(System.out::println);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Invalid URL!");
		}
	}

}