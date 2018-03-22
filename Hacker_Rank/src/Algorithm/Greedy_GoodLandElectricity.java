package Algorithm;

import java.util.Scanner;

public class Greedy_GoodLandElectricity {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] tower = new int[N];
		int ON = 0;
		for (int i = 0; i < N; i++)
			tower[i] = sc.nextInt();

		int lastOnTower = -1;
		for (int i = K - 1; i < N;) {
			System.out.println("i:"+ i);
			while (i > lastOnTower && tower[i] == 0 )
				i--;

			if (i <= lastOnTower) {
				ON = -1;
				break;
			}

			lastOnTower = i;
			ON++;
			
			System.out.println("last :" + lastOnTower);
			
			int rangeStart = lastOnTower + K;
			i = lastOnTower + 2 * (K - 1) + 1;

			if (rangeStart < N && i >= N)
				i = N-1;
			
			System.out.println("ON:"+ ON);

		}

		System.out.println(ON);

	}
}
