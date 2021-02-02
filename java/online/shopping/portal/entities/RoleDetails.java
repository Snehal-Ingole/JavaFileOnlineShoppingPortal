package online.shopping.portal.entities;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import online.shopping.portal.entities.UserDetails;

@Entity
@Table(name="Role_Details")
public class RoleDetails {
  private int roleID;
  private String roleName;
 //private List<UserDetails> userList; 
 
 public RoleDetails() {
	 
 }
 public RoleDetails(int roleID, String roleName) {
 	
 	this.roleID = roleID;
 	this.roleName = roleName;
 	//this.userList = new ArrayList<>();
 }
  
 //@OneToMany(mappedBy="roleID", fetch=FetchType.LAZY, cascade = { CascadeType.PERSIST }) 
//public List<UserDetails> getUserList() {
//	return userList;
//}
//public void setUserList(List<UserDetails> userList) {
//	this.userList = userList;
//}
 
 
@GenericGenerator(name="gen", strategy="native")
@GeneratedValue(generator="gen")
@Id
@Column
public int getRoleID() {
	return roleID;
}
public void setRoleID(int roleID) {
	this.roleID = roleID;
}

@Column
public String getRoleName() {
	return roleName;
}
public void setRoleName(String roleName) {
	this.roleName = roleName;
}
@Override
public String toString() {
	return "RoleDetails [roleID=" + roleID + ", roleName=" + roleName + "]";
}
  
  
}
