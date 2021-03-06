package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class StockBuyAndSell {
	static void findBuyAndSell(int[] arr, int n) {
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			int buy = -1;
			int sell = -1;
			while (i + 1 < n && arr[i + 1] <= arr[i])
				i++;
			if (i >= n - 1 && flag) {
				System.out.println("No Profit");
				break;
			}
			buy = i;

			while (i + 1 < n && arr[i + 1] > arr[i])
				i++;
			sell = i;
			if(buy != sell){
				System.out.print("(" + buy + " " + sell + ") ");
				flag = false;
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();

			findBuyAndSell(arr, n);
		}
	}
}
