package Arrays;

import java.util.Scanner;

public class TrappingRainWater {
	public static int TotalRainTrapped(int[] arr, int n){
		int trappedWater = 0;
		for(int i = 0;i < n;){
			int j = i+1;
			int lastIndex = j;
			int max = 0;
			while(j < n && arr[j] <= arr[i]){
				if(arr[j] > max){
					max = arr[j];
					lastIndex = j;
				}
				j++;
			}
			if(j < n && arr[i] < arr[j]){
				max = arr[i];
				lastIndex = j;
			}
			
			System.out.println(max + "  " + lastIndex);
			for(int x = i+1; x < lastIndex && x < n; x++)
				trappedWater += (max - arr[x]);
			i = lastIndex;
			
		}
		return trappedWater;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0;i < n; i++)
				arr[i] = sc.nextInt();
			
			
			System.out.println(TotalRainTrapped(arr, n)+" ===");
		}
	}
}
