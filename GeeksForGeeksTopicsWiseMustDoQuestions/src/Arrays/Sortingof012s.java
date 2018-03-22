package Arrays;

import java.util.Scanner;

public class Sortingof012s {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0;i < n; i++)
				arr[i] = sc.nextInt();
			
			int[] count = new int[3];
			for(int i = 0; i < n; i++)
				count[arr[i]]++;
			
			for(int i = 1; i < 3; i++){
				count[i] += count[i - 1];
			}
			int[] sortedArr = new int[count[2]+1];
			for(int i = 0; i < n; i++){
				sortedArr[count[arr[i]]] = arr[i];
				count[arr[i]]--;
			}
			for(int i = 1; i <= n; i++)
				System.out.print(sortedArr[i] +" ");
			System.out.println("");;
		}
	}
}
