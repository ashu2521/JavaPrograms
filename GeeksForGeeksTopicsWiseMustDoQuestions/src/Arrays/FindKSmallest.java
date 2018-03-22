package Arrays;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FindKSmallest {
	public static void main(String[] args) {
		// code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			Integer[] arr = new Integer[n];
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();

			int k = sc.nextInt();
			PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
			minHeap.addAll(Arrays.asList(arr));
			int x = 0;
			while(k-- > 0){
				x = minHeap.remove();
			}
			System.out.println(x);

		}

	}
}
