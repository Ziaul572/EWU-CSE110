//lab prob 3

import java.util.Scanner;
//import math.sqrt ;
public class LabProb3 {

	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in) ;
		float a, b ,c, r1, r2;
		System.out.print("Input a ,b, c : ");
		
		a = input.nextFloat();
		b = input.nextFloat();
		c = input.nextFloat();
		
		input.close();
		
		r1 = (float) (-b + (Math.sqrt((b*b) - (4*a*c))) / (2*a)) ; 
		r2 = (float) (-b - (Math.sqrt((b*b) - (4*a*c))) / (2*a)) ;
		
		float invalid = (float)(b*b) - (4*a*c);
		if (a == 0 || invalid <= 0) {
			System.out.print("Invalid\n");
		}
		System.out.printf("The Equation has two roots %f and %f \n", r1, r2 );
	}
}
