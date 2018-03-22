package Arrays;

import java.util.Scanner;

public class SubArrayWithGivenSum {
	static int[] algo(int[] arr, int sum) {
		int[] sol = new int[2];
		int curr_sum = arr[0];
		int i = 0;
		sol[0] = 0;
		for (i = 1; i < arr.length; i++) {
			while (curr_sum > sum && sol[0] < i) {
				curr_sum -= arr[sol[0]];
				sol[0]++;
			}
			System.out.println(i + " " + sol[0] + " " + sol[1] + " " + curr_sum);
			if (curr_sum == sum) {
				sol[1] = i;
				sol[0]++;
				System.out.println(("Break"));
				break;
			}
			curr_sum += arr[i];
			System.out.println(i + " " + sol[0] + " " + sol[1] + " " + curr_sum);
		}
		if (sol[1] == 0) {
			while (curr_sum > sum && sol[0] < i) {
				curr_sum -= arr[sol[0]];
				sol[0]++;
			}
			if (curr_sum == sum){
				sol[0]++;
				sol[1] = i;
			}
		}
		return sol;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int sum = sc.nextInt();
			int[] arr = new int[n];
			int i = -1;
			while (i++ < n - 1)
				arr[i] = sc.nextInt();
			i = -1;
			while (i++ < n - 1) {
				System.out.print("(" + (i + 1) + " " + arr[i] + ")");
				if (i % 10 == 0)
					System.out.println("");
			}

			int[] sol = algo(arr, sum);
			if (sol[1] == 0)
				System.out.println(-1);
			else
				System.out.println(sol[0] + " " + sol[1]);

		}
	}
}
