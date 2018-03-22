import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Test {

    static long simplestSum(int k, long a, long b) {
		// Complete this function
		long sum = 0l, ele = 1l, fact = k, j = 1l, power = 1l;
		final long RES  = 1000000000 + 7l;
		for (long i = 1; i <= b; i++){
			if(j > fact){
				j = 1;
				power++;
				fact = (int)Math.pow(k, power);
				ele += i;
			}
			if(i >= a){
				sum += ele;
				System.out.println(i+ " " + ele+ " " + sum+" "+j);
			}
			j++;
			
		}

		return (sum % RES);

	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int k = in.nextInt();
            long a = in.nextLong();
            long b = in.nextLong();
            System.out.println(simplestSum(k, a, b));
        }
        in.close();
    }
}
