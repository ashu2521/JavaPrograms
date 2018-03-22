package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Search_RadioTransmitter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] x = new int[n];
		for (int x_i = 0; x_i < n; x_i++) {
			x[x_i] = in.nextInt();
		}
		Arrays.sort(x);
		int startRange = x[0], endRange = x[0] + k, tower = x[0], towerCount = 1;
		for (int i = 0; i < n - 1; i++) {
			if (x[i + 1] > endRange) {
				startRange = x[i] + 1;
				endRange = startRange + 2 * k;
				towerCount++;
			}
		}
		System.out.println(towerCount);
	}

}
