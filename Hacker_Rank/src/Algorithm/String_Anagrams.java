package Algorithm;

import java.util.HashMap;
import java.util.Scanner;

public class String_Anagrams {
	static int anagram(String s) {
		// Complete this function
		if (s.length() % 2 != 0)
			return -1;

		String s1 = s.substring(0, s.length() / 2);
		String s2 = s.substring(s.length() / 2, s.length());

		int arr[] = new int[26];
		for(int i = 0; i < s1.length(); i++){
			arr[s1.charAt(i) - 97]++;
		}
		for(int i = 0; i < s2.length(); i++){
			arr[s2.charAt(i) - 97]--;
		}
		int count = 0;
		for(int i = 0; i < 26; i++)
			if(arr[i] != 0)
				count+= Math.abs(arr[i]);
		return count/2;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			int result = anagram(s);
			System.out.println(result);
		}
	}
}
