import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TruckTour {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		Queue<Integer> que = new LinkedList<>();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[i] = x - y;
			if (arr[i] > 0)
				list.add(i);
		}
		for(int i = 0; i < list.size(); i++){
			int sum = arr[list.get(i)];
			boolean didBreak = true;
			for(int j = list.get(i) + 1; j < n; j++){
				if((sum+=arr[j]) < 0){
					didBreak = false;
					break;
				}
			}
			for(int j = 0 ; j < list.get(i); j++){
				if((sum+=arr[j]) < 0)
					didBreak = false;
					break;
			}
			if(didBreak){
				System.out.println(list.get(i));
				break;
			}
		}
	}
}