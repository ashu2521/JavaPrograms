import java.util.Scanner;

class Graph {
	int node;
	int key;
	int parent;

	Graph(int node, int parent, int key) {
		this.node = node;
		this.parent = parent;
		this.key = key;
	}

	public int getNode() {
		return node;
	}

	public void setNode(int node) {
		this.node = node;
	}

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}
}

public class MST_Prims_heap {
	static Graph heap[];
	static final int FRONT = 1;
	static int heap_size;

	public static int get_heapSize() {
		return heap_size;
	}

	public static int parent(int i) {
		return i / 2;
	}

	public static int left_child(int i) {
		return 2 * i;
	}

	public static int right_child(int i) {
		return 2 * i + 1;
	}

	public static void swap(int i, int j) {
		Graph temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}

	public static void min_heapify(int i) {
		int l = left_child(i);
		int r = right_child(i);
		int n = get_heapSize();
		int min = i;
		if (l <= n && heap[l].getKey() < heap[min].getKey())
			min = l;
		if (r <= n && heap[r].getKey() < heap[min].getKey())
			min = r;
		if (min != i) {
			swap(min, i);
			min_heapify(min);
		}
	}

	public static void build_heap() {
		for (int i = get_heapSize() / 2; i > 0; i--) {
			min_heapify(i);
		}
	}

	public static Graph extract_Min() {
		Graph min = heap[FRONT];
		heap[FRONT] = heap[get_heapSize()];
		heap_size--;
		min_heapify(FRONT);
		return min;
	}

	public static void decrease_key(int i, int key) {
		if (heap[i].getKey() > key) {
			heap[i].setKey(key);
			while (i > 1 && heap[i].getKey() < heap[parent(i)].getKey()) {
				swap(i, parent(i));
				i = parent(i);
			}
		}
	}

	public static int search_node(int i) {
		int node = -1;
		for (int j = 1; j <= get_heapSize(); j++) {
			if (heap[j].getNode() == i)
				node = j;
		}
		return node;
	}

	public static int Algorithm(int G[][], int cost[][], int r) {
		int min_cost = 0;
		int n = G[0].length;
		for (int i = 1; i < n; i++) {
			heap[i] = new Graph(i, G[1][i], G[0][i]);
		}
		build_heap();
		// for (int i = 1; i <= get_heapSize(); i++)
		// System.out.print("[" + heap[i].getNode() + " " + heap[i].getKey() + "
		// " + heap[i].getParent() + "] ");
		// System.out.println("");

		while (get_heapSize() > 0) {
			// System.out.println("hello");
			Graph g = extract_Min();
			int curr_node = g.getNode();
			min_cost += g.getKey();
			for (int i = 1; i < n; i++) {
				int adj_node_index = search_node(i);
				if (cost[curr_node][i] != Integer.MAX_VALUE && adj_node_index != -1
						&& cost[curr_node][i] < heap[adj_node_index].getKey()) {
					heap[adj_node_index].setParent(curr_node);
					decrease_key(adj_node_index, cost[curr_node][i]);
				}
			}
			// for (int i = 1; i <= get_heapSize(); i++)
			// System.out.print("[" + heap[i].getNode() + " " + heap[i].getKey()
			// + " " + heap[i].getParent() + " ] ");
			// System.out.println("");

		}
		return min_cost;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		heap_size = v;
		heap = new Graph[v + 1];
		int cost[][] = new int[v + 1][v + 1];
		int G[][] = new int[2][v + 1];
		for (int i = 0; i <= v; i++) {
			G[0][i] = Integer.MAX_VALUE;
			G[1][i] = -1;
			for (int j = 0; j <= v; j++) {
				cost[i][j] = Integer.MAX_VALUE;
			}
		}
		for (int i = 0; i < e; i++) {
			int u1 = sc.nextInt();
			int u2 = sc.nextInt();
			int w = sc.nextInt();
			cost[u1][u2] = w;
			cost[u2][u1] = w;
		}
		int r = sc.nextInt();
		G[0][r] = 0;
		System.out.println(Algorithm(G, cost, r));
	}

}
