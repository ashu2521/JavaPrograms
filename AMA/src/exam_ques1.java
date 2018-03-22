import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class exam_ques1 {
	static void convert(long num, LinkedList<Integer> linklist){
		long temp = num;
		while(temp > 0){
			linklist.add((int)temp%10);
			temp = temp/10;
		}
	}
	
	static LinkedList<Integer> add(LinkedList<Integer> linklist1, LinkedList<Integer> linklist2 , LinkedList<Integer> linklist3){
		LinkedList<Integer> linklist = new LinkedList<Integer>();
		
		Iterator<Integer> it1 = linklist1.iterator();
		Iterator<Integer> it2 = linklist2.iterator();
		Iterator<Integer> it3 = linklist3.iterator();
		int carr = 0;
		while(it1.hasNext() && it2.hasNext() && it3.hasNext()){
			int sumDigit = it1.next() + it2.next() + it3.next();
			if (carr == 1)
				sumDigit = sumDigit + 1;
			System.out.println(sumDigit);
			if(sumDigit > 9){
				carr = 1;
				sumDigit = sumDigit%10;
				linklist.addFirst(sumDigit);
			}
			else{
				carr = 0;
				linklist.addFirst(sumDigit);
			}
		}
		while(it1.hasNext() && it2.hasNext()){
			int sumDigit = it1.next() + it2.next();
			if (carr == 1)
				sumDigit = sumDigit + 1;
			System.out.println(sumDigit);
			if(sumDigit > 9){
				carr = 1;
				sumDigit = sumDigit%10;
				linklist.addFirst(sumDigit);
			}
			else{
				carr = 0;
				linklist.addFirst(sumDigit);
			}
		}
		while(it1.hasNext() && it3.hasNext()){
			int sumDigit = it1.next() + it3.next();
			if (carr == 1)
				sumDigit = sumDigit + 1;
			System.out.println(sumDigit);
			if(sumDigit > 9){
				carr = 1;
				sumDigit = sumDigit%10;
				linklist.addFirst(sumDigit);
			}
			else{
				carr = 0;
				linklist.addFirst(sumDigit);
			}
		}
		while(it2.hasNext() && it3.hasNext()){
			int sumDigit = it2.next() + it3.next();
			if (carr == 1)
				sumDigit = sumDigit + 1;
			System.out.println(sumDigit);
			if(sumDigit > 9){
				carr = 1;
				sumDigit = sumDigit%10;
				linklist.addFirst(sumDigit);
			}
			else{
				carr = 0;
				linklist.addFirst(sumDigit);
			}
		}
		
		
		
		if(carr == 1)
			linklist.addFirst(1);
		return linklist;
	}
	
	public static void main(String argsp[]){
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> linklist1 = new LinkedList<Integer>();
		LinkedList<Integer> linklist2 = new LinkedList<Integer>();
		LinkedList<Integer> linklist3 = new LinkedList<Integer>();
		LinkedList<Integer> linklist4 = new LinkedList<Integer>();
		long num1, num2, num3;
		num1 = sc.nextLong();
		num2 = sc.nextLong();
		num3 = sc.nextLong();
		
		convert(num1, linklist1);
		convert(num2, linklist2);
		convert(num3, linklist3);
		
		linklist4 = add(linklist1, linklist2, linklist3);
		
		System.out.println(linklist1);
		System.out.println(linklist2);
		System.out.println(linklist3);
		System.out.println(linklist4);
		
	}
}
