package Data_Structure;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class waiter{
    static int nextPrime(int currPrime){
        int nextPrime = currPrime+1;
        if(currPrime < 16){
            if(currPrime == 2)
                return 3;
            else if(currPrime == 3)
                return 5;
            else if(currPrime == 7)
                return 7;
            else if(currPrime == 7)
                return 11;
            else if(currPrime == 11)
                return 13;
        }
        else{
            boolean isNotPrime = true;
            while(isNotPrime){
                isNotPrime = false; 
                for(int i = 2; i < Math.sqrt(nextPrime); i++)
                    if(nextPrime % i == 0)
                        isNotPrime = true;
            }   
        }
        return nextPrime;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        Stack<Integer>[] stack_A = new Stack[q+1];
        Stack<Integer>[] stack_B = new Stack[q+1];
        stack_A[0] = new Stack<Integer>();
        for(int i = 0; i < n; i++)
           stack_A[0].push(in.nextInt());
        
        int prime = 2;
        for(int i = 1; i <= q; i++){
            stack_A[i] = new Stack<Integer>();
            stack_B[i] = new Stack<Integer>();
            
            while(!stack_A[i-1].isEmpty()){
                int plate = stack_A[i-1].pop();
                if(plate % prime == 0)
                    stack_B[i].push(plate);
                else
                    stack_A[i].push(plate);
                
                prime = nextPrime(prime);
            }
        }
        for(int i = 0; i < q; i++){
            while(!stack_B[i+1].empty())
                System.out.println(stack_B[i+1].pop());
        }
        for(int i = 0; i <= q; i++){
            while(!stack_A[i].empty())
                System.out.println(stack_A[i].pop());
        }
    }
}
