import java.util.Scanner;

public class question1 {
	static String acidNaming(String acid_name) {
		// Complete this function
		boolean startWithHyd = acid_name.startsWith("hydro");
		boolean endWithIc = acid_name.endsWith("ic");
		if(startWithHyd && endWithIc)
			return "non-metal acid";
		else if(endWithIc)
			return "polyatomic acid";
		else
			return "not an acid";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int a0 = 0; a0 < n; a0++) {
			String acid_name = in.next();
			String result = acidNaming(acid_name);
			System.out.println(result);
		}
		in.close();
	}
}
