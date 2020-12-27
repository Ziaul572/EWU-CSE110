import java.util.ArrayList;
//import java.util.Calendar;
import java.util.Scanner;

public class CardMain {

	public static void main(String[] args) {
		int option;
		Scanner input = new Scanner(System.in);
		
		ArrayList<ATMCard> ATMcardList = new ArrayList<ATMCard> ();
		while(true) {
			System.out.println("1. Press 1 for Debit Card.");
			System.out.println("2. Press 2 for Credit Card.");
			System.out.println("3. Press 3 for Next.");
			
			option = input.nextInt();
			if(option == 1) {
				ATMCard debCard = new DebitCard();
				
				System.out.println("Debit Card number.");
				debCard.setCardNumber(input.nextInt());
				
				System.out.println("Debit card verification code (cvc).");
				debCard.setCvc(input.nextInt());
				
				System.out.println("Debit Card Account Balance.");
				debCard.setAccBalance(input.nextInt());
				
				//System.out.println("");
				//Calendar calendar = Calendar.getInstance();  
				//debCard.setExpirydate(calendar.add(Calendar.YEAR, -4));
				
				debCard.setLimit(debCard.getAccBalance());
				System.out.println("Debit Card limit is ." + debCard.getAccBalance());
				
			ATMcardList.add(debCard);
			}
			else if (option == 2) {
				ATMCard credCard = new CreditCard();
				
				System.out.println("Credit Card number..");
				credCard.setCardNumber(input.nextInt());
				
				System.out.println("Credit card verification code (cvc).");
				credCard.setCvc(input.nextInt());
				
				System.out.println("Credit Card user Salary.");
				credCard.setSalary(input.nextDouble());
				
				System.out.println("Credit Card user Expense.");
				credCard.setExpense(input.nextDouble());
				
				credCard.limit();
				System.out.println("Credit Card Limit.");	
				
			
				
			ATMcardList.add(credCard);
			}
			else if(option == 3) {
				break;
			//	System.out.println("")
			}
			else {
				System.out.println("Invalid Option.");
			}
			
		}
		String serachCard;
		boolean search = false;
		System.out.println("1. Press 1 to Search an ATM Card.");
		System.out.println("2. Press 2 to Compare an ATM Card.");
		System.out.println("3. Exit.");
	while(true) {
		option = input.nextInt();
		if (option == 1) {
			System.out.println("Enter Card Number.");
			serachCard = input.next();
			for(int i = 0; i < ATMcardList.size(); i++) {
				if(serachCard.equals(ATMcardList.get(i).getCardNumber(i))) {
					ATMcardList.get(i).toString();
					search = true;
					//System.out.println("Good");
				}
			}
			if(search == false) {
				System.out.println("Card Number not matched.");
			}
		}
		else if(option == 2) {
			break; //compare
		}
		else if(option == 3) {
			System.out.println("Thank you.");
			break;
		}
	}
	input.close();
		
	}

}
