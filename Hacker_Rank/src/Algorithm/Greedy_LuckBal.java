package Algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.LinkedList;

public class Greedy_LuckBal {	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		LinkedList<Integer> exam = new LinkedList<>();
		int luck = 0;
		for(int i = 0; i < n; i++){
			int lck = sc.nextInt();
			int imp = sc.nextInt();
			if(imp == 0)
				luck += lck;
			else
				exam.add(lck);
		}
		Collections.sort(exam);
		for(int i = exam.size()-1; i >= 0; i--, k--){
			if(k > 0)
				luck += exam.get(i);
			else
				luck -= exam.get(i);
		}
		
		System.out.println(luck);
	}
}
