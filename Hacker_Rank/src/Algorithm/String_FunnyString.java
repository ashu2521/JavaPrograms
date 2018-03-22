package Algorithm;

import java.util.Scanner;

public class String_FunnyString {
	static String funnyString(String s) {
		// Complete this function
		StringBuilder r = new StringBuilder(s);
		r.reverse();
		boolean isFunny = true;
		for(int i = 1; i < r.length(); i++){
			if(Math.abs(s.charAt(i) - s.charAt(i-1)) != Math.abs(r.charAt(i) - r.charAt(i - 1)))
				isFunny = false;
		}
		if(isFunny)
			return "Funny";
		return "Not Funny";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			String result = funnyString(s);
			System.out.println(result);
		}
	}
}
