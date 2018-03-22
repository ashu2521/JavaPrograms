import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BitSetQ {
    static BitSet b1;
    static BitSet b2;
    static void initBitSet(int n){
    	b1 = new BitSet(n);
    	b2 = new BitSet(n);
    }
    static BitSet getBitSet(int s){
        return ((s == 1) ?b1 : b2);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        initBitSet(n);
        for(int i = 0; i < m; i++ ){
            String input = sc.next();
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            System.out.println(input+" "+s1+" "+s2);
            if(input.equals("AND")){
                getBitSet(s1).and(getBitSet(s2));
                System.out.println(getBitSet(s1).cardinality()+" "+(getBitSet(s2).cardinality()));
            }
            else if(input.equals("OR")){
            	getBitSet(s1).or(getBitSet(s2));
                System.out.println(getBitSet(s2).cardinality()+" "+(getBitSet(s2).cardinality()));
            }
            else if(input.equals("XOR")){
            	getBitSet(s1).xor(getBitSet(s2));
                System.out.println(getBitSet(s1).cardinality()+" "+(getBitSet(s2).cardinality()));
            }
            else if(input.equals("SET")){
            	getBitSet(s1).set(s2);
                System.out.println(getBitSet(s1).cardinality()+" "+(getBitSet(s2).cardinality()));
            }
            else if(input.equals("FLIP")){
            	if(getBitSet(s1).get(s2)){
            		getBitSet(s1).set(s2, false);
            	}
            	else{
            		getBitSet(s1).set(s2, true);
            	}
            	System.out.println(getBitSet(s1).cardinality()+" "+(getBitSet(s2).cardinality()));
            }
           	
      
        }
    }
}