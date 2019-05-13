package april1Week;

import java.util.HashMap;
import java.util.Map;

public class Toppings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("ice cream", "peanuts");
		
		System.out.println("Map1: 'ice cream' present.\n");
		for (Map.Entry<String, String> entry : map1.entrySet())
			System.out.println("Before:  key = " + entry.getKey() + ", Value = " + entry.getValue());
			System.out.println();
			
		topping(map1, "ice cream");
		
		for (Map.Entry<String, String> entry : map1.entrySet())
			System.out.println("After:  key = " + entry.getKey() + ", Value = " + entry.getValue());
			System.out.println();
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		
		System.out.println("Map 2: Empty set.\n");
		for (Map.Entry<String, String> entry : map2.entrySet())
			System.out.println("Before:  key = " + entry.getKey() + ", Value = " + entry.getValue());
			System.out.println();
		
		topping(map2, "ice cream");
		
		for (Map.Entry<String, String> entry : map2.entrySet())
			System.out.println("After:  key = " + entry.getKey() + ", Value = " + entry.getValue());
			System.out.println();
		
		
		HashMap<String, String> map3 = new HashMap<String, String>();
		map3.put("pancake", "syrup");
		

		System.out.println("Map 3: no 'ice cream' in map.\n");
		for (Map.Entry<String, String> entry : map3.entrySet())
			System.out.println("Before:  key = " + entry.getKey() + ", Value = " + entry.getValue());
			System.out.println();
		
		topping(map3, "ice cream");
		
		for (Map.Entry<String, String> entry : map3.entrySet())
			System.out.println("After:  key = " + entry.getKey() + ", Value = " + entry.getValue());
	}
	
	private static void topping(HashMap <String, String> map, String a) {
		map.put("bread", "butter");
		if (map.containsKey(a)) {
			map.replace(a,  "cherry");
		}
	}
}

