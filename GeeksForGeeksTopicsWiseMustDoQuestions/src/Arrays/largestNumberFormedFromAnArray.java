package Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class largestNumberFormedFromAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			Comparator<Integer> c = new Comparator<Integer>() {

				@Override
				public int compare(Integer arg0, Integer arg1) {
					// TODO Auto-generated method stub
					String s1 = arg0.toString() + arg1.toString();
					String s2 = arg1.toString() + arg0.toString();
					return  Integer.valueOf(s2) - Integer.valueOf(s1);
				}
			};
			PriorityQueue<Integer> que = new PriorityQueue<>(c);
			for (int i = 0; i < n; i++){
				que.add(sc.nextInt());
			}
			while(!que.isEmpty())
				System.out.print( que.poll() );
			System.out.println("");
		}
	}
}
