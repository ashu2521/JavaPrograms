import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Question3 {
	static long simplestSum(int k, long a, long b) {
		// Complete this function
		long sum = 0l, ele = 1, j = 2l, power = 1l;
		final long RES = 1000000000 + 7;
		long i = 0;
		for (i = k; i < b;) {
			if (i >= a) {
				sum += ele * (i - a + 1);
				a = i + 1;
			}
			ele += (i + 1);
			i += Math.pow(k, j);
			j++;
			System.out.println(i+ " " + ele+ " " + sum);
		}
		sum += ele * (b - a + 1);
		return (sum % RES);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			int k = in.nextInt();
			long a = in.nextLong();
			long b = in.nextLong();
			long result = simplestSum(k, a, b);
			System.out.println(result);
		}
		in.close();
	}
}
