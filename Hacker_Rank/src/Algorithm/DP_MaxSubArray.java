package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class DP_MaxSubArray {

	static int[] maxSubarray(int[] arr) {
		// Complete this function
		int result[] = new int[2];
		int sum_seq = 0;
		int max_ending_here = 0;
		int max_so_far = Integer.MIN_VALUE;
		int m = Integer.MIN_VALUE;
		for(int x : arr){
			if(x > 0)
				sum_seq += x;
			if(x > m)
				m = x;
	        max_ending_here = Math.max(x, max_ending_here + x);
	        max_so_far = Math.max(max_so_far, max_ending_here);
		}
		
		result[1] = sum_seq;
		result[0] = max_so_far;
		if(m < 0)
			result[1] = m;
		
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int[] arr = new int[n];
			for (int arr_i = 0; arr_i < n; arr_i++) {
				arr[arr_i] = in.nextInt();
			}
			int[] result = maxSubarray(arr);
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
			}
			System.out.println("");

		}
		in.close();
	}
}
