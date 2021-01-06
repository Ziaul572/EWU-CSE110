//By Rupin.
import java.util.Date;
import java.util.ArrayList;

public class Payment extends SaleProduct{

    private int PaymentId;
    private Date PaymentDate;
    private double PaymentAmount;
    private String PaymentDescription;

    Payment() {
    }
    static ArrayList<Payment> list = new ArrayList<Payment>();

    public int getPaymentId() {
        return PaymentId;
    }

    public void setPaymentId(int PaymentId) {
        this.PaymentId = PaymentId;
    }

    public Date getPaymentDate() {
        return PaymentDate;
    }

    public void setPaymentDate(Date PaymentDate) {
        this.PaymentDate = PaymentDate;
    }

    public double getPaymentAmount() {
        return PaymentAmount;
    }

    public void setPaymentAmount(double PaymentAmount) {
        this.PaymentAmount = PaymentAmount;
    }

    public String getPaymentDescription() {
        return PaymentDescription;
    }

    public void setPaymentDescription(String PaymentDescription) {
        this.PaymentDescription = PaymentDescription;
    }

    @Override
        public String toString(){

        return "Payment Slip\nPayment ID: " + getPaymentId() +"\n"+
               "Payment Date: " + getPaymentDate() + "\n"+
               "Payment Amount: " + getPaymentAmount() + "\n"+
               "Payment Description: " + getPaymentDescription() + "\n";

        }



}