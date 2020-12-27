import java.util.Calendar; 

abstract class ATMCard {
	
	private int cardNumber;
	 Calendar expirydate = Calendar.getInstance(); 
	//private Calander expirydate;
	private int cvc;
	private double limit;
	
	ATMCard(){
		
	}
	ATMCard(int cnum, int cvc, double limit){
		cardNumber = cnum;
		this.cvc = cvc;
		this.limit = limit;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getCvc() {
		return cvc;
	}
	public void setCvc(int cvc) {
		this.cvc = cvc;
	}
	public double getLimit() {
		return limit;
	}
	public void setLimit(double limit) {
		this.limit = limit;
	}
	public Calendar getExpirydate() {
		return expirydate;
	}
//	public void setExpirydate(Calendar object) {
//		this.expirydate =  object;
//	}
	@Override
	public String toString() {
		return "ATMCard [cardNumber=" + cardNumber + ", expirydate=" + expirydate + ", evc=" + cvc + ", limit=" + limit
				+ "]";
	}
	//abstract limit()
	protected abstract void setAccBalance(int nextInt);
	protected abstract void setExpirydate(Object add);
	protected abstract double getAccBalance();
	protected abstract void setSalary(double nextDouble);
	protected abstract void setExpense(double nextDouble);
	protected abstract double limit();
	//protected abstract void setSalary(double nextDouble);
	protected abstract Object getCardNumber(int i);
	//protected abstract void setExpirydate(Object add);
	
	
}
