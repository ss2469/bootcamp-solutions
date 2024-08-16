package part1.bootcamp.medium;

public class Program_05 {

	public static void main(String[] args) {
		// Write a Java program to find the second highest number in an array.
		
		int[] arr = { 10, 5, 8, 20, 2, 15 };
		int n = arr.length;
		
		int secondLargest = secondLargest( arr, n );
		System.out.println("Second largest is " + secondLargest);

	}
	
	
	
	static private int secondLargest( int[] arr, int n ) {
		
		if( n < 2 )
			return -1;
		
		int large = Integer.MIN_VALUE;
		int second_large = Integer.MIN_VALUE;
				
		for ( int i =0; i < n; i++ ) {
			
			if( arr[i] > large) {
				second_large = large;
				large = arr[i];
			}
			else if ( arr[i] > second_large && arr[i] != large)
				second_large = arr[i];
		}
		return second_large;
	}

}
