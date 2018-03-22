import java.util.Scanner;

public class AMCAT1 {
	static String printNext(String s){
		String s1 = "abcd";
		String s2 = "bcde";
		System.out.println(s2.compareTo(s1));
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(printNext(s));
	}

}
