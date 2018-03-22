import java.util.Scanner;

public class Append_Delete {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = in.next();
		int k = in.nextInt();
		int i = 0;
		while (i < k) {
			if (!t.startsWith(s)) {
				s = s.substring(0, s.length() - 1);
				i++;
			} else {
				if (t.length() - s.length() == (k - i)) {
					System.out.println("YES");
					break;
				} else {
					System.out.println("NO");
					break;
				}
			}
		}
	}
}
