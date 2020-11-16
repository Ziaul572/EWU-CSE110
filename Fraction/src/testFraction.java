import java.util.Scanner;

public class testFraction {
	public static void main (String [] args) {
		fraction frac1 = new fraction();
		fraction frac2 = new fraction();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the 1st fraction's Numerator: ");
		frac1.setNumo(input.nextInt());
		System.out.print("Enter the 1st fraction's Denominator: ");
		frac1.setDeno(input.nextInt());
		
		System.out.print("Enter the 2nd fraction's Numerator: ");
		frac2.setNumo(input.nextInt());
		System.out.print("Enter the 2nd fraction's Denominator: ");
		frac2.setDeno(input.nextInt());
		
		input.close();
		
		 fraction.display(frac1);
		 fraction.display(frac2);
		 
		 fraction.add(frac1, frac2);
		 fraction.sub(frac1, frac2);
		 fraction.multiplication(frac1, frac2);
		 fraction.division(frac1, frac2);
	}
}
