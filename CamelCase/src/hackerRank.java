import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerRank{

    public static void main(String[] args) {
    	 Scanner in = new Scanner(System.in);
         String s = in.next();
         int numberofWrds = 0;
         for(int i = 0; i < s.length(); i++){
             char ch = s.charAt(i);
         	if(Character.isUpperCase(ch))
         		numberofWrds++;
         }
         System.out.println(numberofWrds);  
    }
}
