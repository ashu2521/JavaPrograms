package Algorithm;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Sorting_BigSort {
	static String[] bigSorting(String[] arr) {
		// Complete this function
		BigInteger[] big = new BigInteger[arr.length];
		for (int i = 0; i < arr.length; i++)
			big[i] = new BigInteger(arr[i]);
		Arrays.sort(big);
		
		String[] sorted_arr = new String[arr.length];
		for(int i = 0; i < arr.length; i++)
			sorted_arr[i] = "" + big[i];
		
		return sorted_arr;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] arr = new String[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.next();
		}
		String[] result = bigSorting(arr);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");
Math.f
		in.close();
	}
}
