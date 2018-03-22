package Algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class String_WeightedUniformString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		HashSet<Integer> set = new HashSet<>();
		int count = 1;
		char c = s.charAt(0);
		for(int i = 0; i < s.length() - 1; i++){
			set.add(count * (c - 96));
			if(s.charAt(i) == s.charAt(i+1)){
				count++;	
			}
			else{
				count = 1;
				c = s.charAt(i+1);
			}
		}
		set.add(count * (s.charAt(s.length() - 1) - 96));
		int n = in.nextInt();
		for (int a0 = 0; a0 < n; a0++) {
			int x = in.nextInt();
			// your code goes here
			if(set.contains(x))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
