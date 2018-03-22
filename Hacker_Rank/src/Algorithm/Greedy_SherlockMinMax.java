package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy_SherlockMinMax {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        Arrays.sort(arr);
        int p = sc.nextInt();
        int q = sc.nextInt();
       
        int max_min = Integer.MIN_VALUE;
        int toPrint = 0;
        
      /*  for(int i =p; i <= q; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < n; j++){
                if(Math.abs(arr[j] - i) < min)
                    min = Math.abs(arr[j] - i);
            }
            if(min > max_min){
                max_min = min;
                toPrint = i;
            }
        }
        */
        for(int i = 0; i < n; i++)
        	System.out.println(i+" " +arr[i] + " " + Math.abs(arr[i] - p) + " " + Math.abs(arr[i] - q));  
        
        int min_i = 0, max_i = 0, min_p = Math.abs(arr[0] - p), min_q = Math.abs(arr[0] - q);
        for(int i = 0; i < n; i++){
            if(Math.abs(arr[i] - p) < min_p){
                min_p = Math.abs(arr[i] - p);
                min_i = i;
            }
            if(Math.abs(arr[i] - q) < min_q){
                min_q = Math.abs(arr[i] - q);
                max_i = i;
            }
        }
        System.out.println(min_i + " " + max_i);
    }
}
