package online.shopping.portal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Inventory_Details")
public class InventoryDetails {
	@GenericGenerator(name="gen", strategy="native")
	@GeneratedValue(generator="gen")
	@Id
	@Column
	 private int inventoryID;
	@Column
	 private int productID;
	@Column
	private int sellerID;
	@Column
	 private int quantity;
	
	
	 
	 
	public InventoryDetails() {
		
	}


	public InventoryDetails(int inventoryID, int productID,int sellerID, int quantity) {
		super();
		this.inventoryID = inventoryID;
		this.productID = productID;
		this.sellerID = sellerID;
		this.quantity = quantity;
	}


	public int getInventoryID() {
		return inventoryID;
	}


	public void setInventoryID(int inventoryID) {
		this.inventoryID = inventoryID;
	}


	public int getProductID() {
		return productID;
	}


	public void setProductID(int productID) {
		this.productID = productID;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getSellerID() {
		return sellerID;
	}


	public void setSellerID(int sellerID) {
		this.sellerID = sellerID;
	}


	@Override
	public String toString() {
		return "InventoryDetails [inventoryID=" + inventoryID + ", productID=" + productID + ", quantity=" + quantity
				+ "]";
	}
	 
	
	 
}
