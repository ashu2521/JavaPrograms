package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RelativeSorting {
	static int findEle(int[] arr, int n, int ele){
		int 
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void relSort(int[] toSort, int[] relArr, int n, int m) {
		Arrays.sort(toSort);
		int index = 0;
		int[] temp = toSort.clone();
		int[] visited = new int[n];
		for (int i = 0; i < m; i++) {
			int j = findEle(toSort, n, relArr[i]);
			

		}
		for (int i = 0; i < n; i++)
			System.out.print(toSort[i] + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] arr1 = new int[n];
			int[] arr2 = new int[m];
			for (int i = 0; i < n; i++)
				arr1[i] = sc.nextInt();
			for (int i = 0; i < m; i++)
				arr2[i] = sc.nextInt();

			relSort(arr1, arr2, n, m);
			System.out.println("");
		}

	}

}
