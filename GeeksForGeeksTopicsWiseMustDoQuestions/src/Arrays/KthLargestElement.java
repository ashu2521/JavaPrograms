package Arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class KthLargestElement {
	static int findKLargest(ArrayList<Integer> list,int  k){
		PriorityQueue<Integer> que = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
			
		});
		que.addAll(list);
		int x = -10;
		while(!que.isEmpty() && k-- > 0){
			x = que.poll();
			//System.out.println(x);
		}
		if(k <= 0)
			return x;
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int k = in.nextInt();
			int n = in.nextInt();
			ArrayList<Integer> list = new ArrayList<>();
			for(int i = 0; i < n; i++){
				list.add(in.nextInt());
				System.out.print(findKLargest(list, k)+" ");
				System.out.println("");
			}
		}
	}

}
