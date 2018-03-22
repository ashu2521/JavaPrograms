package Algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class String_GemStone {
	static int gemstones(String[] arr) {
		// Complete this function
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < arr[0].length(); i++)
			map.put(arr[0].charAt(i), 1);
		
		int count = 0;
		for(char c : map.keySet()){
			boolean present = true;
			for(int i = 1; i < arr.length; i++){
				if(!arr[i].contains("" + c))
					present = false;
			}
			if(present)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] arr = new String[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.next();
		}
		int result = gemstones(arr);
		System.out.println(result);
	}
}
