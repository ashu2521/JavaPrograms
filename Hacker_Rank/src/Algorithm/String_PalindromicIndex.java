package Algorithm;

import java.util.Scanner;

public class String_PalindromicIndex {
	static int palindromeIndex(String s) {
		// Complete this function
		for (int i = 0, j = s.length() - 1; i < j || i == j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				String s1 = s.substring(0, i) + s.substring(i + 1, s.length());
				StringBuilder sb = new StringBuilder(s1);
				sb.reverse();
				String s2 =  "" + sb;
				int index = s1.equals(s2) ? i : j;
				return index;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			int result = palindromeIndex(s);
			System.out.println(result);
		}
	}
}
