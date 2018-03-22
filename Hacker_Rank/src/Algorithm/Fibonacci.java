package Algorithm;

import java.math.BigInteger;

public class Fibonacci {
	static BigInteger arr[];

	static BigInteger fib(int n) {
		if (n <= 1) {
			// System.out.println("1 "+arr[n]);
			return arr[n];
		}
		if (arr[n].compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) != 0) {
			// System.out.println(n+ " 2 "+arr[n]);
			return arr[n];
		} else {
			arr[n] = fib(n - 1).add(fib(n - 2));
			// System.out.println("3 "+arr[n]);
		}
		return arr[n];
	}

	public static void main(String args[]) {
		int n = 5;
		arr = new BigInteger[n + 1];
		for (int i = 0; i <= n; i++)
			arr[i] = BigInteger.valueOf(Integer.MAX_VALUE);
		arr[0] = BigInteger.ZERO;
		arr[1] = BigInteger.ONE;
		System.out.println(fib(n));
	}
}
