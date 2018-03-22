package Strings;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Q3_PermutaionsOfString {
	static Set<String> set;
	static void printPermutations(StringBuffer s, int i) {
		if (i >= s.length()){
			set.add("" + s);
			return;
		}
		for (int k = i; k < s.length(); k++) {
			char x = s.charAt(k);
			StringBuffer s1 = new StringBuffer(s);
			s1.setCharAt(k, s.charAt(i));
			s1.setCharAt(i, x);
			printPermutations(s1, i + 1);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			set = new TreeSet<>();
			String s = in.next();
			StringBuffer sb = new StringBuffer(s);
			printPermutations(sb, 0);
			for(String x: set){
				System.out.print(x+ " ");
				
			}
		}
	}
}
