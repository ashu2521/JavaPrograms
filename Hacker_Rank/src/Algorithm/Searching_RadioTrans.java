package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Searching_RadioTrans {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		Arrays.sort(arr);
		int range = arr[0] + k;
		int count = 0;
		int lastTower = 0;
		for (int i = 0; i < n;) {
			while (i + 1 < n && arr[i + 1] <= range)
				i++;
			int endRange = arr[i] + k;
			count++;
			lastTower = arr[i];
			//System.out.println(arr[i] +" " + count);
			while (i < n && arr[i] <= endRange)
				i++;
			if (i < n) {
				 
				range = arr[i] + k;
			}
		}
		if (range > arr[n - 1] && lastTower != arr[n-1])
			count++;
		System.out.println(count);
	}
}
