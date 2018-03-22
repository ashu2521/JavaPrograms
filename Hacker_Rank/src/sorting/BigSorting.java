package sorting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigSorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger l1 = new BigInteger(in.next());
        BigInteger l2 = new BigInteger(in.next());
        System.out.println(l1.compareTo(l2));
        if(l1.compareTo(l2) > 0)
        	System.out.println("Bigger");
        else if(l1.compareTo(l2) == 0)
        	System.out.println("Equal");
        else if(l1.compareTo(l2) < 0)
        	System.out.println("Smaller");
        else
        	System.out.println("What is it");
    }
}

