package Algorithm;

import java.util.HashMap;
import java.util.Scanner;

public class DP_Equal {
	
	static boolean check(int arr[]){
		int key = arr[0];
		for(int i = 0; i < arr.length; i++)
			if(arr[i] != key)
				return false;
		return true;
	}
	static int equal(int[] arr) {
	        // Complete this function
		HashMap<Integer, Integer> map = new HashMap<>();
	        int max = Integer.MIN_VALUE;
	        for(int i = 0; i < arr.length; i++){
	        	if(!map.containsKey(arr[i]))
	        		map.put(arr[i], 1);
	        	else{
	        		int value = map.get(arr[i]);
	        		map.put(arr[i], ++value);
	        		if(value+1 > map.get(max))
	        			max = arr[i];
	        	}
	        }
	        
	    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int[] arr = new int[n];
			for (int arr_i = 0; arr_i < n; arr_i++) {
				arr[arr_i] = in.nextInt();
			}
			int result = equal(arr);
			System.out.println(result);
		}
		in.close();
	}
}
