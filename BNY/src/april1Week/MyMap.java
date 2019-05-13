package april1Week;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(1, "Mango");
		m1.put(3, "Orange");
		m1.put(2, "Apple");
		m1.put(2, "Banana");
		m1.put(3, "Banana");
		
		System.out.println(m1.keySet());
		System.out.println(m1.values());
		System.out.println(m1.entrySet());
		
		m1.putIfAbsent(4,  "Apple");
		System.out.println(m1.entrySet());
		System.out.println(m1.toString());
		
	}

}
