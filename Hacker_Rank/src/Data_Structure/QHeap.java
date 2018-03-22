package Data_Structure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QHeap {
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

	private void minHeap(int i, int n) {
		int leftChild = leftChild(i);
		int rightChild = rightChild(i);
		int smallest = i;
		if (leftChild < n && Heap[smallest] > Heap[leftChild])
			smallest = leftChild;
		if (rightChild < n && Heap[smallest] > Heap[rightChild])
			smallest = rightChild;
		if (smallest != i) {
			swap(smallest, i);
			minHeap(smallest, n);
		}
	}

	private int getMin() {
		return Heap[FRONT];
	}

	private void heapify(int n) {
		for (int i = n / 2; i > 0; i--)
			minHeap(i, n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		QHeap mHeap = new QHeap();
		Heap = new int[n + 1];
		int k = 1;
		for (int i = 0; i < n; i++) {
			int option = sc.nextInt();
			if (option == 1 || option == 2) {
				int data = sc.nextInt();
				if (option == 1) {
					Heap[k] = data;
					k++;
					mHeap.heapify(k);
				} else {
					int j;
					for (j = 1; j <= k && Heap[j] != data; j++);
					Heap[j] = Heap[k-1];
					k--;
					mHeap.heapify(k);
				}
			} else
				System.out.println(mHeap.getMin());
		}

	}
}
