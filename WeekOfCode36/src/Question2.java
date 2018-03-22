import java.util.Scanner;

public class Question2 {
	static int[] revisedRussianRoulette(int[] doors) {
		// Complete this function
		int[] count = new int[2];
		int[] sol = doors.clone();
		for(int i = 0; i < doors.length; i++){
			if(sol[i] == 1 && i != doors.length - 1){
				sol[i] = 0;
				sol[i+1] = 0;
				count[0]++;
			}
			if(doors[i] == 1)
				count[1]++;
		}
		if(sol[doors.length - 1] == 1)
			count[0]++;
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] doors = new int[n];
		for (int doors_i = 0; doors_i < n; doors_i++) {
			doors[doors_i] = in.nextInt();
		}
		int[] result = revisedRussianRoulette(doors);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");

		in.close();
	}
}
