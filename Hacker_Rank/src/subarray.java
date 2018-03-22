import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class subarray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        int i = 0;
        System.out.println(arr.length);
        while(i < n){
            arr[i] = sc.nextInt();
            i++;
        } 
        System.out.println("The array is"); i= 0; 
        
        int count = 0;
        i = 0;
        while(i < n){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum = sum + arr[j];
                System.out.println("The element is :" + arr[j]);
                System.out.println("The sum is : " + sum);
                if(sum < 0){
                    count++;
                }
                System.out.println("The count is : " + count);
            }
            i++;
        }
     }
}