package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PythogorasTriplet {
	static String tripletCheck(int[] arr, int n) {
		Arrays.sort(arr);
		for (int i = n - 1; i >= 2; i--) {
			int l = 0;
			int r = i - 1;
			while (l < r) {
				if (arr[l] + arr[r] < arr[i])
					l++;
				else if (arr[l] + arr[r] > arr[i])
					r--;
				else if (arr[l] + arr[r] == arr[i])
					return "YES";

			}
		}
		return "NO";
	}

	public static void main(String[] args) {
		// code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				arr[i] = x * x;
			}
			System.out.println(tripletCheck(arr, n));
		}
	}
}
