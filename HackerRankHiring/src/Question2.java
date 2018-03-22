import java.util.BitSet;
import java.util.HashSet;
import java.util.Scanner;

public class Question2 {
	static int winningLotteryTicket(String[] tickets) {
		// Complete this function
		BitSet[] set = new BitSet[tickets.length];
		for (int i = 0; i < tickets.length; i++) {
			set[i] = new BitSet();
			if(tickets[i].contains("0"))
				set[i].set(0);
			if(tickets[i].contains("1"))
				set[i].set(1);
			if(tickets[i].contains("2"))
				set[i].set(2);
			if(tickets[i].contains("3"))
				set[i].set(3);
			if(tickets[i].contains("4"))
				set[i].set(4);
			if(tickets[i].contains("5"))
				set[i].set(5);
			if(tickets[i].contains("6"))
				set[i].set(6);
			if(tickets[i].contains("7"))
				set[i].set(7);
			if(tickets[i].contains("8"))
				set[i].set(8);
			if(tickets[i].contains("9"))
				set[i].set(9);
			//System.out.println(set[i]);
		}
		int pair = 0;
		for(int i = 0; i < tickets.length - 1; i++){
			for(int j = i + 1; j < tickets.length; j++){
				BitSet pairSet = (BitSet)set[i].clone();
				pairSet.or(set[j]);
				if(pairSet.cardinality() == 10)
					pair++;
			}
		}
		
		return pair;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] tickets = new String[n];
		for (int tickets_i = 0; tickets_i < n; tickets_i++) {
			tickets[tickets_i] = in.next();
		}
		int result = winningLotteryTicket(tickets);
		System.out.println(result);
		in.close();
	}
}
