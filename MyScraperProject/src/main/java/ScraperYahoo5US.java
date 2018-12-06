import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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

public class ScraperYahoo5US {
	private static String counterName;

	private static String UrlName;
	static boolean isValid = false;
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("---Real Time STI stock price finder---\nEnter \"quit\" to compile");
		List<String>generated = requestCounter();
		for(String x: generated) {
			System.out.println(x);
		}
		retrieveStockInfo(generated);
	}
	
	//create data extraction
	public static List<String> requestCounter() throws InterruptedException {
		//List<String>list = new ArrayList<String>();
		List<String>generated =  new ArrayList<String>();
		Scanner s = new Scanner(System.in) ;
		System.out.println("Please enter counters");
		 while ( s.hasNext())  
	        { 
			 counterName =  s.next();
	          if(!counterName.equalsIgnoreCase("quit")){
	        
		  		try {
		  			UrlName = "https://finance.yahoo.com/quote/" + counterName;
		  		    URI uri = null;
					uri = new URI(UrlName);
					//System.out.println(UrlName);
				    // perform checks for scheme, authority, host, etc., based on your requirements
					generated.add(counterName);
		  		}
				catch (URISyntaxException e) {
					e.printStackTrace();
				}
	          }
	          else {
	        	  System.out.println("Compiling...");
	        	  Thread.sleep(1000);
	        	  break;
	          }
	        }
		return generated;
	}
	

	
	public static void retrieveStockInfo(List<String> Quotes) {
		System.out.print(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime()));
		System.out.println(" SGT TIME");
		for(String quote: Quotes) {
			try {
				Document doc = Jsoup.connect("https://finance.yahoo.com/quote/" + quote).userAgent("Mozilla").get();
				if(doc==null) {
					System.out.println(quote + " is invalid. Removed from List");
				}
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
							System.out.println(line);
							currency = line.substring(start-6, start -3);
							System.out.println(currency);
							switch (currency) {
								case "USD": showCurrency = "US$";
								break;
								default:showCurrency = "Invalid Currency";
							}
							 
							System.out.println("The Price of " + quote.toUpperCase() + " is " + showCurrency + line.substring(start-2, start +5));
						}
						
					}
				}
				catch(Exception e) {
					e.printStackTrace();
					System.out.println("Failed connection.");
				}
		}
		
			
	}
	
	public static Elements safe(Elements other) {//table will be Elements type.
		return other == null? (Elements) Collections.EMPTY_LIST:other;// 
	}

}