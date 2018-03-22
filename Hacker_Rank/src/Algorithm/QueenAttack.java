package Algorithm;

import java.util.Scanner;

public class QueenAttack {
	static int isGreater(int i, int j) {
		return (i > j ? i : j);
	}

	public static void maain(String[] args ){
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int rQueen = in.nextInt();
	        int cQueen = in.nextInt();
	        
	        int attack = 0;
	          for(int a0 = 0; a0 < k; a0++){
	            int rObstacle = in.nextInt();
	            int cObstacle = in.nextInt();
	            // your code goes here
	            if(rObstacle == rQueen)
	            {
	                if(isGreater( cObstacle, cQueen ) == cObstacle)
	                    attack+=(cObstacle - 2);
	                else
	                    attack+=(n - cObstacle - 1);
	            }
	            else
	            {
	                attack+=n-1;
	            }    
	            if(cObstacle == cQueen){
	                if(isGreater( rObstacle, rQueen ) == rObstacle)
	                    attack+=(rObstacle - 2);
	                else
	                    attack+=(n - rObstacle - 1);
	            }
	            else
	            {
	                attack+=n-1;
	            }
	            
	            if((cObstacle + rObstacle) == (cQueen + rQueen)){	            		 
	            	if(rQueen+cQueen > n+1)
	            	{	
	            		attack+=cQueen+rQueen-2;
	            	}
	            	else
	            	{
	            		attack+=2*n-cQueen-rQueen;
	            	}
	            }
	            else
	            {
	            	if(rQueen+cQueen > n+1)
	            		attack+=cQueen+rQueen-2;
	            	else
	            		attack+=2*n-cQueen-rQueen;
	            }
	            
	            if(Math.abs(cObstacle - rObstacle) == Math.abs(cQueen - rQueen)){
	                
	            }
	            else
	            {
	            	if(rQueen > cQueen)
	            		attack+=n+cQueen-rQueen-1;
	            	else
	            		attack+=n+rQueen-cQueen-1;
	            }
	          }
	}
}
