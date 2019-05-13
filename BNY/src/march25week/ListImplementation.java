package march25week;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ListImplementation {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 // Generic ArrayList of type String
		 List<String> students = new ArrayList<String>();

		 // Adding elements - Only strings since restricted to String
		 students.add("Lucy");
		 students.add("Vernon");
		 students.add("Lucy"); // Adding duplicates - possible

		 // Alternatively,
		 List<String> sList1 = new ArrayList<String>(Arrays.asList("Lucy", "Vernon", "Lucy"));

		 // Size
		 System.out.println("Size: " + students.size());

		 // Printing elements
		 System.out.println("Elements: " + students);

		 // Print elements using Lambda expression
		 students.forEach(elements -> {
		 System.out.println("Print with lambda: " + elements);
		 });

		 // Removing elements
		 students.remove("Lucy");
		 System.out.println("Removing one copy of Lucy: " + students);

		 // Adding Element at specified index
		 students.add(0, "Nilda");
		 System.out.println("Adding Nilda at index 0: " + students);

		 students.add(1, "Cathy");
		 System.out.println("Adding Cathy at index 1: " + students);

		 students.add(1, "Kokab");
		 System.out.println("Adding Kokab at index 1: " + students);

		 // Replacing an element at specified index
		 students.set(1, "Melanie");
		 System.out.println("Replacing index 1 with Melanie: " + students);

		 // List to Array conversion
		 String[] arr = new String[students.size()];
		 students.toArray(arr);
		 System.out.println("List to Array: " + Arrays.toString(arr));

		 // Array to List conversion
		 List<String> newList = new ArrayList<String>();
		 newList = Arrays.asList(arr);
		 System.out.println("Array to List: " + newList);

		 // List is only for objects, not for primitives
		 Integer[] numbers = { 1, 2, 3, 4, 5 }; // Can't be int[] numbers = {1,2,3,4,5};
		 List<Integer> numList = new ArrayList<Integer>();
		 numList = Arrays.asList(numbers);
		 System.out.println("Integer Array to List: " + numList);

		 int x = 5;
		 Integer y = x; // Boxing
		 int z = y; // Unboxing

		 // Wrapper class -> Primitive ==> Unboxing
		 // Primitive -> Wrapper class ==> Boxing

		 // Adding one list to another
		 List<String> sList2 = new ArrayList<String>();
		 sList2.add("Rucha");
		 sList2.add("Lily");

		 students.addAll(sList2);
		 System.out.println("Adding one list to another: " + students);

		 // Type Object can add all types of object
		 List<Object> rIT = new ArrayList<Object>();
		 rIT.add(2);
		 rIT.add("String");
		 System.out.println("rIT List: " + rIT);

		 // Removing all elements
		 students.clear();
		 System.out.println("Empty list: " + students);
		 }
}

