package RSSFeed;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import com.rometools.rome.feed.synd.SyndCategory;
import com.rometools.rome.feed.synd.SyndCategoryImpl;
import com.rometools.rome.feed.synd.SyndContent;
import com.rometools.rome.feed.synd.SyndContentImpl;
import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndEntryImpl;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.feed.synd.SyndFeedImpl;
import com.rometools.rome.io.FeedException;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.SyndFeedOutput;
import com.rometools.rome.io.XmlReader;


//add rome dependency

/*
 * To understand how Rome Syndication works
 * reference from "https://rometools.github.io/rome/HowRomeWorks/index.html"
 * Rome is able to parse any format of news feed, including
 * RSS variants and Atom
 * Steps of how Rome works is shown below
 * 
 * 1) SyndFeedInput is called to parse a Newsfeed
 * 2) SyndFeedInput then delegates to WireFeedInput to do the actual parsing
 * 3) WireFeedInput uses a PluginManager of class FeedParsers to pick the
 * right parsers to use to parse the feed and then calls that parser to parse the NewsFeed
 * 4) the appropriate parser parses the feed, using JDom, into a WireFeed. 
 * 5) If the newsFeed is in RSS format, the wireFeed is of class Channle and contains items, Clouds
 * , and other RSS things from the com.rometools.rome.feed.rss package
 * 6) if the NewsFeed is in Atom format, then the WireFeed is of class Feed from the com.rometools.tome.atom package
 * 7) the WireFeedInput returns a WireFeed.
 * 
 * RSS tags format as such
 * <rss version="2.0">
<channel>
...
</channel>
</rss>

 *source is defined by channel tag
 *the channel will be the same for all the RSS feeds,
 *
 *@Add SLF4J API in dependencies 
 *@Add SLF4J-jdk14 jar file for binding for SLF4J and Java Logging 
 *to remove static Logger Binder error output
 */
public class RSSXMLExample3Romebased {
	
	private final static String url = "https://us.spindices.com/rss/rss-details/?rssFeedName=us-equity";
	private static String title;
	private static String link;
	private static String descriptionType;
	private static String description;
	private static String descriptionMode;
	private static String publishedDate;
	private final static int feedLimit =10;
	
	//create new RSS feed with Rome API using default implementation SyndFeedImpl of Syndfeed interface
	public static void main(String args[]) {
		//Create URL feedSource
		try {
			URL feedUrl = new URL(url);
			SyndFeedInput input = new SyndFeedInput();
			try {
				SyndFeed feed = input.build(new XmlReader(feedUrl));
//				for(SyndEntry entry: feed.getEntries()) {
				for(int i = 0; i< feedLimit;i++) {
					SyndEntry entry = feed.getEntries().get(i);
					title = entry.getTitle();
					link = entry.getLink();
					//get description
					if(entry.getDescription()!=null) {
						description = entry.getDescription().getValue();
						descriptionType = entry.getDescription().getType();
					}
				    if (entry.getPublishedDate() != null)
				    	publishedDate = new SimpleDateFormat("dd-MMMM-YYYY").format(entry.getPublishedDate());
				   
			
					String clrmessage = title.replace("#039","").trim() + "\n" + link + "\n" + publishedDate +"\n"
					+ description.replace("•","").trim() + "\n\n";
					
					System.out.println(clrmessage);
				}
			} catch (IllegalArgumentException | FeedException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
//			URL feedSource = new URL("http://www.asiaone.com/rss-feed/2");
//			SyndFeedInput input = new SyndFeedInput();
//			try {
//				SyndFeed feed = input.build(new XmlReader(feedSource));
//				//run SyndFeedOutput 
//				SyndFeedOutput output = new SyndFeedOutput();
//				Writer writer = new FileWriter("RSS.txt");
//				output.output(feed, writer);
//			} catch (IllegalArgumentException | FeedException | IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch (MalformedURLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
	
		
		
	}

	
	
}
