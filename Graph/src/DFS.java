
public class DFS {
	int visited[] = new int[8];
	public void search(int arr[][], int i){
		System.out.print(i+" -> ");
		visited[i] = 1;
		for(int j = 0; j < 8; j++){
			if(arr[i][j] == 1 && visited[j] == 0)
				search(arr, j);
		}
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
		
		DFS b = new DFS();
		b.search(arr, 0);
		System.out.print("FIN");

	}
}
