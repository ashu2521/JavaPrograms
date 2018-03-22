import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PoisonPlant {

    static int poisonousPlants(int[] p) {
        // Complete this function
        int x = 0, count = 0;
        boolean isTrue = true;
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i = 0;i < p.length; i++)
        	list.add(i);
   
       // System.out.println(list);  
        while(isTrue){
            isTrue = false;
            int size = list.size();
            for(int i = 0; i < size; i++){
                int index = list.poll();
                System.out.println(index);
                if((!list.isEmpty()) && (p[index] > p[list.peek()])){
                	isTrue = true;
                }
                else if(!list.isEmpty() && (p[index] < p[list.peek()]))
                	list.addFirst(p[index]);
                
                list.addFirst(list.poll());
            }
            System.out.println(list);
            count++;
        }
        return count-1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[n];
        Stack<Integer> stack = new Stack<Integer>();
        for(int p_i = 0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
            
        }
        
        int result = poisonousPlants(p);
        System.out.println(result);
        in.close();
    }
}
