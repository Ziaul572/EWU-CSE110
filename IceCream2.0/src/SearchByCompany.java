import java.util.Scanner;

public class SearchByCompany {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter Number of IceCreams :  ");
		
		int n = input.nextInt();
		//input.close();
		String iceType, iceComp;
		double icePrice; 
		IceCream [] num = new IceCream[n];

		for(int i = 0; i < num.length; i++) {
			System.out.print("Enter IceCream Type : ");
			iceType = input.next();
			System.out.print("Enter IceCream Company name : ");
			iceComp = input.next();
			System.out.print("Enter IceCream Price : ");
			icePrice = input.nextDouble();
			num [i] = new IceCream(iceType, iceComp, icePrice);
		
		}
		//input.close();
		String search;
		System.out.print("Enter a IceCream Company name. \n");
		search = input.next();
		input.close();
		int index = 0;
		for(int i = 0; i < num.length; i++) {
			if(num[i].getComp() == search) {
				index = i;
				break;
			}
		}
		IceCream.displayIcecream(num[index]);
		
	}
}
