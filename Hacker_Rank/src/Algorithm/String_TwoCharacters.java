package Algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class String_TwoCharacters {
	static String formString(String oldString, char c1, char c2){
		String newString = "";
		for(int i = 0; i < oldString.length(); i++)
			if(oldString.charAt(i) == c1 || oldString.charAt(i) == c2)
				newString += oldString.charAt(i);
		return newString;
	}
	static int checkString(String s){
		boolean isCorrect = true;
		for(int i = 0; i < s.length() - 1; i++)
			if(s.charAt(i) == s.charAt(i+1))
				isCorrect = false;
		if(isCorrect)
			return s.length();
		else
			return 0;
	}
	
	
	static int twoCharaters(String s) {
		// Complete this function
		ArrayList<Character> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++)
			if (!list.contains(s.charAt(i)))
				list.add(s.charAt(i));
		
		if(list.size() == 1)
			return 0;
		
		int max_len = Integer.MIN_VALUE;
		for(int i = 0; i < list.size() - 1; i++){
			for(int j = i+1; j < list.size(); j++){
				String newString = formString(s, list.get(i), list.get(j));
				int len = checkString(newString);
				System.out.println(newString);
				if(len > max_len)
					max_len = len;
			}
		}
		return max_len;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		String s = in.next();
		int result = twoCharaters(s);
		System.out.println(result);
		in.close();
	}
}
