package Algorithm;

import java.util.Scanner;

public class String_beautifilBinaryString {
	static int beautifulBinaryString(String b) {
		// Complete this function
		int count = 0;
		int i = 0;
		while (i < b.length()) {
			if (b.charAt(i) == '0') {
				if (i + 2 < b.length() && b.substring(i, i + 3).equals("010")) {
					count++;
					i = i + 3;
				} else
					i++;
			} else
				i++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String b = in.next();
		int result = beautifulBinaryString(b);
		System.out.println(result);
		in.close();
	}
}
