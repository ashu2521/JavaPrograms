package Algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HappyLadyBugs {
	public static void main(String[] args){
		 Scanner in = new Scanner(System.in);
	        int Q = in.nextInt();
	        for(int a0 = 0; a0 < Q; a0++){
	            boolean isHappy = true;
	            int n = in.nextInt();
	            String b = in.next();
	            HashMap<Character, Integer> map = new HashMap<>();
	            for(int i = 0; i < n; i++){
	                char c = b.charAt(i);
	                int x = map.get(c) == null ? 1 : map.get(c)+1;
	                map.put(c, x);
	            }
	            for(Map.Entry<Character, Integer> m: map.entrySet()){
	                char c = m.getKey();
	                int value = m.getValue();
	                if(c == '_' && value == 0 || c != '_' && value == 1 )
	                    isHappy = false;
	                
	            }
	            int count = 0;
	            char c = b.charAt(0);
	            if(map.get('_') == 0)
	            {   
	                isHappy = true;
	                for(int i = 0; i < n; i++){
	                    if(c == b.charAt(i))
	                        count++;
	                    else{
	                        if(count == 1) 
	                        {
	                            isHappy = false; 
	                            break;
	                        }       
	                        c = b.charAt(i);
	                        count = 1;
	                    }
	                }
	                if(count == 1) isHappy = false;
	            }    
	            
	            if(isHappy)
	                System.out.println("YES");
	            else
	                System.out.println("NO");
	        }
	}
}
