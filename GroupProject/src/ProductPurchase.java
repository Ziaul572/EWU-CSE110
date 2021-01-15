import java.util.Date;
//import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.Iterator;

public class ProductPurchase {
	
	
	private int productId;	
	private String productName;
	private double productPrice;
	private Date purchaseDate;
	private int purchaseQuantity;
	private String purchaseDescription;
	private static double totalSpend = 0;
	
	ProductPurchase(){
	
	}
	//ArrayList<ProductPurchase> list = new ArrayList<ProductPurchase>();
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productid) {
	
		productId = productid;
	} 
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date date) {
		this.purchaseDate = date;
	}
	public int getPurchaseQuantity() {
		return purchaseQuantity;
	}
	public void setPurchaseQuantity(int purchaseQuantity) {
		if (purchaseQuantity <= 0) {
			System.out.println("Invalid Input.");
		} else {
		this.purchaseQuantity = purchaseQuantity;
	}
	}
	public String getPurchaseDescription() {
		return purchaseDescription;
	}
	public void setPurchaseDescription(String purchaseDescription) {
		this.purchaseDescription = purchaseDescription;
	}
	
	public static double getTotalSpend() {
		return totalSpend;
	}

	public static void setTotalSpend(double totalSpend) {
		ProductPurchase.totalSpend = ProductPurchase.totalSpend + totalSpend;
	}

	public String toString() {
		return "Product Details: \n[Product ID = " + productId + "\nProduct Name = " + productName + "\nProduct Price="
				+ (productPrice + (productPrice * 0.05)) + "$" +"\nPurchase Date = " + purchaseDate + "\nPurchase Quantity = " + purchaseQuantity
				+ "\nPurchased With = " + purchaseDescription + "]";
	}

	public static Iterator<ProductPurchase> iterator() {
		
		return null;
	}
}
