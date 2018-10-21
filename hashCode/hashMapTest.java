package hashCode;

import java.lang.Object;
import java.util.*;

public class hashMapTest {
	public static void main (String args[]) {
		//create hashmap
		Map<String, Integer> numberMapping = new HashMap<>();
		//add key value pairs to hashmap
		//use put method
		numberMapping.put("One", 1);
		numberMapping.put("Two", 2);
		numberMapping.put("Three", 3);
		
		//putIfAbsent method
		//checks if the same key already exist,
		//will only assign a value if the key does not exist
		//if not the value of the key will be retained as current
		
		//e.g.
		
		
		System.out.println(numberMapping);
		
		numberMapping.put("Three", 4);
		//should return Three = 4
		System.out.println(numberMapping);
	
		
		//reset
		numberMapping.put("Three", 3);
		numberMapping.putIfAbsent("Three", 4);
		//should return Three = 3 still
		System.out.println(numberMapping);

	}
}
