package text;

public class BinarySearch {
	public static void mian(String[] args){
		int arr[] = { 1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10}; 
		int i = 0, j = 9;
		while(i < j){
			int n = (j-i)/2;
			if( arr[n] > 2 )
				j = (j-i)/2;
			else if (arr[n] < 2)
				i = (j-i)/2;
			else
				System.out.println(n);
		}
		Integer x = null;
		System.out.println(x);
	}
}
