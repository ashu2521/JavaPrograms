import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class freq {

	static int migratoryBirds(int n, int[] ar) {
		// Complete this function
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(ar[i], 0);
		}
		for (int i = 0; i < n - 1; i++) {
			int value = map.get(ar[i]) + 1;
			map.put(ar[i], value);
		}
		System.out.println(map);
		int maxValue = Integer.MIN_VALUE, minKey = Integer.MAX_VALUE;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() >= maxValue) {
				if (entry.getValue() != maxValue) {
					minKey = entry.getKey();
					maxValue = entry.getValue();
					System.out.println(minKey + " " + maxValue);

				} else {
					if (entry.getKey() < minKey){
						minKey = entry.getKey();
					System.out.println("Entered");
					}
				}

			}
		}

		return minKey;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = migratoryBirds(n, ar);
		System.out.println(result);
	}
}
