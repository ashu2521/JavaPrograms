package Strings;

import java.util.Scanner;
import java.util.Stack;

public class Q1_BalancingBrackets {
	static String findBalance(String input) {
		Stack<Character> stack = new Stack<Character>();
		// Complete the code
		int i = 0;
		while (i < input.length()) {
			char c;
			if (input.charAt(i) == '{' || input.charAt(i) == '(' || input.charAt(i) == '[')
				stack.push(input.charAt(i));
			else if (stack.isEmpty()) {
				return "not balanced";
			} else {
				c = stack.peek();
				if ((c == '{' && input.charAt(i) == '}') || (c == '(' && input.charAt(i) == ')')
						|| (c == '[' && input.charAt(i) == ']'))
					stack.pop();
				else {
					return "not balanced";
				}
			}
			i++;
		}
		if (stack.isEmpty())
			return "balanced";
		else
			return "not balanced";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();
		while (z-- > 0) {
			String input = sc.next();
			System.out.println(findBalance(input));
		}
	}
}
