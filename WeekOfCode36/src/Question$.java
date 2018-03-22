import java.util.HashMap;
import java.util.Scanner;

public class Question$ {
	static long raceAgainstTime(int n, int mason_height, int[] heights, int[] prices) {
		// Complete this function
		int curr_height_global = mason_height;
		long cost = n;
		for (int i = 0; i < heights.length; i++) {
			if (heights[i] > curr_height_global) {
				cost += Math.abs(curr_height_global - heights[i]);
				cost += prices[i];
				curr_height_global = heights[i];
				System.out.println("case");
			} else if (i <= heights.length - 1 && heights[i] <= curr_height_global) {
				int local_heigth = heights[i];
				long price = Math.abs(curr_height_global - heights[i]) + prices[i];
				int j = i+1;
				System.out.println("start " + price + " " + i +" " + curr_height_global + " " + local_heigth);
				while(j < heights.length && heights[j] >= local_heigth){
					price += Math.abs(local_heigth - heights[j]);
					price += prices[j];
					local_heigth = heights[j];
					//System.out.println(price + " " + i +" " + curr_height_global + " " + local_heigth);
					if(price >= 0){
						break;
					}
					j++;
				}
				if(price < 0){
					cost += price;
					i = j - 1;
					curr_height_global = local_heigth;
				}
			}
			System.out.println(i+" "+cost); 
		}
		return cost;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int mason_height = in.nextInt();
		int[] heights = new int[n - 1];
		for (int heights_i = 0; heights_i < n - 1; heights_i++) {
			heights[heights_i] = in.nextInt();
		}
		int[] prices = new int[n - 1];
		for (int prices_i = 0; prices_i < n - 1; prices_i++) {
			prices[prices_i] = in.nextInt();
		}
		System.out.println(raceAgainstTime(n, mason_height, heights, prices));
		in.close();
	}
}
