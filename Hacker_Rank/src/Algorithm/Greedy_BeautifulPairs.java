package Algorithm;

import java.util.Comparator;
import java.util.PriorityQueue;

class Comp implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1 < o2)
			return 1;
		else if(o1 == o2)
			return 0;
		else
			return -1;
				
	}
	
}

public class Greedy_BeautifulPairs {
	public static void main(String[] args){
		PriorityQueue<Integer> que = new PriorityQueue<>(10,/*new Comparator(){
			public int compare(Object o1, Object o2){
				int i1 = (int)o1;
				int i2 = (int)o2;
				if(i1 < i2)
					return -1;
				else if(i2 < i1)
					return 1;
				else
					return 0;
			}
		}*/ new Comp());
		que.add(1);
		que.add(2);
		que.add(3);
		que.add(83);
		que.add(199);
		System.out.println(que.peek());
	}
}
