
public class DebitCard extends ATMCard {
	
	private int accBalance;
	
	DebitCard(){
		
	}
	public DebitCard(int cnum, int cvc, double limit, int accBalance) {
		super(cnum, cvc, limit);
		this.accBalance = accBalance;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(int accBalance) {
		this.accBalance = accBalance;
	}
	@Override
	public String toString() {
		return "DebitCard [accBalance=" + accBalance + ", getCardNumber()=" + getCardNumber() + ", getEvc()=" + getCvc()
				+ ", getLimit()=" + getLimit() + ", getExpirydate()=" + getExpirydate() + "]";
	}
	public double limit() {
		super.setLimit(accBalance);
		return super.getLimit();
	}
	@Override
	protected void setExpirydate(Object add) {
		// TODO Auto-generated method stub
		
	}
	@Override
	protected void setSalary(double nextDouble) {
		// TODO Auto-generated method stub
		
	}
	@Override
	protected void setExpense(double nextDouble) {
		// TODO Auto-generated method stub
		
	}
	@Override
	protected Object getCardNumber(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
