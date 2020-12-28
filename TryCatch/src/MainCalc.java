import java.util.Scanner;

public class MainCalc {

	public static void main (String[] args) throws ArithmeticException {
		Calculator calc = new Calculator();
		
		
		String in;
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("+");
			System.out.println("-");
			System.out.println("*");
			System.out.println("/");
			System.out.println("!.  Exit");
			in = input.next();
			if (in.equals("+")) {
				System.out.println("Enter 2 inputs");
				
				System.out.println(calc.Add(input.nextDouble(), input.nextDouble()));
			}
			else if (in.equals("-")) {
				System.out.println("Enter 2 inputs");
				
				System.out.println(calc.Subtract(input.nextDouble(), input.nextDouble()));
			}
			else if (in.equals("*")) {
				System.out.println("Enter 2 inputs");
				
				System.out.println(calc.Multiply(input.nextDouble(), input.nextDouble()));
			}
			else if(in.equals("/")) {
				System.out.println("Enter 2 inputs");
				
				System.out.println(calc.Division(input.nextDouble(), input.nextDouble()));
			}
			else if (in.equals("!")) {
				 break;
			}
		}
		input.close();
	}
}
