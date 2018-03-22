import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class Data implements Comparable<Data>{
	String name;
	int ques_dec;
	int ques_jan;
	
	public Data(String name, int ques_dec, int ques_jan) {
		super();
		this.name = name;
		this.ques_dec = ques_dec;
		this.ques_jan = ques_jan;
	}

	@Override
	public int compareTo(Data arg) {
		// TODO Auto-generated method stub
		if((this.ques_jan - this.ques_dec) < (arg.ques_jan - arg.ques_dec))
			return 1;
		else if((this.ques_jan - this.ques_dec) > (arg.ques_jan - arg.ques_dec))
			return -1;
		else{
			return (this.ques_dec < arg.ques_jan ? 1 : -1);
		}
	}
	
}

public class Question1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Data> list = new ArrayList<>();
		int n = in.nextInt();
		for (int a0 = 0; a0 < n; a0++) {
			String name = in.next();
			int d = in.nextInt();
			int j = in.nextInt();
			list.add(new Data(name, d, j));
		}
		Collections.sort(list);
		// Write Your Code Here
		for(Data d: list){
			System.out.println(d.name);
		}
		in.close();
	}
}
