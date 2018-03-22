import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class algocrush {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextInt();
        long [] arr = new long[n];
        for(int i = 0; i < n; i++){
          arr[i] = 0;
        }
        long big = 0;
        for(int i = 0; i < m; i++){
            long x, y, z ;
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            for(int k = (int)x-1; k <= y-1; k++){
                arr[k] = arr[k] + z;
                if(big < arr[k])
                    big = arr[k];
            }
        }
        System.out.println(big);
    }
}