package april1Week;

import java.util.HashMap;
import java.util.Map;

public class JoinAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("a", "Hi");
		map1.put("b", "There");
		
		System.out.println("Map1: 'a' and 'b' present\n");
		for (Map.Entry<String, String> entry : map1.entrySet())
			System.out.println("Before:  key = " + entry.getKey() + ", Value = " + entry.getValue());
			System.out.println();
			
		joinAB(map1, "a", "b");
		
		for (Map.Entry<String, String> entry : map1.entrySet())
			System.out.println("After:  key = " + entry.getKey() + ", Value = " + entry.getValue());
			System.out.println();
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("a", "Hi");
		
		System.out.println("Map 2: no 'b' to join.\n");
		for (Map.Entry<String, String> entry : map2.entrySet())
			System.out.println("Before:  key = " + entry.getKey() + ", Value = " + entry.getValue());
			System.out.println();
		
		joinAB(map2, "a", "b");
		
		for (Map.Entry<String, String> entry : map2.entrySet())
			System.out.println("After:  key = " + entry.getKey() + ", Value = " + entry.getValue());
			System.out.println();
		
		
		HashMap<String, String> map3 = new HashMap<String, String>();
		map3.put("b", "There");
		

		System.out.println("Map 3: no 'a' to join.\n");
		for (Map.Entry<String, String> entry : map3.entrySet())
			System.out.println("Before:  key = " + entry.getKey() + ", Value = " + entry.getValue());
			System.out.println();
		
		joinAB(map3, "a", "b");
		
		for (Map.Entry<String, String> entry : map3.entrySet())
			System.out.println("After:  key = " + entry.getKey() + ", Value = " + entry.getValue());
	}
	
	private static void joinAB(HashMap <String, String> map,String a, String b) {
		if (map.containsKey(a) && map.containsKey(b)) {
			String join = map.get(a) + map.get(b);
			map.put("ab",  join);
		}
	}
}

