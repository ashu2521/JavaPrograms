package Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class LargestSubseqSum {
	static int lis(int arr[], int n) {
		// base case
		int[] mis = new int[n];
		for(int i = 0; i < n; i++)
			mis[i] = arr[i];
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && mis[j] + arr[i] > mis[i]) {
					mis[i] = mis[j] + arr[i];
				}
			}
		}
		int max = 0;
		for(int x : mis)
			if(x > max)
				max = x;

		return max;

	}
	// driver program to test above functions
	public static void main(String args[]) {
		int arr[] = { 2, 5, 3, 7, 11, 8, 10, 13, 6 };
		int n = arr.length;
		System.out.println(lis(arr, n));
	}
}
