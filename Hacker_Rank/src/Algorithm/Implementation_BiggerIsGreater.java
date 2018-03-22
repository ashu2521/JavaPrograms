package Algorithm;

import java.util.Scanner;

public class Implementation_BiggerIsGreater {
	static String biggerIsGreater(String w) {
		// Complete this function
		StringBuilder sb = new StringBuilder(w);
		for(int i = 0; i < w.length() - 1; i++){
			for(int j = i+1; j < w.length(); j++){
				if(sb.charAt(j) > sb.charAt(i)){
					char c = sb.charAt(i);
					sb.setCharAt(i, sb.charAt(j));
					sb.setCharAt(j, c);
					break;
				}
			}
		}
		//System.out.println("String " + sb );
		String s = "" + sb;
		if(s.equals(w))
			return "no answer";
		else
			return s;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int a0 = 0; a0 < T; a0++) {
			String w = in.next();
			String result = biggerIsGreater(w);
			System.out.println(result);
		}
		in.close();
	}
}
