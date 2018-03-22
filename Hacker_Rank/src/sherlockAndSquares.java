import java.util.HashSet;
import java.util.Scanner;

public class sherlockAndSquares {
	public static void main(String[] args){
		HashSet<Integer> set = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int i = 0; i < test; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println((int)(Math.floor(Math.sqrt(y))-Math.ceil(Math.sqrt(x)) + 1));
		}
	}
}
