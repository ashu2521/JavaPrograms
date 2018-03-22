import java.util.*;

public class arraygame {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
    	if(game[0] == 1)
    		return false;
    		Stack<Integer> stack = new Stack<Integer>();
    		int i = 0, temp;
    		while(i < game.length){
    			temp = i;
    			if((temp + leap) >= game.length)
    				return true;
    			
    			if(game[temp + leap] == 0){
    				stack.push(i);
    				i = i + leap;
    			}
    			else{
    				if(game[temp + 1] == 0)
    					i = i + 1;
    				else{
    					if(!stack.isEmpty())
    						i = stack.pop(); 
    					else
    						return false;
    					
    					if(temp == i){
    						return false;
    					}
    				}
    			}
    			
    		}
    	return false;
     }
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
