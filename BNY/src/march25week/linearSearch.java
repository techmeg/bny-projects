package march25week;

public class linearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
		int i = linearSearch(list, 4);  // returns 1
		System.out.println(i);
		int j = linearSearch(list, -4); // returns -1
		System.out.println(j);
	
		int k = linearSearch(list, -3); // returns 5
		System.out.println(k);
		
	}	
		public static int linearSearch(int[] list, int key) {
			for (int i = 0; i < list.length; i++)
				if (key == list[i])
					return i;
			return -1;}
		

	}


