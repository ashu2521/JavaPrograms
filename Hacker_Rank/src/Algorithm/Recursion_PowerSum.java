package Algorithm;

import java.util.Scanner;

public class Recursion_PowerSum {

	static int powerSum(int X, int N, int i, int sum) {
		// Complete this function
		int limit = (int) Math.ceil(Math.pow(X, (1.0 / N)))+1;
		if (i > limit || sum > X)
			return 0;
		if (sum == X)
			return 1;
		
		return powerSum(X, N, i+1, sum) + powerSum(X, N, i + 1, sum + (int)Math.pow(i, N));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int X = in.nextInt();
		int N = in.nextInt();
		int result = powerSum(X, N, 1, 0);
		System.out.println(result);
		in.close();
	}

}
