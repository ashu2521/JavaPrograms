package Algorithm;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SaveThePrisoner {

    static int saveThePrisoner(int n, int m, int s){
        // Complete this function
       int x = s-1; 
       for(int i = 1; i <= m; i++){
           if(x >= n)
               x = 0;
           x++;
       }
       return x; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            int result = saveThePrisoner(n, m, s);
            System.out.println(result);
        }
    }
}
