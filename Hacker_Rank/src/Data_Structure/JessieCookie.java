package Data_Structure;

import java.util.Scanner;

public class JessieCookie {
	private static int[] Heap;
	private static final int FRONT = 1;
    private static int heap_Size;

	private static int parent(int i) {
		return i / 2;
	}

	private static int rightChild(int i) {
		return 2 * i + 1;
	}

	private static int leftChild(int i) {
		return 2 * i;
	}
    private static int get_Heap_size(){
        return heap_Size;
    }
	private static void swap(int smallest, int i) {
		int temp = Heap[i];
		Heap[i] = Heap[smallest];
		Heap[smallest] = temp;
	}
	private static void min_Heapify(int i) {
        int n = get_Heap_size();
		int leftChild = leftChild(i);
		int rightChild = rightChild(i);
		int smallest = i;
		if (leftChild <= n && Heap[smallest] > Heap[leftChild])
			smallest = leftChild;
		if (rightChild <= n && Heap[smallest] > Heap[rightChild])
			smallest = rightChild;
		if (smallest != i) {
			swap(smallest, i);
			min_Heapify(smallest);
		}
	}
	private static void build_Min_Heap() {
		for (int i = get_Heap_size() / 2; i > 0; i--)
			min_Heapify(i);
	}
    private static void add_Heap(int data){
        heap_Size++;
        int n = get_Heap_size();
        Heap[n] = data;
        while(n >= 1 && Heap[parent(n)] > Heap[n]){
            swap(n, parent(n));
            n/=2;
        }
    }
    private static int extract_Min() {
        int min = Heap[1];
        Heap[1] = Heap[get_Heap_size()];
        heap_Size--;
        min_Heapify(1);
        return min;   
	}
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() + 1;
        int k = sc.nextInt();
		heap_Size = n - 1;
        Heap = new int[n];
		for (int i = 1; i < n; i++){
            Heap[i] = sc.nextInt();
        }
        build_Min_Heap();
        int count = 0;
        while(true){
            if(Heap[FRONT] >= k || get_Heap_size() < 2)
                break;
            
            int f_min = extract_Min();
            int s_min = extract_Min();
            int mod = f_min + (2 * s_min);
            add_Heap(mod);
            count++;
            System.out.println(count + " " + Heap[FRONT] + " " + get_Heap_size());
        }
        if(get_Heap_size() >= 2 || Heap[FRONT] >= k)
        	System.out.println(count + "Ans " + Heap[FRONT] );
        else
        	System.out.println(-1 + "Ans " + Heap[FRONT]);
        sc.close();
    }
}
