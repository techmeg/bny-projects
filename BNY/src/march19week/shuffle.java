package march19week;

import java.util.Arrays;

public class shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String myList[] = {"a", "b", "c", "d", "e"};
	
		for(int i = myList.length-1; i>0; i--) {
			int j =(int)(Math.random()*(i));
			
			String temp = myList[i];
			myList[i] = myList[j];
			myList[j] = temp;
		}System.out.println(Arrays.toString(myList));
	}
}
		
