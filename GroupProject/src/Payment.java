
import java.util.Date;
import java.util.ArrayList;

public class Payment extends SaleProduct{

    private int paymentId;
    private int paymentProductId;
    private Date paymentDate;
    private double paymentAmount;
    private String paymentDescription;

    Payment() {
    }
    static ArrayList<Payment> paymentList = new ArrayList<Payment>();

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int PaymentId) {
        this.paymentId = PaymentId;
    }
    
    public int getPaymentProductId() {
		return paymentProductId;
	}

	public void setPaymentProductId(int paymentProductId) {
		this.paymentProductId = paymentProductId;
	}

	public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date PaymentDate) {
        this.paymentDate = PaymentDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double PaymentAmount) {
        this.paymentAmount = PaymentAmount;
    }

    public String getPaymentDescription() {
        return paymentDescription;
    }

    public void setPaymentDescription(String PaymentDescription) {
        this.paymentDescription = PaymentDescription;
    }

    public void add (Payment obj) {
    	paymentList.add(obj);
    }
	@Override
	public String toString() {
		return "Payment Slip Details [Payment ID = " + paymentId + ",\nPayment Product ID = " + paymentProductId + ",\nPayment Date = "
				+ paymentDate + ",\nPayment Amount = " + paymentAmount + ",\nPayment Description = " + paymentDescription + "]";
	}

   


}