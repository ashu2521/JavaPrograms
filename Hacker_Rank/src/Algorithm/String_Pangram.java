package Algorithm;

import java.util.Scanner;

public class String_Pangram {
	static String pangrams(String s) {
		int arr[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int x = Character.isUpperCase(s.charAt(i)) ? Character.toLowerCase(s.charAt(i)) : s.charAt(i);
			if(s.charAt(i) != ' ')
				arr[x - 97]++;
		}
		
		boolean isPan = true;
		for (int i = 0; i < 26; i++)
			if (arr[i] == 0)
				isPan = false;
		if (isPan)
			return "pangram";

		return "not pangram";
	}

	public static void main(String args[]) throws Exception {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT
		 */
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(pangrams(s));
	}
}
