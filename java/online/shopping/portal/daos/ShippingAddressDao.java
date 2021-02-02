package online.shopping.portal.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;
import online.shopping.portal.entities.*;
import online.shopping.portal.entities.ProductDetails;

@Repository
public class ShippingAddressDao {

	@Autowired  
	   private SessionFactory factory;
		
	
	public void addAddress(ShippingAddressDetails p) {
		Session session = factory.getCurrentSession();
		session.persist(p);
		
	}
	
}
