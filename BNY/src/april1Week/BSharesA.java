package april1Week;

import java.util.HashMap;
import java.util.Map;

public class BSharesA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("a", "aaa");
		map1.put("b", "bbb");
		map1.put("c", "ccc");
		
		System.out.println("Map1: 'a' is not empty.\n");
		for (Map.Entry<String, String> entry : map1.entrySet())
			System.out.println("Before:  key = " + entry.getKey() + ", Value = " + entry.getValue());
			System.out.println();
			
		bShares(map1, "a", "b", "c");
		
		for (Map.Entry<String, String> entry : map1.entrySet())
			System.out.println("After:  key = " + entry.getKey() + ", Value = " + entry.getValue());
			System.out.println();
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("b", "xyz");
		map2.put("c", "ccc");
		
		System.out.println("Map 2: no 'a' to copy.\n");
		for (Map.Entry<String, String> entry : map2.entrySet())
			System.out.println("Before:  key = " + entry.getKey() + ", Value = " + entry.getValue());
			System.out.println();
		
		bShares(map2, "a", "b", "c");
		
		for (Map.Entry<String, String> entry : map2.entrySet())
			System.out.println("After:  key = " + entry.getKey() + ", Value = " + entry.getValue());
			System.out.println();
		
		
		HashMap<String, String> map3 = new HashMap<String, String>();
		map3.put("a", "aaa");
		map3.put("d", "hi");
		map3.put("c", "meh");
		

		System.out.println("Map 3: no 'b' to start.\n");
		for (Map.Entry<String, String> entry : map3.entrySet())
			System.out.println("Before:  key = " + entry.getKey() + ", Value = " + entry.getValue());
			System.out.println();
		
		bShares(map3, "a", "b", "c");
		
		for (Map.Entry<String, String> entry : map3.entrySet())
			System.out.println("After:  key = " + entry.getKey() + ", Value = " + entry.getValue());
	}
	
	private static void bShares(HashMap <String, String> map,String a, String b, String c ) {
		map.remove(c);
		if (map.containsKey(a) && map.containsKey(b)) {
			map.replace(b,  map.get(a));
		}else if ((map.containsKey(a)==true) &&  (map.containsKey(b)==false)) {
			map.put(b,  map.get(a));
		}//too much code -- test for b is not needed
	}
}
