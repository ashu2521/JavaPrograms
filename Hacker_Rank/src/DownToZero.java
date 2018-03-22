import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DownToZero {
	public static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static int min(int a, int b) {
		return a > b ? b : a;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Q = in.nextInt();
		for (int i = 0; i < Q; i++) {
			int N = in.nextInt();
			int count = 0;
			while (N > 0) {
				int X = N;
				int y = 2;
				int max_y = N;
				while (y <= (X / y)) {
					int max_fac = 0;
					if (X % y == 0) {
						max_fac = max(y, X / y);
						max_y = min(max_y, max_fac);
						System.out.println("========"+y+" "+(X/y)+"========");
					}
					y++;
				}
				if(max_y == N)
					N--;
				else
					N = max_y;
				System.out.println(N);
				count++;
			}
			System.out.println(count);

		}
	}
}
