package Arrays;

import java.util.*;
import java.lang.*;
import java.io.*;

class Equilibrium {
	static int findEquilibrium(int[] arr) {
		if (arr.length == 1){
		    return 1;
		}
		int sum = 0;
		for (int i = 1; i < arr.length; i++)
			sum += arr[i];

		int sum_init = arr[0];

		for (int i = 1; i < arr.length; i++) {
			sum -= arr[i];
		//	System.out.println(sum +" " +sum_init);
			if (sum == sum_init)
				return i + 1;

			sum_init += arr[i];
		}

		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++)
			    arr[i] = sc.nextInt();
			System.out.println(findEquilibrium(arr));
		}
	}
}