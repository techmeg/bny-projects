package april1Week;

import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> c1  = new LinkedList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		System.out.println("List of first linked list: " + c1);
		c1.add(1,  "Blue");
		c1.addFirst("White");
		c1.addLast("Grey");
		System.out.println(c1);
		
		LinkedList<String> c2  = new LinkedList<String>();
		c2.add("RED");
		c2.add("BLUE");
		c2.add("PINK");
		System.out.println(c2);
		
		//join strings
		LinkedList<String> a = new LinkedList<String>();
		a.addAll(c1);
		a.addAll(c2);
		System.out.println(a);
		System.out.println(a.contains("Grey"));
		System.out.println(a.getFirst());
		a.remove("PINK");
		System.out.println(a);
		a.pollLast();
		a.poll();
		System.out.println(a);
		System.out.println(a.peek());
		a.retainAll(c1);
		System.out.println(a);
		a.sort(null);
		System.out.println(a);
		a.spliterator();//? does what
		System.out.println(a);
		System.out.println(a.indexOf("PINK"));
		
	}

}
