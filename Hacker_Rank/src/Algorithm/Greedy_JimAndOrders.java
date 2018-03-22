package Algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Greedy_JimAndOrders {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        TreeMap<Integer, LinkedList<Integer>> map = new TreeMap<>();
        int time[] = new int[n];
        int order[] = new int[n];
        for(int i = 0; i < n; i++){
            order[i] = i+1;
            time[i] = sc.nextInt() + sc.nextInt();
            LinkedList<Integer> l1 = map.get(time[i]);
            if(l1 == null)
            	l1 = new LinkedList();
            	
            l1.add(order[i]);
        	map.put(time[i],  l1);	
            	
        }
        
        for(Map.Entry<Integer, LinkedList<Integer>> entry: map.entrySet() ){
        	LinkedList<Integer> l2 = entry.getValue();
        	Iterator<Integer> it = l2.iterator();
        	while(it.hasNext())
        		System.out.print(it.next() + " ");
        }
        
    }

}
