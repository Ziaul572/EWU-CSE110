import java.util.Scanner;

public class Ques2 {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		int lowCount = 0, midCount = 0, highCount = 0;
		int lowMax = 0, midMax = 0, highMax = 0;
		
		int run;
		
		for(int i = 0; i < 11; i++) {
			run = input.nextInt();
			
			if (run >= 0 && run <= 30 ) {
				lowCount++;
				if (lowMax <= run) {
					lowMax = run;
				}
			}
			else if (run >= 31 && run <= 70) {
				midCount++;
				if (midMax <= run) {
					midMax = run;
				}
			}
			else if (run >= 71) {
				highCount++;
				if (highMax <= run) {
					highMax = run;
				}
			}
			else {
				System.out.print("Invalid input.\n");
			}
		}
		input.close();
		
		System.out.println("Very Poor Performence ");
		System.out.printf("Total: %d Max Run: %d \n", lowCount, lowMax);
		
		System.out.println("Average Performence ");
		System.out.printf("Total: %d Max Run: %d \n", midCount, midMax);
		
		System.out.println("Very Good Performence ");
		System.out.printf("Total: %d Max Run: %d \n", highCount, highMax);
	}
}
