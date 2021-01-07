
import java.util.Date;
import java.util.Scanner;

public class DepartmentStore {

	
	public static void main (String [] args) {
		
		final double tax = 0.05;
		int option;
		Scanner input = new Scanner(System.in);
		double cash = 10000;
		
		while(true) {
			System.out.println("1. Buy Products from a Retailer.");
			System.out.println("2. Sold Products to a Customer.");
			System.out.println("3. Check Store Balance. ");
			System.out.println("4. Check Stored Products.");
			
			option = input.nextInt();
			switch(option) {
			case 1: 
				//reRun:
				try {
					double spend;
				ProductPurchase productPurchase = new StoreBeta();
				Date date = new Date();
				System.out.println("Enter Product ID.");
				productPurchase.setProductId(input.nextInt());
				System.out.println("Enter Product Name.");
				//input.next();
				productPurchase.setProductName(input.next());
				System.out.println("Enter Product price.");
				productPurchase.setProductPrice(input.nextDouble());
				spend = productPurchase.getProductPrice();
				ProductPurchase.setTotalSpend(spend);
				productPurchase.setPurchaseDate(date);
				System.out.println("Enter Product Quantity");
				productPurchase.setPurchaseQuantity(input.nextInt());
				cash = cash - (productPurchase.getProductPrice() * productPurchase.getPurchaseQuantity());
				System.out.println("How will you be paying? in Cash or CreditCard?");
				productPurchase.setPurchaseDescription(input.next());
				
				StoreBeta.stockList.add(productPurchase);
				//stockList.add(productPurchase);
				}	catch(Exception e) {
					System.out.println("Exception Detected! please try again.");
					//continue reRun;
				}
				 break;
			case 2:
				//sell
				int search;
				int confirm;
				int stock;
				double income;
				SaleProduct saleProduct = new SaleProduct();
				try {
				for(int i = 0; i < StoreBeta.stockList.size(); i++) {
					System.out.println("Enter the Product ID of Sold Product");
					search = input.nextInt();
					if(StoreBeta.stockList.get(i).getProductId() == search) {
						System.out.println(StoreBeta.stockList.get(i).toString());
						//System.out.println("yo");
						System.out.println("Enter the Quantity of the Sold Prodcut.");
						saleProduct.setSaleProductQuantity(input.nextInt());
						System.out.println("Confirm This Purchase ?\n1.Yes\t2.No");
						confirm = input.nextInt();
						if(confirm == 1) {
							saleProduct.setSaleProductId(StoreBeta.stockList.get(i).getProductId());
							saleProduct.setSaleProductName(StoreBeta.stockList.get(i).getProductName());
							System.out.println("How will you be paying? in Cash or CreditCard?");
							saleProduct.setSaleProductName(input.next());
							income = (StoreBeta.stockList.get(i).getProductPrice() * saleProduct.getSaleProductQuantity() ) + ((StoreBeta.stockList.get(i).getProductPrice() * tax) * saleProduct.getSaleProductQuantity());
							cash = cash + income ;
							saleProduct.setCashEarned(income);
							System.out.println("Transaction Complete.");
							stock = StoreBeta.stockList.get(i).getPurchaseQuantity();
							stock = stock - saleProduct.getSaleProductQuantity();
							if (stock == 0 ) {
								StoreBeta.stockList.remove(i);
								System.out.println("Product ID: " + StoreBeta.stockList.get(i).getProductId() + "is Out of Stock.");
							}	
							else if (stock < 0) {
								System.out.println("Amount of Product is Out of Stock.");
							}
							else {
								StoreBeta.stockList.get(i).setPurchaseQuantity(stock);
							}
							
						}
						else if (confirm == 2) {
							System.out.println("Transaction Denied.");
						}
						else {
							System.out.println("Wrong Input.");
						}
					}
					else {
						System.out.println("Product not available.");
					}
				}
				} catch (Exception e) {
					System.out.println("Exception Detected! please try again.");
					System.out.println(e);
				}
				break;
			case 3: //Coming Soon
				SaleProduct saleProd = new SaleProduct();
				System.out.println("Store Balance:");
				System.out.println("Balance : " + cash);
				System.out.println();
				double profit;
					profit = saleProd.getCashEarned() - StoreBeta.getTotalSpend();
					if (profit > 0) {
						System.out.println("Profit : " + profit);
					}
					else {
						System.out.println("Loss : " + profit);
					}
				break;
			case 4:
				
				break;
				
			default:
				
				break;
			}
			
		}
	}
	
}
