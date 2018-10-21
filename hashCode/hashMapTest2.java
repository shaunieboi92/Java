package hashCode;

import java.util.*;

public class hashMapTest2 {
	static HashMap<String, Integer>map = new HashMap<>();
	public static void main (String args[]) {
		map.put("Shaun", 1);
		map.put("Jacob", 2);
		System.out.println(map.get("Shaun"));
		
		if(map.containsKey("Shaun")) System.out.println(1);
		if(map.containsValue(3)) System.out.println("Error");
		//here it will never print out error since within the mapping there is no value of 3
		
		for(String s: map.keySet()) {
			System.out.println(3);
		}
		Set keyset = map.keySet();
		System.out.println(keyset);
		
		//keyset returns the view of keys
		for(Integer s: map.values()) {
			System.out.println(4);
		}
		Collection<Integer> valuesset = map.values();
		System.out.println(valuesset);

		
		//value() returns the view of values

		
		//entryset() method to get set view
		for(Map.Entry kv: map.entrySet()) {
			
		}
		Set set = map.entrySet();
		//remove map
		map.remove("Shaun");
		//left with jacob
		System.out.println(map);
		System.out.println("Set values: " + set);
	}
}
