
public class SaleProduct {

	private int saleProductId;
	private String saleProductName;
	private int saleProductQuantity;
	private String saleDescription;
	private static double cashEarned = 0;
	
	
	public int getSaleProductId() {
		return saleProductId;
	}
	public void setSaleProductId(int saleProductId) {
		this.saleProductId = saleProductId;
	}
	public String getSaleProductName() {
		return saleProductName;
	}
	public void setSaleProductName(String saleProductName) {
		this.saleProductName = saleProductName;
	}
	public int getSaleProductQuantity() {
		return saleProductQuantity;
	}
	public void setSaleProductQuantity(int saleProductQuantity) {
		this.saleProductQuantity = saleProductQuantity;
	}
	public String getSaleDescription() {
		return saleDescription;
	}
	public void setSaleDescription(String saleDescription) {
		this.saleDescription = saleDescription;
	}
	public double getCashEarned() {
		return cashEarned;
	}
	public void setCashEarned(double Earned) {
		SaleProduct.cashEarned = SaleProduct.cashEarned + Earned;
	}
	
	@Override
	public String toString() {
		return "Sale Product [ Sale Product ID = " + saleProductId + ", Sale Product Name = " + saleProductName
				+ ", Sale Product Quantity = " + saleProductQuantity + ", Sale Description = " + saleDescription + " ]";
	}
	
	
}
