import java.util.Scanner;

//LabQuestion 1
public class LabProb1 {

		public static void main (String [] args) {
			
			Scanner input = new Scanner(System.in);
			
			int num;
			System.out.print("Enter a Number : ");
			num = input.nextInt();
			
			input.close();
			
			if((num % 2 == 0) && (num % 3 == 0)) {
				System.out.println("FALSE");
			}
			else if (num % 2 == 0 || num % 3 == 0 ) {
				System.out.println("TRUE");
			}
			else {
				System.out.println("FALSE");
			}
		}
}
