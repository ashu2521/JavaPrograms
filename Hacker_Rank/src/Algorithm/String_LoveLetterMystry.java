package Algorithm;

import java.util.Scanner;

public class String_LoveLetterMystry {
	static int theLoveLetterMystery(String s) {
		// Complete this function
		int count = 0;
		for(int i = 0, j = s.length() - 1; i < j || i == j; i++, j--){
			int x = s.charAt(i) > s.charAt(j) ? s.charAt(i) : s.charAt(j);
			int y = s.charAt(i) < s.charAt(j) ? s.charAt(i) : s.charAt(j);

			while(x > 'a' && x != y ){
				x--;
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			int result = theLoveLetterMystery(s);
			System.out.println(result);
		}
	}
}
