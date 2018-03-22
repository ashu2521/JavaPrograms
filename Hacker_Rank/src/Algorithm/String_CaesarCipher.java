package Algorithm;

import java.util.Scanner;

public class String_CaesarCipher {
	static String caesarCipher(String s, int k) {
		// Complete this function
		String new_S = "";
		for (int i = 0; i < s.length(); i++) {
			int c = s.charAt(i);
			int x = k;
			if (Character.isAlphabetic(c)) {
				int p = Character.isUpperCase(c) ? 'A' : 'a';
				new_S += (char) (p + ((c - p + k) % 26));
			}
			else
				new_S += (char)c;
		}
		return new_S;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int k = in.nextInt();
		String result = caesarCipher(s, k);
		System.out.println(result);
		in.close();
	}
}
