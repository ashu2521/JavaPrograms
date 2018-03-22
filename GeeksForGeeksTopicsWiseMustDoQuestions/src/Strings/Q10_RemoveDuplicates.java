/**
 * 
 */
package Strings;

import java.util.Scanner;

/**
 * @author ASHU
 *
 */
public class Q10_RemoveDuplicates {

	/**
	 * @param args
	 */
	static String remDuplicates(String s){
		boolean[] c = new boolean[256];
		String res = "";
		for(int i = 0; i < s.length(); i++){
			if(c[s.charAt(i)] == false){
				res += s.charAt(i);
				c[s.charAt(i)] = true;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int t =sc.nextInt();
		sc.nextLine();
		while(sc.hasNextLine() && t-- > 0){
			String s = sc.nextLine();
			System.out.println(remDuplicates(s));
		}
	}
}
