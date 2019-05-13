package april1Week;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LindedHashMapAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashMap
		//map1
		HashMap<Integer, String> hmap1 = new HashMap<Integer, String>();
		hmap1.put(100, "NY");
		hmap1.put(1, "NY");
		hmap1.put(2, "NJ");
		hmap1.put(5, "CA");
		hmap1.put(3, "PA");
		hmap1.put(null, "MI");
		hmap1.put(4, null);
		hmap1.put(200, "SD");
		
		HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();
		hmap2.put(999, "PQ");
		hmap2.put(1000, "QR");
		
		System.out.println(hmap1.containsValue("MI"));
		System.out.println(hmap1.containsKey(null));
		System.out.println(hmap1.get(200));
		System.out.println(hmap1.replace(2, "XY"));
		System.out.println(hmap1.remove(2));
		System.out.println(hmap1.get(200).hashCode());
//System.out.println(hmap1.);
		
		//entry = one key/value pair
		//below is using for each method of iterating
		for (Map.Entry<Integer, String> entry : hmap1.entrySet())
			System.out.println("key = " + entry.getKey() + ", Value = " + entry.getValue());
		
		//doesn't print out in any predictable order
		hmap1.putAll(hmap2);
		
		System.out.println("==============AFter=====================");
		for (Map.Entry<Integer, String> entry : hmap1.entrySet())
			System.out.println("key = " + entry.getKey() + ", Value = " + entry.getValue());
	
		//LinkedHashMap -- Insertion Order
		LinkedHashMap<Integer, String> lmap1 = new LinkedHashMap<Integer, String>();
		lmap1.put(100, "NY");
		lmap1.put(1, "NY");
		lmap1.put(2, "NJ");
		lmap1.put(5, "CA");
		lmap1.put(3, "PA");
		lmap1.put(null, "MI");
		lmap1.put(4, null);
		lmap1.put(200, "SD");
		
		LinkedHashMap<Integer, String> lmap2 = new LinkedHashMap<Integer, String>();
		lmap2.put(999, "PQ");
		lmap2.put(1000, "QR");
		
		System.out.println(lmap1.containsValue("MI"));
		System.out.println(lmap1.containsKey(null));
		System.out.println(lmap1.get(200));
		System.out.println(lmap1.replace(2, "XY"));
		System.out.println(lmap1.remove(2));
		System.out.println(lmap1.get(200).hashCode());
		System.out.println(lmap1.putIfAbsent(201, "AB"));

		
		//entry = one key/value pair
		//below is using for each method of iterating
		for (Map.Entry<Integer, String> entry : lmap1.entrySet())
			System.out.println("key = " + entry.getKey() + ", Value = " + entry.getValue());
		
		//LinkedList DOES maintain the insertion order
		lmap1.putAll(hmap2);
		
		System.out.println("==============AFter=====================");
		for (Map.Entry<Integer, String> entry : lmap1.entrySet())
			System.out.println("key = " + entry.getKey() + ", Value = " + entry.getValue());
	
		//LinkedHashMap -- Access Order -- adding default capacity and load and true, for access order
		//if you add false instead of true, it will revert to insert order
		LinkedHashMap<Integer, String> lmap3 = new LinkedHashMap<Integer, String>(16, .75f, true);
		lmap3.put(100, "NY");
		lmap3.put(1, "NY");
		lmap3.put(2, "NJ");
		lmap3.put(5, "CA");
		lmap3.put(3, "PA");
		lmap3.put(null, "MI");
		lmap3.put(4, null);
		lmap3.put(200, "SD");
		
		//map2
		LinkedHashMap<Integer, String> lmap4 = new LinkedHashMap<Integer, String>();
		lmap4.put(999, "PQ");
		lmap4.put(1000, "QR");
		
		//accessing elements
		lmap3.get(100);
		
		System.out.println(lmap3.containsValue("MI"));
		System.out.println(lmap3.containsKey(null));
		System.out.println(lmap3.get(200));
		System.out.println(lmap3.replace(2, "XY"));
		System.out.println(lmap3.remove(2));
		System.out.println(lmap3.get(200).hashCode());
		System.out.println(lmap3.putIfAbsent(201, "AB"));

		
		//entry = one key/value pair
		//below is using for each method of iterating
		//LinkedList DOES maintain the insertion order
		for (Map.Entry<Integer, String> entry : lmap3.entrySet())
			System.out.println("key = " + entry.getKey() + ", Value = " + entry.getValue());

		//adding map into map
		lmap3.putAll(hmap2);
		//accessing elements
		lmap3.get(100);
		lmap3.get(100);
		lmap3.get(201);
		lmap3.get(999);
		
		System.out.println("==============AFter=====================");
		for (Map.Entry<Integer, String> entry : lmap3.entrySet())
			System.out.println("key = " + entry.getKey() + ", Value = " + entry.getValue());
	
		
	}

}
