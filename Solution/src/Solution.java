import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        Arrays.sort(ar);
        int max=1,c=1,s;
        s=ar[0];
        for(int i =1;i<n;i++)
        {
            if(ar[i]==ar[i-1])
                c=c+1;
            else if(ar[i]!=ar[i-1])
            {
                if(c>max)
                {
                    s=ar[i-1];
                    max=c;
                    c=1;
                }
                else
                    c=1;
            }
        }
        return s;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}