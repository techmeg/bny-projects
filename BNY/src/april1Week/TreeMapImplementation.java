package april1Week;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//TreeMap
		//map1
		TreeMap<Integer, String> tmap1 = new TreeMap<Integer, String>();
		
		//key cannot be null, so you might need a null test before putting elements in a tree map
		tmap1.put(100, "NY");
		tmap1.put(1, "NY");
		tmap1.put(2, "NJ");
		tmap1.put(5, "CA");
		tmap1.put(3, "PA");
		tmap1.put(7, "MI");
		tmap1.put(4, null);
		tmap1.put(200, "SD");
		
		TreeMap<Integer, String> tmap2 = new TreeMap<Integer, String>();
		tmap2.put(999, "PQ");
		tmap2.put(1000, "QR");
		
		System.out.println(tmap1.containsValue("MI"));
		System.out.println(tmap1.containsKey(7));
		System.out.println(tmap1.get(200));
		System.out.println(tmap1.replace(2, "XY"));
		System.out.println(tmap1.remove(2));
		System.out.println(tmap1.get(200).hashCode());
//System.out.println(tmap1.);
		
		//entry = one key/value pair
		//below is using for each method of iterating
		for (Map.Entry<Integer, String> entry : tmap1.entrySet())
			System.out.println("key = " + entry.getKey() + ", Value = " + entry.getValue());
		
		//doesn't print out in any predictable order
		tmap1.putAll(tmap2);
		
		System.out.println("==============AFter=====================");
		for (Map.Entry<Integer, String> entry : tmap1.entrySet())
			System.out.println("key = " + entry.getKey() + ", Value = " + entry.getValue());
	
		Map<Integer, String> newMap = new TreeMap<>(Collections.reverseOrder());
		newMap.putAll(tmap1);
		
		System.out.println("==============new Map=====================");

		for (Map.Entry<Integer, String> entry : newMap.entrySet())
			System.out.println("key = " + entry.getKey() + ", Value = " + entry.getValue());
}}