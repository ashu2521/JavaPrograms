package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class FlatLandSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int m = in.nextInt();
	        int c[] = new int[m];
	        for(int c_i=0; c_i < m; c_i++){
	            c[c_i] = in.nextInt();
	        }
	        Arrays.sort(c);
	        int max_dist = Integer.MIN_VALUE;
	        int sb = -1;
	        int k = 0;
	        int sn = c[k];
	        for(int i = 0; i < n; i++){
	            int min_b = Integer.MAX_VALUE;
	            int min_f = Integer.MAX_VALUE;
	            if(sb != -1)
	                min_b = i-sb;
	           
	            if(sn != -1)
	                min_f = sn - i;
	            
	            int min_dist = (min_f > min_b ? min_b : min_f);
	            max_dist = (max_dist > min_dist ? max_dist : min_dist);
	            
	            if(sn == i){
	                sb = sn;
	                if(k+1 < c.length)
	                    sn = c[k+1];
	                else
	                    sn = -1;
	                k++;
	            }
	            System.out.println(i+"\t"+sb+"\t"+sn+"\t"+min_b+"\t"+min_f+"\t"+k+"\t"+max_dist);
	            
	        }
	        //System.out.println(max_dist);
	        in.close();

	}

}
