package HourRank25;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Ques_three {

    static int gcd(int a, int b){
        if(a == 0)
            return b;
        return gcd(b%a, a);
    }
    
    static int max(int arr[], int l, int r){
        int result = arr[l];
        int sum = arr[l];
        int max = arr[l];
        for(int i = l+1; i <= r; i++){
            result = gcd(arr[i], result);
            if(max < arr[i])
                max = arr[i];
            sum += arr[i];
        }
        return result * (sum - max);
    }  
    
    static long maximumValue(int[] a) {
        // Return the maximum value of f among all subsegments [l..r].
        int m = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++){
            for(int j = i; j < a.length; j++){
                int g = max(a, i, j);
                if(m < g)
                    m = g;
                //System.out.println(i+" "+j + " "+g);
            }
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        long result = maximumValue(a);
        System.out.println(result);
        in.close();
    }
}
