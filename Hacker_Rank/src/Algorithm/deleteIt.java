package Algorithm;

import java.util.*;

public class deleteIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		    LinkedList<Integer> q=new LinkedList<Integer>();
		    int n = in.nextInt();
		    int m = in.nextInt();
		    int c[] = new int[m];
		    for(int i=0;i<n;i++){
		        q.add(i);
		    }
		    for(int c_i=0; c_i < m; c_i++){
		        c[c_i] = in.nextInt();
		        int index = q.indexOf(c[c_i]);
		        q.set(index,-1);
		    }
		    if(n==m){
		        System.out.println("0");
		    }
		   else{ 	
		        int max=0;
		        int min;
		        int size=q.size();
		        int flag=0;
		        int previous=(-2);
		        for(int i=0;i<size;i++){
		          int k=q.poll();
		                if(i==(size-1)&& k!=(-1)){
		                int max2=Math.abs(i-previous);
		                if(max2>max){
		                    max=max2;
		                }
		            }
		          else  if(i!=0 && previous==(-2) && k==(-1)){
		                previous=i;
		                flag=1;
		                max=i;
		            }
		            else if(i==0 && k==(-1) && previous!=(-1)){
		                previous=0;
		                flag=1;
		            }
		            else if(i!=0 && flag==1 && k==(-1) && previous!=(-1)){
		            int pattern=((i+previous)/2);
		            if(pattern!=previous){
		                int min1=Math.abs(pattern-previous);
		                int min2=Math.abs(pattern-i);
		               if(min1<=min2){
		                   min=min1;
		               }
		                else{
		                    min=min2;
		                }
		                if(min>max){
		                    max=min;}
		                    }
		                previous=i;
		                }
		                else if(i!=0 && flag==0 && k==(-1)&& previous!=(-1)){
		                    flag=1;
		                    previous=i;
		               }
		            }
		          System.out.println(max);
		        }
		    in.close();

	}

}
