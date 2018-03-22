package Algorithm;

import java.util.Scanner;

public class DP_StockMaximise {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int price[] = new int[n];
			for (int j = 0; j < n; j++)
				price[j] = sc.nextInt();
			int max = n-1;
			int  shares = 0, j = 0;
			long total = 0L, money = 0L;
			for(j = n-2; j >= 0; j--){
				if(price[max] > price[j]){
					money += price[j];
				}
				else{
					total += price[max] * (max - j - 1) - money;
					money = 0;
					max = j;
				}
			}
			//System.out.println( max+" " + price[max]+ " " + (price[max] *(long)max));
			if(max != 0)
				total += (price[max] * (long)max) - money;
			
			System.out.println(total);

		}
	}
}
