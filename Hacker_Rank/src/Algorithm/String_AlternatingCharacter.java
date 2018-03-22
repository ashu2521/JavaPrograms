package Algorithm;

import java.util.Scanner;

public class String_AlternatingCharacter {
	static int alternatingCharacters(String s) {
		// Complete this function
		int count = 0;
		int rep = 0;
		char ch = s.charAt(0);
		for(int i = 1; i < s.length(); i++){
			if(s.charAt(i) == ch){
				rep++;
			}
			else{
				count += rep;
				rep = 0;
				ch = s.charAt(i);
			}
		}
		return count + rep;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			int result = alternatingCharacters(s);
			System.out.println(result);
		}
	}
}
