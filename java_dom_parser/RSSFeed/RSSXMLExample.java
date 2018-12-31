package RSSFeed;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class RSSXMLExample {
	public static void main(String args[]) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse("src/RSSFeed/RSS.xml");
			
			//all three exceptions have to be caught
			//here rss is the rootelement
			//channel is the main element
			//in channel there is several child nodes item etc 
			//we generate a nodeList by title
			NodeList channelList = doc.getElementsByTagName("channel");
			for(int i = 0; i<channelList.getLength(); i++) {
				NodeList childList = channelList.item(i).getChildNodes();
				//retrieves each childnode
				for(int j= 0 ; j<childList.getLength(); j++) {
					Node childNode = childList.item(j);

					if(childNode.getNodeType()==Node.ELEMENT_NODE) {
						Element childElem = (Element) childNode;
						if(childNode.hasChildNodes()){
							NodeList childchildList = childNode.getChildNodes();
							for(int k=0; k<childchildList.getLength();k++) {
								Node childchildNode = childchildList.item(k);
								if(childchildNode.getNodeType()==Node.ELEMENT_NODE) {
									Element childchildElem = (Element) childchildNode;
									System.out.println(childchildElem.getTagName() + ": " + childchildElem.getTextContent());
								}else if(childchildNode.getNodeType()==Node.TEXT_NODE) {
									Text text = (Text) childchildNode;
									System.out.println(childElem.getTagName() + ": " + text.getNodeValue());
								}
							}
						
						}
					
					}
				}
				
			}
		}catch (SAXException sax) {
			sax.printStackTrace();
		}catch (ParserConfigurationException parse) {
			parse.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
