package Algorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphTheory_BSFS_ShortestSearch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			int n = in.nextInt();
			int m = in.nextInt();
			ArrayList<LinkedList<Integer>> list = new ArrayList<>();
			for (int i = 0; i < n + 1; i++)
				list.add(new LinkedList<Integer>());
			for (int a1 = 0; a1 < m; a1++) {
				int u = in.nextInt();
				int v = in.nextInt();
				LinkedList<Integer> li1 = list.get(v);
				LinkedList<Integer> li2 = list.get(u);
				li1.add(u);
				li2.add(v);
			}
			int s = in.nextInt();
			int visited[] = new int[n + 1];
			visited[s] = -2;
			Queue<Integer> que1 = new LinkedList<>();
			int level = 1;
			que1.add(s);
			while (!que1.isEmpty()) {
				Queue<Integer> que2 = new LinkedList<>();
				while(!que1.isEmpty()){
					int node = que1.poll();
					LinkedList<Integer> li = list.get(node);
					Iterator<Integer> it = li.iterator();
					while(it.hasNext()){
						int v = it.next();
						if(visited[v] == 0){
							visited[v] = level;
							que2.add(v);
						}
					}
				}
				level++;
				que1 = que2;					
			}
			for (int i = 1; i < n + 1; i++) {
				if (visited[i] == -2)
					continue;
				if (visited[i] == 0)
					System.out.print(-1 + " ");
				else
					System.out.print(visited[i] * 6 + " ");
			}
		}
		in.close();
	}
}
