import java.util.Scanner;

public class MST_Prims_NoHeap {
	public static int Algorithm(int n, int[][] cost, int e, int t[][]) {
		int min_cost = cost[t[1][0]][t[1][1]];
		int near[] = new int[n + 1];
		int l = t[1][0];
		int k = t[1][1];
		for (int i = 1; i <= n; i++) {
			if (cost[i][l] < cost[i][k])
				near[i] = l;
			else
				near[i] = k;
		}
		int s = 2;
		near[l] = 0;
		near[k] = 0;
		for (int i = 2; i < n; i++) {
			int min_node = 0;
			for (int j = 1; j <= n; j++)
				if (near[j] != 0 && cost[near[j]][j] < cost[near[min_node]][min_node])
					min_node = j;
			t[s][1] = min_node;
			t[s][0] = near[min_node];
			s++;
			min_cost += cost[min_node][near[min_node]];
			near[min_node] = 0;
			
			for (int j = 1; j <= n; j++) {
				if (near[j] != 0 && cost[min_node][j] < cost[j][near[j]]){
					near[j] = min_node;
				}
			}
		}
		return min_cost;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int G[][] = new int[v + 1][v + 1];
		int t[][] = new int[v][2];
		for(int i = 0; i <= v; i++)
			for(int j = 0; j <= v; j++)
				G[i][j] = Integer.MAX_VALUE;	
		int e = sc.nextInt();
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < e; i++) {
			int u1 = sc.nextInt();
			int u2 = sc.nextInt();
			int w = sc.nextInt();
			if (w < min) {
				min = w;
				t[1][0] = u1;
				t[1][1] = u2;
			}
			G[u1][u2] = w;
			G[u2][u1] = w;
		}
		//System.out.println(min);
		System.out.println(Algorithm(v, G, e, t));
	}
}
