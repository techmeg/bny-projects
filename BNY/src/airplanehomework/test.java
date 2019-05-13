package airplanehomework;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int[]test = {0, 0, 1};
		int count = 0;
		for (int i = 0; i<=2; i++) {
			if(test[i]==1) {
				continue;
			}count++;
		}System.out.println(count);
	}*/
		String s = "Math | English | Law";
		s=s.replaceAll("\\s+",  "");
		
		System.out.println(s);
		String[]subjects = s.split("\\|");
		System.out.println(Arrays.deepToString(subjects));
		
	}
}
