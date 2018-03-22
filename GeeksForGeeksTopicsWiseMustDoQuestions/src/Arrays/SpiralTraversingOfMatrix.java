package Arrays;

import java.util.Scanner;

public class SpiralTraversingOfMatrix {	
	static void printSpiral(int[][] arr, int n) {
		int start = 0;
		int limit = n * n;
		int x = 0;
		int i = 0, j = 0;
		while (x < limit) {
			for (; x < limit && j < n; j++) {
				System.out.print(arr[i][j] + " ");
				x++;
			}
			i++;
			j--;
			for (; x < limit && i < n; i++) {
				System.out.print(arr[i][j] + " ");
				x++;
			}
			j--;
			i--;
			for (; x < limit && j >= start; j--) {
				System.out.print(arr[i][j] + " ");
				x++;
			}
			i--;
			j++;
			start++;
			for (; x < limit && i >= start; i--) {
				System.out.print(arr[i][j] + " ");
				x++;
			}
			j++;
			i++;
			n--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n =sc.nextInt();
			int[][] arr = new int[n][n];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					arr[i][j] = sc.nextInt();

			printSpiral(arr, n);
			System.out.println("");
		}
	}
}