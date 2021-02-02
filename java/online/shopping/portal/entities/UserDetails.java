package online.shopping.portal.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import online.shopping.portal.entities.RoleDetails;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="User_Details")
public class UserDetails implements Serializable {

	  private int userID;
	  private int roleID;
	  private String name;
	  private String email;
	  private String mobileNo;
	  private String password;
	  private SellerDetails seller;
	  

	  
	public UserDetails() {
                
	  }

	public UserDetails(int userID,int roleID, String name, String email, String mobileNo, String password) {
		
		this.userID = userID;
		this.roleID= roleID;
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.password = password;
	}
    @GenericGenerator(name="gen", strategy="native")
    @GeneratedValue(generator="gen")
	@Id
	@Column
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	
	//@ManyToOne(fetch=FetchType.LAZY)
	//@JoinColumn(name="roleID")
//	public RoleDetails getRoleID() {
//		return roleID;
//	}
//
//	public void setRoleID(RoleDetails roleID) {
//		this.roleID = roleID;
//	}
    
	@Column
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    @Column
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	 @Column
	public String getMobileNo() {
		return mobileNo;
	}
    @Column
	public int getRoleID() {
		return roleID;
	}

	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
   @Column
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@OneToOne(mappedBy="users", cascade=CascadeType.ALL)
	  public SellerDetails getSeller() {
		return seller;
	}

	public void setSeller(SellerDetails seller) {
		this.seller = seller;
	}


	@Override
	public String toString() {
		return "UserDetails [userID=" + userID +  "roleID=" + roleID +", name=" + name + ", email=" + email
				+ ", mobileNo=" + mobileNo + ", password=" + password + "]";
	}
	  
	  
}
