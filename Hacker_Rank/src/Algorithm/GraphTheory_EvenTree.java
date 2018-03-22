package Algorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class GraphTheory_EvenTree {
	static int nodeNum[];

	public static int findNodes(ArrayList<LinkedList<Integer>> list, int i) {
		LinkedList<Integer> li = list.get(i);
		Iterator<Integer> it = li.iterator();
		if (li == null)
			return 0;
		int node = li.size();
		while (it.hasNext()) {
			int index = it.next();
			if (nodeNum[index] == 0)
				node += findNodes(list, index);
			else
				node += nodeNum[index];

		}
		nodeNum[i] = node;
		return node;

	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		nodeNum = new int[n + 1];
		ArrayList<LinkedList<Integer>> vlist = new ArrayList<>();
		for (int i = 0; i <= n; i++)
			vlist.add(new LinkedList<Integer>());

		for (int i = 0; i < m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			LinkedList<Integer> list = vlist.get(v);
		//	if (list == null)
			//	list = new LinkedList<Integer>();
			list.add(u);
			vlist.set(v, list);

		}
		/*
		 * for (int i = vlist.size()-1; i > 0; i--) {
		 * System.out.println(vlist.get(i)); }
		 */
		int count = 0;
		for (int i = vlist.size() - 1; i > 1; i--) {
			if ((1 + findNodes(vlist, i)) % 2 == 0)
				count++;
		}
		System.out.println(count);
	}
}
