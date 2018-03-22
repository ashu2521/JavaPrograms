package Algorithm;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DP_LCS {

	static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	static int[] longestCommonSubsequence(int[] a, int[] b) {
		int n1 = a.length + 1;
		int n2 = b.length + 1;
		int lcs[][] = new int[n1][n2];
		// Complete this function
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++) {
				if (i == 0 || j == 0)
					lcs[i][j] = 0;
				else if (a[i - 1] == b[j - 1]) {
					lcs[i][j] = lcs[i - 1][j - 1] + 1;
				} else
					lcs[i][j] = max(lcs[i - 1][j], lcs[i][j - 1]);
			}
		}

		int sol = lcs[n1 - 1][n2 - 1];
		int lcs_series[] = new int[sol];

		int k = sol - 1;
		int i = n1 - 1, j = n2 -1;

		while(k >= 0) {
			if(lcs[i-1][j] == lcs[i][j]) {
				// Value came from smaller array1
				i--;
			} else if(lcs[i][j-1] == lcs[i][j]) {
				// Value came from smaller array2
				j--;
			} else {
				// Value came from the letter at the current index
				lcs_series[k--] = b[j-1];
				j--;
				i--;
			}
		}
		return lcs_series;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] b = new int[m];
		for (int b_i = 0; b_i < m; b_i++) {
			b[b_i] = in.nextInt();
		}
		int[] result = longestCommonSubsequence(a, b);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");

		in.close();
	}
}
