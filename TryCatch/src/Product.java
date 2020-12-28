import java.util.Scanner;

public class Product {
	
	public static void productCheck(int w)  {
			try {
		if (w < 100) {	
			//throw "ProductInvaid";
		System.out.println("ProductInvaid");
	}
		else {
			System.out.println("Product Weight is : " + w);
			//System.out.println(w);
		}
	}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
	}
	public static void main (String[] args) throws ArithmeticException{
		int weight;
		
		 Scanner input = new Scanner (System.in);
		 System.out.println("Enter Product Weight.");
		 
		 weight = input.nextInt();
		 productCheck(weight);
			input.close();
			//return 0;
		}
	
}
