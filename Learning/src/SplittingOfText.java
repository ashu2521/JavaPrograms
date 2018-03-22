import java.util.Scanner;

public class SplittingOfText {
	public static void main(String args[]){
		String s = "MY NAME IS RAM";
		String[] s1 = s.split(" ");
		for(int i = 0; i < s1.length; i++){
			System.out.println(s1[i]);
		}
		Scanner sc =new Scanner(System.in);
		/*for(int i = 0; i < 4; i++){
			String s2 = sc.nextLine();
			System.out.println(s2);
			sc.next();
		}
		*/
		int x = 3;
		x = 140874526%13;
		System.out.println(x);
		sc.close();
	}
}
