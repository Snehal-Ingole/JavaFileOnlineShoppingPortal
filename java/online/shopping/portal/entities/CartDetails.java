package online.shopping.portal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Cart_Details")
public class CartDetails {
	@GenericGenerator(name="gen", strategy="native")
	@GeneratedValue(generator="gen")
	@Id
	@Column
	private int cartID;
	@Column
	private int oderID;
	@Column
	private int productID;
	@Column
	private int customerID;
	@Column
	private int quantity;
	@Column
	private String cartStatus;
	@Column
	private double unitprice;
	@Column
	private String productCategory;
	
	
	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public CartDetails() {
		
	}
	
	public double getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}

	
	public CartDetails(int cartID, int oderID, int productID, int customerID, int quantity, String cartStatus,
			double unitprice, String productCategory) {
		super();
		this.cartID = cartID;
		this.oderID = oderID;
		this.productID = productID;
		this.customerID = customerID;
		this.quantity = quantity;
		this.cartStatus = cartStatus;
		this.unitprice = unitprice;
		this.productCategory = productCategory;
	}

	public int getCartID() {
		return cartID;
	}
	public void setCartID(int cartID) {
		this.cartID = cartID;
	}
	public int getOderID() {
		return oderID;
	}
	public void setOderID(int oderID) {
		this.oderID = oderID;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
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
	public String getCartStatus() {
		return cartStatus;
	}
	public void setCartStatus(String cartStatus) {
		this.cartStatus = cartStatus;
	}
	@Override
	public String toString() {
		return "CartDetails [cartID=" + cartID + ", oderID=" + oderID + ", productID=" + productID + ", customerID="
				+ customerID + ", quantity=" + quantity + ", cartStatus=" + cartStatus + "]";
	}
	
	

}
