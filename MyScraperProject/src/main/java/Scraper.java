
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Scraper {
	//here we want to use Jsoup to replace the original fetching of html src via URL API
//	 public static void readFromWeb(String webURL) throws IOException {
//	        URL url = new URL(webURL);
//	        InputStream is =  url.openStream();
//	        try( BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
//	            String line;
//	            while ((line = br.readLine()) != null) {
//	                System.out.println(line);
//	            }
//	        }
//	        catch (MalformedURLException e) {
//	            e.printStackTrace();
//	            throw new MalformedURLException("URL is malformed!!");
//	        }
//	        catch (IOException e) {
//	            e.printStackTrace();
//	            throw new IOException();
//	        }
//	 }
	//beware the conflicting Javax Document and Jsoup.node.Document
	public static void main(String[] args) throws IOException{
		final Document document = Jsoup.connect("http://imdb.com/chart/top").get();
		//System.out.println(document.outerHtml());
		int esize =document.select("table.chart.full-width tbody tr").size();
		for(Element row: document.select("table.chart.full-width tbody tr").subList(1, esize)){
			final String title = row.select(".titleColumn a").text();
			final String rating = row.select(".ratingColumn.imdbRating").text();
			if(title!="" || rating!="") {
			System.out.println(title + "=> Rating: " + rating);
			}
		}
		
	}
}
