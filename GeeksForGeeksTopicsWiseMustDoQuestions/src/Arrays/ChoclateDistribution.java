package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ChoclateDistribution {
	static int findMinDiff(int[] arr, int n, int k) {
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		for (int i = n - 1; i >= k - 1; i--) {
			//System.out.println(i + " " + (i + 1 - k));
			if (arr[i] - arr[i + 1 - k] < min)
				min = arr[i] - arr[i + 1 - k];

		}
		return min;
	}

	public static void main(String[] args) {
		// code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();
			int k = sc.nextInt();
			System.out.println(findMinDiff(arr, n, k));
		}
	}
}
