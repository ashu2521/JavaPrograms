package Arrays;

import java.util.Scanner;

public class SubArraySizeK {
	static void maxOfSubK(int[] arr, int k, int n){
		int max = arr[0];
		int max_pos = 0;
		for(int i = 0; i < k && i < n; i++){
			if(arr[i] > max ){
				max = arr[i];
				max_pos = i;
			}
		}
		System.out.print(max+" ");
		for(int i = k, j = 0; i < n; i++, j++){
			if(max_pos < j){
				max = 0;
				int p;
				for(p = j; p < j+k; p++){
					if(arr[p] > max){
						max = arr[p];
						max_pos = p;
					}
				}
			}
			else{
				if(arr[i] > max){
					max = arr[i];
					max_pos = i;
				}
			}
			System.out.print(max + " ");
		}
		
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0){
			int n = in.nextInt();
			int k = in.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++)
				arr[i] = in.nextInt();
			for(int i = 0;i < n; i++)
				System.out.println((i+1)+" "+arr[i]);
			maxOfSubK(arr, k, n);
			System.out.println("");
		}
	}
}
