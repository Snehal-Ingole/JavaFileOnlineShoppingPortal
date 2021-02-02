package online.shopping.portal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Shipping_address_Details")
public class ShippingAddressDetails {
	@GenericGenerator(name="gen", strategy="native")
	@GeneratedValue(generator="gen")
	@Id
	@Column
	private int addressID;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String address;
	@Column
	private String email;
	@Column
	private String mobileNo;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String country;
	@Column
	private int pincode;
	
	public ShippingAddressDetails() {
		 
	}
	public ShippingAddressDetails(int addressID, String firstName, String lastName, String address, String email,
			String mobileNo, String city, String state, String country, int pincode) {
		super();
		this.addressID = addressID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.mobileNo = mobileNo;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public int getAddressID() {
		return addressID;
	}
	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "ShippingAddressDetails [addressID=" + addressID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", email=" + email + ", mobileNo=" + mobileNo + ", city=" + city + ", state="
				+ state + ", country=" + country + ", pincode=" + pincode + "]";
	}
	
	
}
