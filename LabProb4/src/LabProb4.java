//LabProb4

import java.util.Scanner ;
public class LabProb4 {

	public static void main(String [] args) {
		
		int option;
		
		Scanner input = new Scanner (System.in);
		
		float bdt, usd ;
		System.out.println("Enter mode of conversation:\n 1. USD to BDT\n2.BDT to USD");
		option = input.nextInt();
		
		switch (option) {
			
		case 1 :
			System.out.println("Enter amount in USD.");
			usd = input.nextFloat();
			
			bdt = ( usd * (float) 84.75) ;
			System.out.printf("%f USD = %f BDT \n", usd, bdt);
			break;
		
		case 2:
			System.out.println("Enter amount in BDT.");
			bdt = input.nextFloat();
			
			usd = bdt * (float) 0.012 ;
			System.out.printf("%f BDT = %f USD \n", bdt, usd);
			break;
		default :
			System.out.print("Invalid option\n");
		}
		input.close();
		
	}
	
}
