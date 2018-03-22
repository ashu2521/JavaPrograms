package Data_Structure;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class PoisonPlant {
	
	private static int poisonousPlants(int p[]){
		int result = 0;
		
		
		
		return result;
	}
	
	public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] p = new int[n];
	        for(int p_i = 0; p_i < n; p_i++){
	            p[p_i] = in.nextInt();
	        }
	        int result = poisonousPlants(p);
	        System.out.println(result);
	        in.close();
	}
}
