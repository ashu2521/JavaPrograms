import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	int visited[] = new int[8];
	Queue<Integer> que = new LinkedList<>();

	public void search(int arr[][], int i) {
		System.out.print(i + " -> ");
		visited[i] = 1;
		for (int j = 0; j < arr[i].length; j++) {
			if (arr[i][j] == 1 && visited[j] != 1) {
				visited[j] = 1;
				//System.out.print(i + " ");
				que.add(j);
			}
		}
		//System.out.println(que);
		if (que.isEmpty())
			return;
		search(arr, que.poll());
	}

	public static void main(String args[]) {
		int arr[][] = { { 0, 1, 0, 1, 0, 0, 0, 1 }, { 1, 0, 1, 0, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0 }, { 0, 1, 0, 0, 0, 1, 1, 1 }, { 0, 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 1, 0, 0, 0 }, { 1, 0, 0, 0, 1, 0, 0, 0 } };
		System.out.println("GRAPH : ");
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		
		BFS b = new BFS();
		b.search(arr, 0);
		System.out.print("FIN");

	}
}
