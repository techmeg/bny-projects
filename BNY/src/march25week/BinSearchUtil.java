package march25week;

public class BinSearchUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] list = {2, 4, 7, 11, 45, 50, 59};
		System.out.println("Index is " + java.util.Arrays.binarySearch(list,  11));
		//returns index position  - 3 in this case
		
		char[] chars = {'a', 'c', 'g', 'x', 'y', 'z'};
		System.out.println("Index is " + java.util.Arrays.binarySearch(chars,  't'));
		//or if not in index -1 plus negative of insertion point (in this casde -3)= -4
	}

}
