package Arrays;

import java.util.Scanner;

public class LeadersInArray {
	static void leader(int[] arr){
		int max = -1;
		for(int i = arr.length - 1; i >= 0; i++){
			if(max < arr[i]){
				System.out.println(arr[i]);
				max = arr[i];
			}
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++)
				arr[i] = sc.nextInt();
			leader(arr);
		}
	}
}
