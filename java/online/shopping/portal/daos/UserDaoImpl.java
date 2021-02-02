package online.shopping.portal.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import online.shopping.portal.entities.ProductDetails;
import online.shopping.portal.entities.UserDetails;

@Repository
public class UserDaoImpl {

	 @Autowired
	 private SessionFactory factory;
	 
	  public UserDetails getUser(String email)
	  {
		  Session session= factory.getCurrentSession();
		  Query q= session.createQuery("from UserDetails user where user.email=:p_email");
		  q.setParameter("p_email", email);
		  System.out.println("Email="+email);
		  UserDetails u= (UserDetails) q.getSingleResult();
		  System.out.println("User: "+u);
		  return u;
	  }
	 
	  public List<UserDetails> getAllUsers() {
		String hql="from UserDetails";
		  //	String hql = "select name from UserDetails, SellerDetails where UserDetails.userID = SellerDetails.userID";
			Session session = factory.getCurrentSession();
			Query q = session.createQuery(hql);
			return q.getResultList();
		}
	  
	  
	 public void addUser(UserDetails user)
	 {
		 Session session= factory.getCurrentSession();
		 session.persist(user);
	 }
	 
	 public void removeUser(int userId)
	 {
		 Session session= factory.getCurrentSession();
		 UserDetails user=session.get(UserDetails.class, userId);
		 session.delete(user);
	 }
}
