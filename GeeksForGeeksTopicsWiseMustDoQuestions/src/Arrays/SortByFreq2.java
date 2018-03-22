package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SortByFreq2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			Map<Integer, Integer> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				if (map.containsKey(a[i])) {
					map.put(a[i], map.get(a[i]) + 1);
				} else {
					map.put(a[i], 1);
				}
			}

			ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

			Collections.sort(list, Comparator.comparing(Map.Entry<Integer, Integer>::getValue).reversed()
					.thenComparing(Map.Entry<Integer, Integer>::getKey));

			for (Map.Entry<Integer, Integer> entry : list) {
				int key = entry.getKey();
				int value = entry.getValue();

				while (value-- != 0) {
					System.out.print(key + " ");
				}
			}
			System.out.println();
		}
	}
}
