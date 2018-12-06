import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
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

public class ScraperYahoo3 {
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
    		
    		Thread.sleep(1000);
    		return counterName;
	    	
		} catch (URISyntaxException | InterruptedException e) {
			JOptionPane.showMessageDialog(null, "Error 400, Invalid input URI " + uri);
		    return null;
		}
	}
	public static void retrieveStockInfo(String counterName) {
		HashMap<String, String> map = new HashMap<>();
		try {
		Document doc = Jsoup.connect("https://finance.yahoo.com/quote/" + counterName + ".SI").userAgent("Mozilla").get();
		Elements x = doc.select("#quote-header-info span");
		//get the root element
			if(x==null) {
				System.out.println("Does not exists.");
				return;
			}else {
				String line = x.text();
				String currency;
				String showCurrency;
				if(line.contains("Currency")) {
					int start = line.indexOf("Currency"); 
					int deci = line.indexOf(".",start);
					start = deci;
					//System.out.println(line);
					currency = line.substring(start-5, start -2);
					//System.out.println(currency);
					switch (currency) {
						case "SGD": showCurrency = "S$";
						break;
						default:showCurrency = "Invalid Currency";
					}
					 
					System.out.println("The Price of " + counterName.toUpperCase() + " is " + showCurrency + line.substring(start-1, start +5));
				}
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Failed connection.");
		}
			
	}
	
	public static Elements safe(Elements other) {//table will be Elements type.
		return other == null? (Elements) Collections.EMPTY_LIST:other;// 
	}

}