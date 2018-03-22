package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BiggerIsBetter {
	static String sortString(String s, int i) {
		String s1 = s.substring(0, i);
		String s2 = s.substring(i);
		char ch[] = s2.toCharArray();
		Arrays.sort(ch);
		for(int j = 0; j < ch.length; j++)
			s1 += ch[j];
		
		return s1;
	}

	static String biggerIsGreater(String w) {
		// Complete this function
		StringBuilder sb = new StringBuilder(w);
		for (int i = sb.length() - 2; i >= 0; i--) {
			for (int j = sb.length() - 1; j > i; j--) {
				if (sb.charAt(i) < sb.charAt(j)) {
					char ch = sb.charAt(j);
					sb.setCharAt(j, sb.charAt(i));
					sb.setCharAt(i, ch);
					return sortString("" + sb, i + 1);
				}
			}
		}
		return "no answer";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int a0 = 0; a0 < T; a0++) {
			String w = in.next();
			String result = biggerIsGreater(w);
			System.out.println(result);
		}
		in.close();
	}
}
