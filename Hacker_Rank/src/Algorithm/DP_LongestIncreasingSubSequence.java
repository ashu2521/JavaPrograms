package Algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class DP_LongestIncreasingSubSequence {
	static LinkedList<Queue<Integer>> list;

	/*
	 * To make use of recursive calls, this function must return two things: 1)
	 * Length of LIS ending with element arr[n-1]. We use max_ending_here for
	 * this purpose 2) Overall maximum as the LIS may end with an element before
	 * arr[n-1] max_ref is used this purpose. The value of LIS of full array of
	 * size n is stored in max_ref which is our final result
	 */
	static int lis(int arr[], int n) {
		// base case
		Queue<Integer> q = new LinkedList<>();
		q.add(arr[0]);
		list.set(0, q); 
		for (int i = 1; i < n; i++) {
			Queue<Integer> que = list.get(i);
			int rem = 0;
			que.add(arr[i]);
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && list.get(j).size() + 1 > list.get(i).size()) {
					que.removeAll(list.get(rem));
					rem = j;
					que.addAll(list.get(j));
				}
			}
			list.set(i, que);
		}
		int max = 0;
		for(int i = 0; i < n; i++)
			if(max < list.get(i).size())
				max = list.get(i).size();
		
		return max;

	}

	// The wrapper function for _lis()
	static int lisX(int arr[], int n) {
		// The max variable holds the result
		list = new LinkedList<>();
		for(int i = 0; i < n; i++)
			list.add(new LinkedList<Integer>());
		// The function _lis() stores its result in max
		int max_ref = lis(arr, n);
		for(int i = 0; i < n; i++)
			System.out.println(list.get(i));
		// returns max
		return max_ref;
	}

	// driver program to test above functions
	public static void main(String args[]) {
		int arr[] = { 13, 22, 9, 11, 12, 33, 21, 50, 41, 60 };
		int n = arr.length;
		System.out.println("Length of lis is " + lisX(arr, n) + "n");
	}
}
