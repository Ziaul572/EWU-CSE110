//labProb5

import java.util.Scanner;
public class LabProb5 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in);
		
		int p, q, radius, x, y;
		System.out.print("Enter the cordinate of the center : ");
		p = input.nextInt();
		q = input.nextInt();
		
		System.out.print("Enter the radius of the circle. ");
		radius = input.nextInt();
		
		System.out.println("Enter a coordinate point. ");
		x = input.nextInt();
		y = input.nextInt();
		
		input.close();
		
		float calculatedRadius;
		
		calculatedRadius = (float) Math.sqrt(Math.pow(p - x, 2) + Math.pow(q - y, 2)) ;
		
		if (calculatedRadius > radius) {
			System.out.printf("(%d, %d) is outside the circle.\n ", x, y);
		}
		else {
			System.out.printf("(%d, %d) is inside the circle.\n ", x, y);
		}
	}
}
