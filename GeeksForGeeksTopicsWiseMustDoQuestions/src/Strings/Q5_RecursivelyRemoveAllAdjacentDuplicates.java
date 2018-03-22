package Strings;

import java.util.Scanner;

public class Q5_RecursivelyRemoveAllAdjacentDuplicates {
	static String removeAdj(String s, boolean isCorrect){
		if(isCorrect)
			return s;
		boolean isValild = true;
		int first = 0, last = 0;
		char test = s.charAt(0);
		String res = "";
		for(int i = 1; i < s.length(); i++){
			if(test == s.charAt(i))
				last++;
			else{
				if(last == first)
					res += test;
				else
					isValild = false;
				last = i;
				first = i;
				test = s.charAt(i);
			}
		}
		if(last == first)
			res += test;
		else
			isValild = false;
		return removeAdj(res, isValild);
		
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0){
			String s = in.next();
			System.out.println(removeAdj(s, false));
		}
	}
}
