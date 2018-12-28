package networkCoding.java_dom_parser;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;

public class JavaDomParser {

	public static void main(String[] args) {
		//instantiate Document Builder Factory
		//it is a java 7 class for parmising xml,
		//defines a factory API that enables applications to obtain a parser
		//that produces DOM object trees from XML documents
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			//create document object doc, and hence document object model DOM
			Document doc = builder.parse("src/networkCoding/java_dom_parser/people.xml");
			//print out all elements in the doc
			System.out.println(doc.getDocumentElement().toString());
			NodeList personList = doc.getElementsByTagName("person");//case sensitive
			//personList.item personList.getLength
			//item can tell us the index starting with 0
			//getLength can tell us how many elements are in that nodelist
			for(int i = 0; i<personList.getLength(); i++) {
				//loop twice
				//every xml element is an element node, a node a just a point of entry
				Node p = personList.item(i);
				if(p.getNodeType()==Node.ELEMENT_NODE) {
					//person tag is element node
					Element person =(Element)p; //cast
					String id = person.getAttribute("id");
					NodeList nameList = person.getChildNodes();
					for(int j=0; j<nameList.getLength();j++) {
						Node n = nameList.item(j);
						if(n.getNodeType()==Node.ELEMENT_NODE) {
							Element name = (Element)n;
							System.out.println("Person " + id + ": " + name.getTagName() +
									" = " + name.getTextContent());//getTagName is the tag name itself
						}
					}
				}
			}
		}catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
