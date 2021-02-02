package online.shopping.portal.entities;

public class OrderDetails {

	private int orderID;
	private int productID;
	private int paymentID;
	private int customerID;
	private int quantity;
	private String oderDate;
	private String orderStatus;
	private String deliveryDate;
	private double deliveryCharges;
	public OrderDetails() {
		
	}
	public OrderDetails(int orderID, int productID, int paymentID, int customerID, int quantity, String oderDate,
			String orderStatus, String deliveryDate, double deliveryCharges) {
		super();
		this.orderID = orderID;
		this.productID = productID;
		this.paymentID = paymentID;
		this.customerID = customerID;
		this.quantity = quantity;
		this.oderDate = oderDate;
		this.orderStatus = orderStatus;
		this.deliveryDate = deliveryDate;
		this.deliveryCharges = deliveryCharges;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public int getPaymentID() {
		return paymentID;
	}
	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getOderDate() {
		return oderDate;
	}
	public void setOderDate(String oderDate) {
		this.oderDate = oderDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public double getDeliveryCharges() {
		return deliveryCharges;
	}
	public void setDeliveryCharges(double deliveryCharges) {
		this.deliveryCharges = deliveryCharges;
	}
	@Override
	public String toString() {
		return "OrderDetails [orderID=" + orderID + ", productID=" + productID + ", paymentID=" + paymentID
				+ ", customerID=" + customerID + ", quantity=" + quantity + ", oderDate=" + oderDate + ", orderStatus="
				+ orderStatus + ", deliveryDate=" + deliveryDate + ", deliveryCharges=" + deliveryCharges + "]";
	}
	
	 
	
	
	 
}
