package online.shopping.portal.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import online.shopping.portal.entities.ProductDetails;
import online.shopping.portal.entities.SellerDetails;

@Repository
public class SellerDaoImpl {
     @Autowired
	 private SessionFactory factory;
	 
	/* public List<SellerDetails> getAllSeller() {
			String hql = "from SellerDetails";
			Session session = factory.getCurrentSession();
			Query q = session.createQuery(hql);
			return q.getResultList();
		}*/
     
     public SellerDetails getSellerDetails(int sellerID) {
 		Session session = factory.getCurrentSession();
 		SellerDetails b = session.get(SellerDetails.class, sellerID);
 		return b;
 	}
		

}
