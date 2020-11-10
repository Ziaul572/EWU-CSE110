import java.util.Scanner;

public class Lab1 {
	
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of students");
		int n = input.nextInt();
		int best = 0;
		int [] arr = new int [n];
		
		System.out.printf("Enter %d scores : ",n);
		for(int i = 0; i < n; i++) {
				arr[i] = input.nextInt();
			if (arr[i] > best) {
				best = arr[i] ;
			}
		}
		input.close();
		
		for (int i = 0; i < arr.length ; i++) {
			if (best - arr[i] >= 0 && best - arr[i] <= 10) {
				System.out.printf("Student %d score is %d and Grade is A\n", i, arr[i]);
			}
			if (best - arr[i] >= 11 && best - arr[i] <= 20) {
				System.out.printf("Student %d score is %d and Grade is B\n", i, arr[i]);
			}
			if (best - arr[i] >= 21 && best - arr[i] <= 30) {
				System.out.printf("Student %d score is %d and Grade is C\n", i, arr[i]);
			}
			if (best - arr[i] >= 31) {
				System.out.printf("Student %d score is %d and Grade is D\n", i, arr[i]);
			}
		}
		
	}
}
