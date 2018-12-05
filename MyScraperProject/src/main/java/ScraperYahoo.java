import java.io.IOException;
import java.util.NoSuchElementException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ScraperYahoo {
	public static void main(String[] args) throws IOException{

	String fieldToFiend = "Previous Close";
	
		Document doc = Jsoup.connect("https://finance.yahoo.com/quote/aap").get();

		//get the root element
		Element quoteSummary = doc.getElementById("quote-summary");
		String value = quoteSummary.getElementsByTag("tr")
           //iterate over the table rows inside
           .stream()
           //find the row with the first td/span containing the label
           .filter(tr -> fieldToFiend.equals(tr.getElementsByTag("span").first().text()))
           //get the 2nd td and it's span element
           //The nextElementSibling property returns the element immediately following the specified element, in the same tree level.
           .map(tr -> tr.getElementsByTag("td")
                        .first()
                        .nextElementSibling()
                        .getElementsByTag("span")
                        .first()//get first matched element
                        .text())
           //get the first match
           .findFirst()
           .orElseThrow(NoSuchElementException::new);

			System.out.println(value);
	}
}