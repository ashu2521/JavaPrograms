import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Question3_1 {
	static String simplestSum(int k, long a, long b) {
		// Complete this function
		BigInteger sum = BigInteger.ZERO;
		ArrayList<Long> list1 = new ArrayList<>();
		ArrayList<Long> list2 = new ArrayList<>();
		list1.add(1l);
		list2.add(1l);

		long ele = 1, fact = (long) k, j = 2l, power = 1l;
		final long RES = 1000000000 + 7;
		long i = 0l;
		for (i = k; i < b;) {

			list1.add(i + 1);
			ele += (i + 1);
			i += (long) Math.pow(k, j);
			list2.add(ele);
			j++;
		}
		list1.add(i + 1);
		ele += (i + 1);
		i += (long) Math.pow(k, j);
		list2.add(ele);
		j++;

		// list1.get(1);
		int p = 0;
		for (p = 0; p < list1.size(); p++) {
			if (list1.get(p) > a && list1.get(p) <= b) {
				sum = sum
						.add((new BigInteger("" + (list1.get(p) - a))).multiply(new BigInteger("" + list2.get(p - 1))));
				a = list1.get(p);
			} else if (list1.get(p) > b) {
				sum = sum
						.add((new BigInteger("" + (b - a + 1))).multiply(new BigInteger("" + list2.get(p - 1))));

			}
		}

		System.out.println(list1);
		System.out.println(list2);

		return "" + sum.mod(new BigInteger("" + RES));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			int k = in.nextInt();
			long a = in.nextLong();
			long b = in.nextLong();
			System.out.println(simplestSum(k, a, b));
		}
		in.close();
	}
}
