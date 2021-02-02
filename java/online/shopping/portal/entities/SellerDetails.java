package online.shopping.portal.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Seller_Details")
public class SellerDetails {
	@GenericGenerator(name="gen", strategy="native")
	@GeneratedValue(generator="gen")
	@Id
	@Column
	private int sellerID;
	@Column
	private int userID;
	
	@Column
    private String product;
	@Column
    private double sellerPrice;

	@Column
    private String bankDetails;

	@OneToOne
	@PrimaryKeyJoinColumn
	 private UserDetails users;
	
	
	@OneToMany(mappedBy="sellerID", fetch=FetchType.EAGER)
	private List<InventoryDetails> InventoryList;
	
	public SellerDetails() {
		
	}
	public SellerDetails(int sellerID, int userID, String product, double sellerPrice,
			String bankDetails) {
		
		this.sellerID = sellerID;
		this.userID = userID;
		this.product = product;
		this.sellerPrice = sellerPrice;
		this.bankDetails = bankDetails;
	}
	public int getSellerID() {
		return sellerID;
	}
	public void setSellerID(int sellerID) {
		this.sellerID = sellerID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public double getSellerPrice() {
		return sellerPrice;
	}
	public void setSellerPrice(double sellerPrice) {
		this.sellerPrice = sellerPrice;
	}
	
	public String getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(String bankDetails) {
		this.bankDetails = bankDetails;
	}
	public List<InventoryDetails> getInventoryList() {
		return InventoryList;
	}
	public void setInventoryList(List<InventoryDetails> inventoryList) {
		InventoryList = inventoryList;
	}
	public UserDetails getUsers() {
		return users;
	}
	public void setUsers(UserDetails users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "SellerDetails [sellerID=" + sellerID + ", userID=" + userID + ", product=" + product + ", sellerPrice="
				+ sellerPrice + ",  bankDetails=" + bankDetails + "]";
	}
    
    

}
