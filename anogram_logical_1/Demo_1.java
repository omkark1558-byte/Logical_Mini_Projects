package anogram_logical_1;

import java.util.Arrays;

public class Demo_1 {
	public static void main (String [] args) {
		
		String str = "abbdassdedbe";
		String str2 = "abbdassdedbe";
		
		char[] ch = str.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch2);
		
		System.out.println(Arrays.equals(ch, ch2));
		
	}

}
