import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class arrayList {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer>[] arraylist = new ArrayList[n];
		for(int i = 0; i < n; i++){
			arraylist[i] = new ArrayList<Integer>();
		}
		for(int i = 0; i < n; i++){
			int num = sc.nextInt();
			arraylist[i].add(num);
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for(int j = 0; j < num; j++){
				temp.add(sc.nextInt());
			}
			arraylist[i].addAll(temp);
		}
		int query = sc.nextInt();
		for(int i = 0; i < query; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			try{
				System.out.println(arraylist[x - 1].get(y));
			}
			catch(IndexOutOfBoundsException e){
				System.out.println("ERROR!");
			}
		}
	}
}
