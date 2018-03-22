package Arrays;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class SortingByFreq {
	static void sortByFreq(int[] arr, int n) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (map.get(arr[i]) != null)
				map.put(arr[i], map.get(arr[i]) + 1);
			else
				map.put(arr[i], 1);
		}
		int k = 0;
		while(!map.isEmpty()){
			int max = Integer.MIN_VALUE;
			int key = 0;
			for(Map.Entry<Integer, Integer> entry : map.entrySet()){
				int freq = entry.getValue();
				if(freq > max){
					max = freq;
					key = entry.getKey();
				}
			}
			map.remove(key);
			for(int i = 0;i < max; i++){
				arr[k++] = key;
			}
		}
		for(int x:arr)
			System.out.print(x + " ");
		System.out.println();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				if (arr[i] > max)
					max = arr[i];
			}

			sortByFreq(arr, n);
		}
	}
}
