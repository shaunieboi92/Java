package RSSFeed;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
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
import com.rometools.rome.io.SyndFeedOutput;


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
 *
 */
public class RSSXMLExample3Romebased2 {
	//create new RSS feed with Rome API using default implementation SyndFeedImpl of Syndfeed interface
	public static void main(String args[]) {
		//Create URL feedSource
//		try {
//			URL feedSource = new URL("http://rssblog.whatisrss.com/feed/");
//		} catch (MalformedURLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		//SyndFeedInput input = SyndFeedInput();
		//SyndFeed feed = input.build(new XmlReader(feedUrl));
		
		
		//this is for creation of feed
		//SyndFeed allows for adding more fields, including authods, contributors, copyrights etc
		SyndFeed feed =  new SyndFeedImpl();
		feed.setTitle("Test title");
		feed.setLink("http://www.somelink.com");
		feed.setDescription("Basic Description");
		
		//Add Entry
		//use default implementation SyndEntryImpl of SyndEntry Interface to create new entry
		SyndEntry entry = new SyndEntryImpl();
		entry.setTitle("Entry Title");
		entry.setLink("http://www.somelink.com/entry1");
		feed.setEntries(Arrays.asList(entry));
		//Entry here is array of class SyndEntry
		
		SyndContent description  = new SyndContentImpl();
		description.setType("text/html");
		description.setValue("First Entry");
		
		entry.setDescription(description);
		
		//add categories
		List<SyndCategory> categories = new ArrayList<>();
		SyndCategory category = new SyndCategoryImpl();
		category.setName("Sophisticated Category");
		categories.add(category);
		
		entry.setCategories(categories);
		
		//publish Feed
		Writer writer;
		try {
			writer = new FileWriter("xyz.txt");
			SyndFeedOutput syndFeedOutput = new SyndFeedOutput();
			try {
				syndFeedOutput.output(feed, writer);
			} catch (FeedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	
	
}
