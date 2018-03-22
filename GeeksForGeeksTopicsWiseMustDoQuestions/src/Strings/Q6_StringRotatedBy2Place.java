package Strings;

import java.util.Scanner;

public class Q6_StringRotatedBy2Place {
	static int roatateAndCheck(String s1, String s2){
		String test1 = s1.substring(s1.length() - 2) + s1.substring(0, s1.length() - 2);
		String test2 = s1.substring(2) + s1.substring(0, 2);
		if(test1.equals(s2) || test2.equals(s2))
			return 1;
		return 0;
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			String s1 = in.next();
			String s2 = in.next();
			System.out.println(roatateAndCheck(s1, s2));
		}
	}
}
