
public class SaleProduct {

	private int saleProductId;
	private String saleProductName;
	private int saleProductQuantity;
	private String saleDescription;
	
	
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
	
	@Override
	public String toString() {
		return "SaleProduct [saleProductId=" + saleProductId + ", saleProductName=" + saleProductName
				+ ", saleProductQuantity=" + saleProductQuantity + ", saleDescription=" + saleDescription + "]";
	}
	
	
}
