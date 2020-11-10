//LabProb2

import java.util.Scanner ;
public class LabProb2 {

	public static void main (String [] args) {
		
		int min, day, year ;
		Scanner input = new Scanner (System.in);
		
		min = input.nextInt();
		
		input.close();
		
		int inputValue = min;
		day = min / 1440 ;
		min = min % 1440 ;
		
		year = day / 365 ;
		day = day % 365 ;
		
		System.out.printf("%d minutes is approximatly %d years and %d days \n", inputValue, year, day);
		
	}
}
