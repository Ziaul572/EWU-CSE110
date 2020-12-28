import java.sql.Date;

public class ProductPurchase {
		
		ProductPurchase(){
			
		}
	
	private int productId;	
	private String productName;
	private double productPrice;
	private Date purchaseDate;
	private int purchaseQuantity;
	private String purchaseDescription;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
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
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public int getPurchaseQuantity() {
		return purchaseQuantity;
	}
	public void setPurchaseQuantity(int purchaseQuantity) {
		this.purchaseQuantity = purchaseQuantity;
	}
	public String getPurchaseDescription() {
		return purchaseDescription;
	}
	public void setPurchaseDescription(String purchaseDescription) {
		this.purchaseDescription = purchaseDescription;
	}
	
	@Override
	public String toString() {
		return "ProductPurchase [productId=" + productId + ", productName=" + productName + ", productPrice="
				+ productPrice + ", purchaseDate=" + purchaseDate + ", purchaseQuantity=" + purchaseQuantity
				+ ", purchaseDescription=" + purchaseDescription + "]";
	}
	
	
}
