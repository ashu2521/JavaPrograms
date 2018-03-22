package Arrays;

import java.util.Scanner;

public class ElementLeftSmallerRightGreater {
	static int findTheNumber(int[] arr, int n) {
		int[] left = new int[n];
		int[] right = new int[n];
		left[0] = arr[0];
		right[n - 1] = arr[n - 1];
		for (int i = 1; i < n; i++)
			left[i] = arr[i] > left[i - 1] ? arr[i] : left[i - 1];
		for (int i = n - 2; i >= 0; i--)
			right[i] = arr[i] < right[i + 1] ? arr[i] : right[i + 1];

		for (int i = 1; i < n - 1; i++){
			if(left[i] == right[i])
				return left[i];
		}
				
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();
			System.out.println(findTheNumber(arr, n));
		}
	}

}
