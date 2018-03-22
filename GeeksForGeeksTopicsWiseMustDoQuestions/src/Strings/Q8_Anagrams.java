package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Q8_Anagrams {
	static String isAnagram(String s1, String s2){
		if(s1.length() != s2.length())
			return "NO";
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		s1 = String.valueOf(ch1);
		s2 = String.valueOf(ch2);
		if(s1.equals(s2))
				return "YES";
		
		return "NO";
		
		
	}
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0){
		    String s1 = in.next();
		    String s2 = in.next();
		    System.out.println(isAnagram(s1, s2));
		}
	}
}
