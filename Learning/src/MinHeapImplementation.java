import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MinHeapImplementation {
	private static int[] Heap;
	private static final int FRONT = 1;

	private int parent(int i) {
		return i / 2;
	}

	private int rightChild(int i) {
		return 2 * i + 1;
	}

	private int leftChild(int i) {
		return 2 * i;
	}

	private void swap(int smallest, int i) {
		int temp = Heap[i];
		Heap[i] = Heap[smallest];
		Heap[smallest] = temp;
	}

	private void HeapifyDown(int i, int n) {
		int leftChild = leftChild(i);
		int rightChild = rightChild(i);
		int smallest = i;
		if (leftChild < n && Heap[smallest] > Heap[leftChild])
			smallest = leftChild;
		if (rightChild < n && Heap[smallest] > Heap[rightChild])
			smallest = rightChild;

		if (smallest != i) {
			swap(smallest, i);
			HeapifyDown(smallest, n);
		}
	}

	private void HeapifyUp(int i) {
		while (Heap[i] < Heap[parent(i)]) {
			swap(Heap[i], Heap[parent(i)]);
			i = parent(i);
		}

	}

	private int getMin() {
		return Heap[FRONT];
	}

	private void heapify(int n) {

		for (int i = n / 2; i > 0; i--)
			HeapifyDown(i, n);
	}

	private void printHeap(int n) {
		System.out.println("");
		Queue<Integer> que = new LinkedList<>();
		que.add(1);
		while (!que.isEmpty()) {
			int i = que.poll();
			System.out.print(Heap[i] + " ");
			int left = 2 * i;
			int right = 2 * i + 1;
			if (left < n)
				que.add(left);
			if (right < n)
				que.add(right);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() + 1;
		MinHeapImplementation mHeap = new MinHeapImplementation();
		Heap = new int[n];
		for (int i = 1; i < n; i++)
			Heap[i] = sc.nextInt();
		mHeap.heapify(n);
		mHeap.printHeap(n);
	}
}
