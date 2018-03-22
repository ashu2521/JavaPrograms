package Strings;

import java.util.Scanner;

public class Q9_longestCommonSubString {
	static  int findMaxSubString(String s1, String s2, int n, int m){
		int res = 0;
		int[][] dp = new int[n+1][m+1];
		for(int i = 0;i <= n; i++){
			for(int j = 0; j <= m; j++){
				if(i == 0 || j == 0)
					dp[i][j] = 0;
				else{
					if(s1.charAt(i - 1) == s2.charAt(j - 1))
						dp[i][j] = dp[i - 1][j - 1] + 1;
					else
						dp[i][j] = 0;
					res = Math.max(res, dp[i][j]);
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			String s1 = sc.next();
			String s2 = sc.next();
			System.out.println(findMaxSubString(s1, s2, n, m));
		}
	}
}
