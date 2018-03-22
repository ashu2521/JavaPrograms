package Arrays;

import java.util.Scanner;

public class MissingNumber {
	public static void main(String[] args) {
		// code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			int[] arr = new int[n - 1];
			for(int i = 0; i < n - 1; i++)
				arr[i] = sc.nextInt();
			int sum = (n * (n + 1)) / 2;
			for(int x : arr)
				sum -= x;
			
			System.out.println(sum);
		}
		sc.close();
	}
}
