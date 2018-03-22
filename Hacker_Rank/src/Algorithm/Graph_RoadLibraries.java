package Algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph_RoadLibraries {
	static int[] lib;
	static long unconnected;

	static void calculateCost(ArrayList<LinkedList<Integer>> G, int city) {
		lib[city] = 1;
		LinkedList<Integer> link = G.get(city);
		for (int i : link) {
			if (lib[i] == 0) {
				calculateCost(G, i);
			}
		}
	}

	static long roadsAndLibraries(int n, int c_lib, int c_road, ArrayList<LinkedList<Integer>> G) {
		// Complete this function

		long cost = 0l;
		for (int i = 1; i <= n; i++) {
			if (lib[i] == 0) {
				lib[i] = 1;
				calculateCost(G, i);
				unconnected++;
				// System.out.println(cost);
			}
		}
		cost = ((unconnected * (long) c_lib) + (n - unconnected) * (long) c_road);
		return cost;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			int n = in.nextInt();
			int m = in.nextInt();
			int c_lib = in.nextInt();
			int c_road = in.nextInt();
			Graph_RoadLibraries.lib = new int[n + 1];
			ArrayList<LinkedList<Integer>> G = new ArrayList<>();
			for (int i = 0; i <= n; i++)
				G.add(new LinkedList<>());

			for (int cities_i = 0; cities_i < m; cities_i++) {
				int u = in.nextInt();
				int v = in.nextInt();
				LinkedList<Integer> link1 = G.get(u);
				LinkedList<Integer> link2 = G.get(v);
				link1.add(v);
				link2.add(u);
				G.set(u, link1);
				G.set(v, link2);

			}
			Graph_RoadLibraries.unconnected = 0;
			long result = n * (long) c_lib;
			if (m != 0 && c_lib > c_road) {
				result = roadsAndLibraries(n, c_lib, c_road, G);
			}
			System.out.println(result);
		}
		in.close();
	}
}
