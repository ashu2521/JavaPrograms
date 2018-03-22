package Algorithm;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

/*
class Cost_Indices {
	int cost;
	int index;

	public Cost_Indices(int cost, int index) {
		// TODO Auto-generated constructor stub
		this.cost = cost;
		this.index = index;
	}
}

class Checker implements Comparator<Cost_Indices> {

	@Override
	public int compare(Cost_Indices o1, Cost_Indices o2) {
		// TODO Auto-generated method stub
		if (o1.cost < o2.cost)
			return 1;
		else if (o1.cost > o2.cost)
			return -1;
		else
			return 0;
	}

}
*/
public class Greedy_CuttingBoards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int v_seg = 1;
			int h_seg = 1;
			int m = sc.nextInt();
			int n = sc.nextInt();
			int vertical[] = new int[m - 1];
			int horizontal[] = new int[n - 1];
			for (int j = 0; j < m - 1; j++)
				vertical[j] = sc.nextInt();
			Arrays.sort(vertical);
			for (int j = 0; j < n - 1; j++)
				horizontal[j] = sc.nextInt();
			Arrays.sort(horizontal);

			int j = 0, k = 0;
			int cut = 0;
			int div = 1000000000 + 7;
			for (j = vertical.length - 1, k = horizontal.length - 1; j >= 0 && k >= 0;) {

				if (vertical[j] >= horizontal[k]) {
					cut += h_seg * vertical[j];
					v_seg++;
					System.out.println("Horizontal cut\t" + vertical[j]);
					j--;

				} else if (vertical[j] < horizontal[k]) {
					cut += v_seg * horizontal[k];
					h_seg++;
					System.out.println("Vertical cut\t" + horizontal[k]);
					k--;
				}
			}
			while (j >= 0) {
				cut += h_seg * vertical[j];
				v_seg++;
				j--;
			}
			while (k >= 0) {
				cut += v_seg * horizontal[k];
				h_seg++;
				k--;
			}
			System.out.println(div);

		}
	}

}
