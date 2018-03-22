package Algorithm;

import java.util.Scanner;

public class DP_RedJohnIsBack {
	static int redJohn(int n) {
		// Complete this function
		int arr[] = new int[n + 1];
		arr[0] = 1;
		for (int i = 1; i <= n; i++) {
			if (i < 4)
				arr[i] = 1;
			else if (i == 4)
				arr[i] = 2;
			else {
				arr[i] = arr[i - 1] + arr[i - 4];
			}
		}
		
		n = arr[n];
		System.out.println(n);
		boolean p[] = new boolean[n+1];
		for(int i = 0; i <= n; i++)
			p[i] = true;
		for(int i = 2; i*i <= n; i++){
			for(int j = 2*i; j <= n; j += i){
				p[j] = false;
			}
		}
		for(int i = 0; i <= n; i++)
			System.out.println(p[i]);
		int count = 0;
		for(int i = 2; i <= n; i++)
			if(p[i] == true)
				count++;
		return count;	
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int result = redJohn(n);
			System.out.println(result);
		}
		in.close();
	}
}
