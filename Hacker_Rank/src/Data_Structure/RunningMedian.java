package Data_Structure;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RunningMedian {
	private static int[] minHeap;
	private static int[] maxHeap;
	private static final int FRONT = 1;
	private static int min_heap_Size;
	private static int max_heap_Size;

	private static int parent(int i) {
		return i / 2;
	}

	private static int rightChild(int i) {
		return 2 * i + 1;
	}

	private static int leftChild(int i) {
		return 2 * i;
	}

	private static int get_minHeap_size() {
		return min_heap_Size;
	}

	private static int get_maxHeap_size() {
		return max_heap_Size;
	}

	private static void min_swap(int j, int i) {
		int temp = minHeap[i];
		minHeap[i] = minHeap[j];
		minHeap[j] = temp;
	}

	private static void max_swap(int j, int i) {
		int temp = maxHeap[i];
		maxHeap[i] = maxHeap[j];
		maxHeap[j] = temp;
	}

	private static void max_Heapify(int i) {
		int n = get_maxHeap_size();
		int leftChild = leftChild(i);
		int rightChild = rightChild(i);
		int largest = i;
		if (leftChild <= n && maxHeap[largest] < maxHeap[leftChild])
			largest = leftChild;
		if (rightChild <= n && maxHeap[largest] < maxHeap[rightChild])
			largest = rightChild;
		if (largest != i) {
			max_swap(largest, i);
			max_Heapify(largest);
		}
	}

	private static void min_Heapify(int i) {
		int n = get_minHeap_size();
		int leftChild = leftChild(i);
		int rightChild = rightChild(i);
		int largest = i;
		if (leftChild <= n && minHeap[largest] > minHeap[leftChild])
			largest = leftChild;
		if (rightChild <= n && minHeap[largest] > minHeap[rightChild])
			largest = rightChild;
		if (largest != i) {
			min_swap(largest, i);
			min_Heapify(largest);
		}
	}

	private static void add_maxHeap(int data) {
		max_heap_Size++;
		int i = get_maxHeap_size();
		maxHeap[i] = data;
		while (maxHeap[i] > maxHeap[parent(i)] && i > 1) {
			max_swap(i, parent(i));
			i = parent(i);
		}
	}

	private static void add_minHeap(int data) {
		min_heap_Size++;
		int i = get_minHeap_size();
		minHeap[i] = data;
		while (minHeap[i] < minHeap[parent(i)] && i > 1) {
			min_swap(i, parent(i));
			i = parent(i);
		}
	}

	private static int extract_maxHeap() {
		int max = maxHeap[FRONT];
		maxHeap[FRONT] = maxHeap[get_maxHeap_size()];
		max_heap_Size--;
		max_Heapify(FRONT);
		return max;
	}

	private static int extract_minHeap() {
		int min = minHeap[FRONT];
		minHeap[FRONT] = minHeap[get_minHeap_size()];
		min_heap_Size--;
		min_Heapify(FRONT);
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float median = 0.0f;
		minHeap = new int[n + 1];
		maxHeap = new int[n + 1];
		max_heap_Size = 0;
		min_heap_Size = 0;
		for (int i = 0; i < n; i++) {
			int ele = sc.nextInt();
			if (ele >= median) {
				add_minHeap(ele);
			}

			if (ele < median) {
				add_maxHeap(ele);
			}

			if (Math.abs(get_maxHeap_size() - get_minHeap_size()) >= 2) {
				int ext = 0;
				if (get_maxHeap_size() > get_minHeap_size()) {
					ext = extract_maxHeap();
					add_minHeap(ext);
				} else {
					ext = extract_minHeap();
					add_maxHeap(ext);
				}
			}

			if (get_maxHeap_size() - get_minHeap_size() == 0) {
				median = (float) ((maxHeap[FRONT] + minHeap[FRONT]) / 2.0);
			} else if (get_maxHeap_size() - get_minHeap_size() == -1) {
				median = (float) minHeap[FRONT];
			} else {
				median = (float) maxHeap[FRONT];
			}

			System.out.println(median);

		}
	}
}
