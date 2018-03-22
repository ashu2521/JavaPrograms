package Algorithm;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ManasaAndStones {  
	 static ArrayList<Integer> set1 = new ArrayList<>();
	 static ArrayList<Integer> set2 = new ArrayList<>();
	    
	    private static void show(){
	        Iterator<Integer> it = set1.iterator();
	        while(it.hasNext())
	        {
	           System.out.print(it.next()+" ");
	        }
	    }
	    
	    private static void stones(int lastStone, int choice, int stone, int maxout, int a, int b){
	        //System.out.println(set2+"\t" + stone);
	    	if(stone >= maxout){
	            if(!set1.contains(lastStone+choice))
	                set1.add(lastStone+choice);
	            return;
	        }
	           
	        set2.add(lastStone);
	        stones(lastStone+choice, a, stone+1, maxout, a, b);
	        stones(lastStone+choice, b, stone+1, maxout, a, b);
	    }
	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        int test = sc.nextInt();
	        
	        for(int i = 0; i < test; i++){
	            int maxout, a, b;
	            
	            maxout = sc.nextInt();
	            a = sc.nextInt();
	            b = sc.nextInt();
	            
	            stones(0, a, 2, maxout, a, b);
	            stones(0, b, 2, maxout, a, b);
	            show();
	            System.out.println("");
	                   
	            set1.clear();     
	            set2.clear();
	        }
	        sc.close();
	    }
}
