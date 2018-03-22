package Algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class LisaWorkBook {
	public static void main(String[] args){
		 Scanner sc= new Scanner(System.in);
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        ArrayList<Integer> prblms[] = new ArrayList[101];
	        int page = 0;
	        for(int i = 0; i < 101; i++)
	            prblms[i] = new ArrayList<Integer>();
	        for(int i = 0; i < n; i++){
	            int t = sc.nextInt();
	            page++;
	            for(int j = 1; j <= t; j++){
	                prblms[page].add(j);
	                if(j != t && j % k == 0)
	                    page++;
	            }
	        }
	        int count = 0;
	        for(int i = 1; i <= page; i++){
	        // System.out.println(i + " " + prblms[i] + " " + prblms[i].indexOf(""+i));
	            if(prblms[i].contains(i) == true)
	                count++;
	        }
	        System.out.println(count);
	}
}
