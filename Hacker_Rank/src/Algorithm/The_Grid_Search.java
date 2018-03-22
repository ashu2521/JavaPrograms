package Algorithm;

import java.util.Scanner;

public class The_Grid_Search {

	static String gridSearch(String[] G, String[] P) {
		// Complete this function
		for (int i = 0; i < G.length; i++) {
			for (int j = 0; j < G[i].length(); j++) {
				int index = G[i].substring(j).indexOf(P[0]);
				if (G.length - i < P.length || index == -1)
					break;

				boolean p = true;
				for (int k = i + 1, l = 1; l < P.length; k++, l++) {
					String s = G[k].substring(j);
					System.out.println(s.substring(index, index + P[l].length()) + " " + index + " " + P[l].length());
					if (!s.substring(index, index + P[l].length()).equals(P[l])) {
						System.out.println("Con" + i + " " + index);
						p = false;
						break;
					}
				}
				if (p)
					return "YES";
				if (index > j)
					j = index + 1;
			}
		}
		return "NO";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int R = in.nextInt();
			int C = in.nextInt();
			String[] G = new String[R];
			for (int G_i = 0; G_i < R; G_i++) {
				G[G_i] = in.next();
			}
			int r = in.nextInt();
			int c = in.nextInt();
			String[] P = new String[r];
			for (int P_i = 0; P_i < r; P_i++) {
				P[P_i] = in.next();
			}
			String result = gridSearch(G, P);
			System.out.println(result);
		}
		in.close();
	}

}
