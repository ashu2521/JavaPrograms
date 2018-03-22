package Arrays;

import java.util.Scanner;

public class RevArrayInGrp {
	static void revGrp(int[] arr, int n, int k) {
		int limit = n / k;
		int off = n % k;
		int[] rev = new int[n];
		for (int q = 0; q < limit; q++) {
			int end = k * (q + 1) - 1;
			int start = k * q;
			for (int i = end, j = start; i >= start && j <= end; i--, j++)
				rev[j] = arr[i];
		}
		for (int i = n - 1, j = n - off; i >= n - off && j < n; i--, j++) {
			rev[j] = arr[i];
		}
		for (int x : rev)
			System.out.print(x + " ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();
			int k = sc.nextInt();
			revGrp(arr, n, k);
			System.out.println();
		}
	}
}
