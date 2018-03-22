package Algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Graph_JourneyToMoon {
	static int[] visited;
	static ArrayList<Integer> countryMembers = new ArrayList<Integer>();
	static int related;

	static void dfs(int citizen, ArrayList<LinkedList<Integer>> astronaut) {
		LinkedList<Integer> member = astronaut.get(citizen);
		for (int i : member) {
			if (visited[i] != 1) {
				related++;
				visited[i] = 1;
				dfs(i, astronaut);
			}
		}
	}

	static long journeyToMoon(int n, ArrayList<LinkedList<Integer>> astronaut) {
		// Complete this function
		for (int i = 0; i < n; i++) {
			Graph_JourneyToMoon.related = 1;
			if (visited[i] != 1) {
				visited[i] = 1;
				dfs(i, astronaut);
				countryMembers.add(related);
			}
		}
		System.out.println(countryMembers);
		long permissibleways = 0l;
		long sum = countryMembers.get(0);
		for (int i = 1; i < countryMembers.size(); i++){
			permissibleways += sum * (long)countryMembers.get(i);
			sum += countryMembers.get(i);
		}
		
		return permissibleways;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = in.nextInt();
		ArrayList<LinkedList<Integer>> astronaut = new ArrayList<>();
		for(int i = 0; i < n; i++){
			astronaut.add(new LinkedList<Integer>());
		}
		for (int astronaut_i = 0; astronaut_i < p; astronaut_i++) {
			int u = in.nextInt();
			int v = in.nextInt();
			LinkedList<Integer> list1 = astronaut.get(u);
			LinkedList<Integer> list2 = astronaut.get(v);
 			list1.add(v);
			list2.add(u);
		}
		Graph_JourneyToMoon.visited = new int[n];
		Graph_JourneyToMoon.related = 0;
		System.out.println(journeyToMoon(n, astronaut));
		in.close();
	}
}
