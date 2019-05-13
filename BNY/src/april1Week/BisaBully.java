package april1Week;

import java.util.HashMap;
import java.util.Map;

public class BisaBully {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("a", "candy");
		map1.put("b", "fruit");
		map1.put("c", "peas");
		
		System.out.println("When 'a' is not empty\n");
		for (Map.Entry<String, String> entry : map1.entrySet())
			System.out.println("Before:  key = " + entry.getKey() + ", Value = " + entry.getValue());
			System.out.println();
			
		bullyb(map1, "a", "b");
		
		for (Map.Entry<String, String> entry : map1.entrySet())
			System.out.println("After:  key = " + entry.getKey() + ", Value = " + entry.getValue());
			System.out.println();
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("a", "");
		map2.put("b", "fruit");
		map2.put("c", "peas");
		
		System.out.println("When 'a' is empty\n");
		for (Map.Entry<String, String> entry : map2.entrySet())
			System.out.println("Before:  key = " + entry.getKey() + ", Value = " + entry.getValue());
			System.out.println();
		
		bullyb(map2, "a", "b");
		
		for (Map.Entry<String, String> entry : map2.entrySet())
			System.out.println("After:  key = " + entry.getKey() + ", Value = " + entry.getValue());
		

	}



	private static void bullyb(HashMap <String, String> map,String a, String b ) {
		// TODO Auto-generated method stub
		if(map.get(a)!= "") {
			map.replace(b, map.get(a));
			map.replace(a, "");
			
		}
	}
}
