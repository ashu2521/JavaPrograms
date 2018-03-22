package Arrays;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Kadane {
    static int algo(int[] arr){
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for(int x : arr){
        	max_ending_here = Math.max(x , max_ending_here + x);
            max_so_far = Math.max(max_ending_here, max_so_far);
        }
        return max_so_far;
        
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int j = 0; j < n; j++)
		        arr[j] = sc.nextInt();
		    
		    System.out.println(algo(arr));       
		        
		}
	}
}
