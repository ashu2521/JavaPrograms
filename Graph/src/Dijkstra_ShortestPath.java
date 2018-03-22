import java.util.Scanner;

class Grph {
	int node;
	int weight;

	Grph(int node, int weigth) {
		this.node = node;
		this.weight = weigth;
	}

	public int getNode() {
		return node;
	}

	public void setNode(int node) {
		this.node = node;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}

public class Dijkstra_ShortestPath {
	static Grph heap[];
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
		Grph temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}

	public static void min_heapify(int i) {
		int l = left_child(i);
		int r = right_child(i);
		int n = get_heapSize();
		int min = i;
		if (l <= n && heap[l].getWeight() < heap[min].getWeight())
			min = l;
		if (r <= n && heap[r].getWeight() < heap[min].getWeight())
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

	public static int search_node(int i) {
		int node = -1;
		for (int j = 1; j <= get_heapSize(); j++) {
			if (heap[j].getNode() == i)
				node = j;
		}
		return node;
	}

	public static Grph extract_Min() {
		Grph min = heap[FRONT];
		heap[FRONT] = heap[get_heapSize()];
		heap_size--;
		min_heapify(FRONT);
		return min;
	}

	public static void decrease_key(int node, int key) {
		int i = search_node(node);
		if (heap[i].getWeight() > key) {
			heap[i].setWeight(key);
			while (i > 1 && heap[i].getWeight() < heap[parent(i)].getWeight()) {
				swap(i, parent(i));
				i = parent(i);
			}
		}
	}

	public static void printHeap() {
		for (int i = 1; i <= get_heapSize(); i++) {
			System.out.print("[" + heap[i].getNode() + " " + heap[i].getWeight() + "] ");
		}
		System.out.println("");
	}

	public static void Algorithm(int w[][], int n, int e, int s) {
		int G[] = new int[n + 1];
		heap = new Grph[n + 1];
		heap_size = n;
		for (int i = 0; i <= n; i++)
			G[i] = Integer.MAX_VALUE;
		G[s] = 0;
		for (int i = 0; i <= n; i++)
			heap[i] = new Grph(i, G[i]);
		build_heap();
		printHeap();
		while (get_heapSize() > 0) {
			// Extract Minimum distance vertices from the last Edge
			Grph node = extract_Min();
			G[node.getNode()] = node.getWeight();
			if (node.weight == Integer.MAX_VALUE)
				break;
			//Relaxing all nodes connected to the minimum weighted node and Hence finding the least distance to all nodes from source
			for (int i = 1; i <= n; i++) {
				if (G[i] == Integer.MAX_VALUE && w[node.getNode()][i] != Integer.MAX_VALUE
						&& node.getWeight() + w[node.getNode()][i] < heap[search_node(i)].getWeight())
					decrease_key(i, node.getWeight() + w[node.getNode()][i]);
			}
			printHeap();
		}
		for (int i = 1; i <= n; i++) {
			if (i != s) {
				if (G[i] == Integer.MAX_VALUE)
					System.out.print(-1 + " ");
				else
					System.out.print(G[i] + " ");
			}
		}
		System.out.println("");

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int m = 0; m < t; m++) {
			int n = sc.nextInt();
			int e = sc.nextInt();
			int w[][] = new int[n + 1][n + 1];
			for (int i = 0; i <= n; i++) {
				for (int j = 0; j <= n; j++) {
					w[i][j] = Integer.MAX_VALUE;
				}
			}
			for (int i = 0; i < e; i++) {
				int u1 = sc.nextInt();
				int u2 = sc.nextInt();
				int r = sc.nextInt();
				if (w[u1][u2] > r) {
					w[u1][u2] = r;
					w[u2][u1] = r;
				}
			}
			int start_node = sc.nextInt();
			Algorithm(w, n, e, start_node);
		}
	}
}
