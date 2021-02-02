package online.shopping.portal.entities;

public class PaymentDetails {

	 private int paymentID;
	 private int addressID;
	public PaymentDetails() {
		
	}
	public PaymentDetails(int paymentID, int addressID) {
		super();
		this.paymentID = paymentID;
		this.addressID = addressID;
	}
	public int getPaymentID() {
		return paymentID;
	}
	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}
	public int getAddressID() {
		return addressID;
	}
	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}
	@Override
	public String toString() {
		return "PaymentDetails [paymentID=" + paymentID + ", addressID=" + addressID + "]";
	}
	 
	 
}
