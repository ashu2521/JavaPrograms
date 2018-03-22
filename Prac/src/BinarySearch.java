
public class BinarySearch {
	public static void main(String[] args){
		int arr[] = { 1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10}; 
		int i = 0, j = 10;
		int n = 0;
		int x = 10;
		while(i <= j && arr[n] != x){
			n = (j+i)/2;
			if( arr[n] > x )
				j = j-1;
			else if (arr[n] < x)
				i = i+1;
			else
				System.out.println(n);
		}
		System.out.println(n);
	}
}
