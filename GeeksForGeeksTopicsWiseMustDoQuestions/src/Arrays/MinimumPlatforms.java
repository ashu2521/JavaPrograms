package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MinimumPlatforms {
	static int minPlatforms(int[] arr, int[] dep, int n) {
		int platforms = 0;
		PriorityQueue<Integer> minheap = new PriorityQueue<>();
		ArrayList<Integer[]> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Integer[] a = new Integer[2];
			a[0] = arr[i];
			a[1] = dep[i];
			list.add(a);
		}
		Collections.sort(list, new Comparator<Integer[]>() {

			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				// TODO Auto-generated method stub
				return o1[0].compareTo(o2[0]);
			}

		});
		int max_no_platforms = 0;
		for (Integer[] timing : list) {
			if (max_no_platforms < minheap.size())
				max_no_platforms = minheap.size();
			System.out.println(timing[0] + " " + timing[1]);
			while (!minheap.isEmpty() && minheap.peek() <= timing[0]) {
				platforms--;
				minheap.remove();
			}

			minheap.add(timing[1]);
			System.out.println(minheap);
		}
		return max_no_platforms;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			int[] dep = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();
			for (int i = 0; i < n; i++)
				dep[i] = sc.nextInt();
			int result = minPlatforms(arr, dep, n);
			System.out.println(result);
		}
	}
}
