package HourRank25;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Ques_two {
    static String str;
    static void initialize(String s) {
        // This function is called once before all queries.
        str = s;
    }
    public static int fact(int n){
    	int f = 1;
    	for(int i = 1; i <= n; i++)
    		f *= i;
    	
    	return f;
    }
    
    static int answerQuery(int l, int r) {
        // Return the answer for this query modulo 1000000007.
    	int arr[] = new int[26];
    	for(int i = l; i <= r; i++)
    		arr[str.charAt(i-1) - 97]++;
    	
    	int count = 0;
    	int len_odd = 0, len_even = 0;
    	for(int i = 0; i < 26; i++){
    		if(arr[i] % 2 == 0)
    			len_even ++;
    		
    		
    		
    	}
    	List<int[]> list = Arrays.asList(arr);
    	System.out.println(list);
    	
    	return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        initialize(s);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int l = in.nextInt();
            int r = in.nextInt();
            int result = answerQuery(l, r);
            System.out.println(result);
        }
        in.close();
    }
}
