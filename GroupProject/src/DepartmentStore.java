import java.io.FileNotFoundException;
import java.util.Date;
//import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class DepartmentStore {

	public static void main(String[] args) {

		final double tax = 0.05;
		int option;

		double cash = 10000;
		boolean DepartmentStore = true;

		while (DepartmentStore) {
			Scanner input = new Scanner(System.in);

			System.out.println("1. Buy Products from a Retailer.");
			System.out.println("2. Sold Products to a Customer.");
			System.out.println("3. Check Store Balance. ");
			System.out.println("4. Check & Write Stored Products.");
			System.out.println("5. Check Payment Slip for a Product.");
			System.out.println("6. EXIT.");
			System.out.println("\nChoose an Option.");

			option = input.nextInt();
			switch (option) {

			case 1:
				double spend;

				ProductPurchase productPurchase = new StoreBeta();
				Date date = new Date();

				try {
					int c = 1;
					do {
						try {
							System.out.println("Enter Product ID.");
							productPurchase.setProductId(input.nextInt());
							c = 2;
						} catch (Exception e) {
							System.out.println("Error :" + e);
							input.nextLine();
							System.out.println("Please try again");
						}
					} while (c == 1);
					do {
						c = 1;
						try {

							System.out.println("Enter Product Name.");
							productPurchase.setProductName(input.next());
							c = 2;
						} catch (Exception e) {
							System.out.println("Error :" + e);
							input.nextLine();
							System.out.println("Please try again");
						}
					} while (c == 1);
					do {
						c = 1;
						try {

							System.out.println("Enter Product price.");
							productPurchase.setProductPrice(input.nextDouble());
							c = 2;
						} catch (Exception e) {
							System.out.println("Error :" + e);
							input.nextLine();
							System.out.println("Please try again");
						}
					} while (c == 1);
					spend = productPurchase.getProductPrice();
					ProductPurchase.setTotalSpend(spend);
					productPurchase.setPurchaseDate(date);
					do {
						c = 1;
						try {

							System.out.println("Enter Product Quantity");
							productPurchase.setPurchaseQuantity(input.nextInt());
							c = 2;
						} catch (Exception e) {
							System.out.println("Error :" + e);
							input.nextLine();
							System.out.println("Please try again");
						}
					} while (c == 1);
					cash = cash - (productPurchase.getProductPrice() * productPurchase.getPurchaseQuantity());
					if (cash >= 0) {

						do {
							c = 1;
							try {

								System.out.println("How will you be paying? in Cash or CreditCard?");
								productPurchase.setPurchaseDescription(input.next());
								c = 2;
							} catch (Exception e) {
								System.out.println("Error :" + e);
								input.nextLine();
								System.out.println("Please try again");
							}
						} while (c == 1);
						StoreBeta.stockList.add(productPurchase);
					} else {
						System.out.println("Transaction Denied due to Insufficient Fund");
					}

				} catch (Exception e) {
					System.out.println("Exception Detected! please try again.");
				}
				break;

			case 2:

				int search;
				int confirm;
				int stock;
				double income;
				SaleProduct saleProduct = new SaleProduct();
				Payment payment = new Payment();
				Random rand = new Random();
				Date paymentDate = new Date();
				try {
					for (int i = 0; i < StoreBeta.stockList.size(); i++) {
						System.out.println("Enter the Product ID of Sold Product");
						search = input.nextInt();
						if (StoreBeta.stockList.get(i).getProductId() == search) {
							System.out.println(StoreBeta.stockList.get(i).toString());

							System.out.println("Enter the Quantity of the Sold Prodcut.");
							saleProduct.setSaleProductQuantity(input.nextInt());
							System.out.println("Confirm This Purchase ?\n1.Yes\t2.No");
							confirm = input.nextInt();
							if (confirm == 1) {
								saleProduct.setSaleProductId(StoreBeta.stockList.get(i).getProductId());
								saleProduct.setSaleProductName(StoreBeta.stockList.get(i).getProductName());
								System.out.println("How will you be paying? in Cash or CreditCard?");
								saleProduct.setSaleDescription(input.next());
								income = (StoreBeta.stockList.get(i).getProductPrice()
										* saleProduct.getSaleProductQuantity())
										+ ((StoreBeta.stockList.get(i).getProductPrice() * tax)
												* saleProduct.getSaleProductQuantity());
								cash = cash + income;
								saleProduct.setCashEarned(income);

								payment.setPaymentId(rand.nextInt(10000));
								payment.setPaymentProductId(StoreBeta.stockList.get(i).getProductId());
								payment.setPaymentDate(paymentDate);
								payment.setPaymentAmount(income);
								payment.setPaymentDescription(saleProduct.getSaleDescription());

								payment.add(payment);

								System.out.println("Transaction Complete.");
								stock = StoreBeta.stockList.get(i).getPurchaseQuantity();
								stock = stock - saleProduct.getSaleProductQuantity();
								if (stock == 0) {
									System.out.println("Product Name: '" + StoreBeta.stockList.get(i).getProductName()
											+ "' is now Out of Stock.");
									StoreBeta.stockList.remove(i);
									// break;
								} else if (stock < 0) {
									System.out.println("Amount of Product is Out of Stock.");
								} else {
									StoreBeta.stockList.get(i).setPurchaseQuantity(stock);
								}

								break;
							} else if (confirm == 2) {
								System.out.println("Transaction Denied.");
							} else {
								System.out.println("Wrong Input.");
							}
						} else {
							System.out.println("Product not available.");
						}
					}
				} catch (Exception e) {
					System.out.println("Exception Detected! please try again.");
					System.out.println(e);
				}
				break;
			case 3:
				SaleProduct saleProd = new SaleProduct();
				System.out.println("Store Balance:");
				System.out.println("Balance : " + cash);
				System.out.println();
				double profit;
				profit = saleProd.getCashEarned() - StoreBeta.getTotalSpend();
				if (profit > 0) {
					System.out.println("Profit : " + profit);
				} else {
					System.out.println("Loss : " + profit);
				}
				break;
			case 4:
				System.out.println("Showing Every Available Stock Products.");
				java.io.File file = new java.io.File("Stock List.txt");

				try (java.io.PrintWriter output = new java.io.PrintWriter(file);) {
					for (int i = 0; i < StoreBeta.stockList.size(); i++) {

						System.out.println(StoreBeta.stockList.get(i).toString());
						output.print(StoreBeta.stockList.get(i).toString());
						output.println();
					}
				} catch (FileNotFoundException e) {

					e.printStackTrace();
				}
				break;
			case 5:
				System.out.println("Enter the Product ID of the Sold Product to get the Payment SLip.");
				int paymentSearch = input.nextInt();

				for (int i = 0; i < Payment.paymentList.size(); i++) {
					if (Payment.paymentList.get(i).getPaymentProductId() == paymentSearch) {
						System.out.println("Payment Found.");
						System.out.println(Payment.paymentList.get(i).toString());
					} else {
						System.out.println("Payment of the Product ID '" + paymentSearch + " Not Found.");
					}
				}
				break;
			case 6:
				// exit;
				System.out.println("\tSuccessfully Terminated.\n\tThank you.");
				DepartmentStore = false;
				break;
			default:
				System.out.println("Invalid Option.");
				break;
			}

		}

	}

}