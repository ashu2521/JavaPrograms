package Algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class BomberMan {
	static String[] bomberMan(int n, String[] grid) {
		// Complete this function
		int[][] arr = new int[grid.length][grid[1].length()];
		for (int i = 0; i < grid.length; i++)
			for (int j = 0; j < grid[i].length(); j++)
				arr[i][j] = grid[i].charAt(j) == '0' ? 2 : 0;
		int last_planted = 0;
		for (int k = 1; k < n; k++) {
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length(); j++) {
					if (arr[i][j] != 0)
						arr[i][j]--;

					else if (arr[i][j] == 0 && (k - last_planted) != 2) {
						arr[i][j]--;
						if(i != 0 && j != 0){
						
						}
						

					} else if (arr[i][j] == 0 && (k - last_planted) == 2) {
						arr[i][j] = 3;
						last_planted = k;
					}
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		int c = in.nextInt();
		int n = in.nextInt();
		String[] grid = new String[r];
		for (int grid_i = 0; grid_i < r; grid_i++) {
			grid[grid_i] = in.next();
		}
		String[] result = bomberMan(n, grid);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");

		in.close();
	}
}
