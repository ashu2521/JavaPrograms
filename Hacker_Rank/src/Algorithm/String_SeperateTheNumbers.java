package Algorithm;

import java.util.Scanner;

public class String_SeperateTheNumbers {
	static String getStart(String s) {
		// Complete this function
		if (s.charAt(0) == '0')
			return "NO";

		String start = "0";
		for (int i = 0; i < s.length() / 2; i++) {
			start += s.charAt(i);
			String next = "0";
			for (int j = i + 1; j < s.length() && j <= i + start.length(); j++) {
				next += s.charAt(j);
				// System.out.println(start + " " + next);
				if (Long.parseLong(start) == Long.parseLong(next) - 1) {
					return "" + Integer.parseInt(start);
				}
			}
			if (Long.parseLong(start) == Long.parseLong(next) - 1)
				return "" + Long.parseLong(start);

		}

		return "NO";
	}

	static String separateNumbers(String s) {
		String start = getStart(s);
		if (start.equals("NO"))
			return start;

		System.out.println(start);
		int islast = 0;
		long prev_no = Long.parseLong(start) + 1;
		String curr_no = "";
		for (int i = start.length(); i < s.length(); i++) {
			curr_no += s.charAt(i);
			if (Long.parseLong(curr_no) == prev_no) {
				prev_no = Long.parseLong(curr_no) + 1;
				curr_no = "";
				islast = i;
			}
		}
		if (s.endsWith("" + (prev_no - 1)) && islast == s.length() - 1)
			return "YES " + start;

		return "NO";

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			System.out.println(separateNumbers(s));
		}
		in.close();
	}

}
