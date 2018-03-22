package Algorithm;

import java.util.Scanner;

public class String_StringConstruction {

	static int stringConstruction(String s) {
        // Complete this function
        String x = "" + s.charAt(0);
        int cost = 1;
        for(int i = 1; i < s.length(); i++){
          if(!x.contains("" + s.charAt(i)))
        	  cost++;
          x += s.charAt(i);
        }
        return cost;
    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			int result = stringConstruction(s);
			System.out.println(result);
		}
		in.close();
	}
}
