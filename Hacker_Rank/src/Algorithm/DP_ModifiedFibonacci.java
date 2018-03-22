package Algorithm;

import java.math.BigInteger;
import java.util.Scanner;

public class DP_ModifiedFibonacci {
	static BigInteger fibonacciModified(int t1, int t2, int n) {
		// Complete this function
		int t = 0;
		BigInteger fib[] = new BigInteger[n];
		fib[0] = BigInteger.valueOf(t1);
		fib[1] = BigInteger.valueOf(t2);
		for (int i = 2; i < n ; i++) {
			fib[i] = fib[i-2].add(fib[i-1].pow(2));
		}
		for(int i = 0; i < n; i++)
			System.out.print(fib[i]+ " ");
		return fib[n-1];
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t1 = in.nextInt();
		int t2 = in.nextInt();
		int n = in.nextInt();
		System.out.println("\n"+fibonacciModified(t1, t2, n));
		in.close();
	}
}
