package Strings;

import java.util.Scanner;
import java.util.Stack;

public class Q2_revWords {
	static String rev(String s){
		Stack<String> st = new Stack<String>();
	    //becuse there are 12 charaters that come under special category we need to
	    //use //. to escape the "."
	    for (String retval: s.split("\\.")) {
            st.push(retval);
        }
        String rev = "";
        while(!st.empty()){
            rev = rev + st.pop() + ".";
        }
        return rev.substring(0,rev.length()-1);
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			String word = sc.next();
			System.out.println(rev(word));
		}
	}
}
