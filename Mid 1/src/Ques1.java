import java.util.Scanner;

public class Ques1 {

	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length of a : ");
		int a = input.nextInt();
		
		System.out.print("Enter the length of b : ");
		int b = input.nextInt();
		
		System.out.print("Enter the length of c : ");
		int c = input.nextInt();
		
		input.close();
		
		if(a < 0 || b < 0 || c < 0) {
			System.out.print("Side length of triangle can not be negative.\n");
		}
		
		else if (((a + b) >= c) || ((b + c) >= a) || ((a + c) >= b)) {
			System.out.print("It is a triangle.\n");
		}
		else {
			System.out.print("Not a triangle.\n");
		}
		
		double area;
		int perimeter; 
		
		if (a == b && b == c && c == a) {
			area = (Math.sqrt(3) / 4) * (Math.pow(a, 2));
			perimeter = 3 * a ;
			
			System.out.println("Area : " + area);
			System.out.println("perimeter : " + perimeter);
		}
		else {
			System.out.print("Not Equilateral\n");
		}
	}
}
