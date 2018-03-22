package Arrays;

import java.util.Scanner;

public class NonRepeatingElementInSortedArray {
	static int findElement(int[] arr, int n) {
		boolean flag = true;
		int ele = arr[0];
		for (int i = 1; i < n-1; i++) 
			if(arr[i] != arr[i-1] && arr[i] != arr[i+1])
				return arr[i];

		return arr[n - 1];
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
			System.out.println(findElement(arr, n));

		}

	}

}
