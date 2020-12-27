
public class CreditCard extends ATMCard {
	
	private int linkedAcc;
	private double mrpint;
	private double withdrawLimit;
	private double salary;
	private double expense;
	
	CreditCard() {
	}
	
	public CreditCard(int cnum, int cvc, double limit, double mrpint, double withdrawlimit){
		super(cnum, cvc, limit);
	//	this.linkedAcc = linkedacc;
		this.mrpint = mrpint;
		this.withdrawLimit = withdrawlimit;
	}

//	public int getLinkedAcc() {
//		return linkedAcc;
//	}
//
//	public void setLinkedAcc(int linkedAcc) {
//		this.linkedAcc = linkedAcc;
//	}

	public double getMrpint() {
		return mrpint;
	}

	public void setMrpint(double mrpint) {
		this.mrpint = mrpint;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getExpense() {
		return expense;
	}

	public void setExpense(double expense) {
		this.expense = expense;
	}

	@Override
	public String toString() {
		return "CreditCard [linkedAcc=" + linkedAcc + ", mrpint=" + mrpint + ", withdrawLimit=" + withdrawLimit
				+ ", getCardNumber()=" + getCardNumber() + ", getEvc()=" + getCvc() + ", getLimit()=" + getLimit()
				+ ", getExpirydate()=" + getExpirydate() + "]";
	}
	
	public double limit() {
		return (this.salary + this.expense);
	}

	@Override
	protected void setAccBalance(int nextInt) {
		
		
	}

	@Override
	protected void setExpirydate(Object add) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected double getAccBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected Object getCardNumber(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
