package Algorithm;

import java.util.Scanner;

public class StrangeCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        long t = in.nextLong();
	        long x = 3;
	        long counter = 1;
	        while(counter <= t)
	        {
	        	//System.out.println(counter+" "+x);
	        	counter+=x;
	        	x*=2;
	        	
	        }
	        //System.out.println(counter+" "+x);
	        System.out.println(counter-t);
	}

}
