import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ScraperSGX {
	public static void main(String[] args){
		
		//System.out.println(document.outerHtml());
		try {
			
			final Document document = Jsoup.connect("https://www.bloomberg.com/markets/stocks").get();
			Elements table = document.select("table.data-table tbody.data-table-body tr");
			for(Element row: table) {
				System.out.println(row.select("div.data-table-row-cell__link-block").text());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
