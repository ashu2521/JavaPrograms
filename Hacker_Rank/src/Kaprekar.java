import java.math.BigInteger;
import java.util.Scanner;
public class Kaprekar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        for(int i = p; i <= q; i++){
            int d = String.valueOf(i).length();
            BigInteger n = new BigInteger(""+i);
            BigInteger test = n.multiply(n);
            String num = String.valueOf(test);
            int len = num.length();

            String left = num.substring(0, len-d);
            String right = num.substring(len-d,  len);
            
            if(right == null)
            	System.out.println("null");
            //System.out.println(i + " " + test + " " + left);
           
           int r = 0, l = 0;
       
            r = Integer.parseInt(right);
            if(len != 1)
            	l = Integer.parseInt(left);
            
            int sum = r + l;
           
            if(sum == i)
            	System.out.print(i + " ");
            
        }
           
	}

}
