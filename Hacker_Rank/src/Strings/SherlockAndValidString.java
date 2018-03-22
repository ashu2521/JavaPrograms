package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SherlockAndValidString {
	static String isValid(String s) {
		int freq[] = new int[26], min_count = 0, max_count = 0;
		String valid = "NO";
		int max_freq = Integer.MIN_VALUE, min_freq = Integer.MAX_VALUE;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			freq[c - 97]++;
		}
		for (int i = 0; i < 26; i++) {
			if (freq[i] > 0 && min_freq > freq[i])
				min_freq = freq[i];
			if (max_freq < freq[i])
				max_freq = freq[i];
		}
		for (int i = 0; i < 26; i++) {
			
			System.out.println(i + " " + freq[i]);
			if (freq[i] != min_freq && freq[i] != max_freq && freq[i] != 0)
				return "NO";
			if (freq[i] == min_freq)
				min_count++;
			if (freq[i] == max_freq)
				max_count++;
		}

		if (max_freq == min_freq)
			valid = "YES";
		else {
			//System.out.println("CaSE");
			int count = max_count > min_count ? min_count : max_count;
			if (min_freq == 1|| min_freq == max_freq - 1 && count == 1) {
				valid = "YES";
			}
		}

		return valid;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = isValid(s);
		System.out.println(result);

	}
}
