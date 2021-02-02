package online.shopping.portal.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import online.shopping.portal.entities.CartDetails;
import online.shopping.portal.entities.ProductDetails;

@Repository
public class CartDao {

	@Autowired  
	private SessionFactory factory;
	
	public CartDetails getCartDetails(int cartId) {
		Session session = factory.getCurrentSession();
		return session.get(CartDetails.class, cartId);
	}
	
	public CartDetails addProductInCart(CartDetails cartdetail) {
		Session session = factory.getCurrentSession();
		session.persist(cartdetail);
		return cartdetail;
	}
	
	public List<CartDetails> getCartDetailsByCustomerIdNEW(int customerId) {
		String hql = "from CartDetails where customerID=:c_id and cartStatus=:status";
		Session session = factory.getCurrentSession();
		Query q = session.createQuery(hql);
		q.setParameter("c_id", customerId);
		q.setParameter("status", "NEW");
		return q.getResultList();
	}
	
	public List<CartDetails> getCartDetailsByCustomerIdPAID(int customerId) {
		String hql = "from CartDetails where customerID=:c_id and cartStatus=:status";
		Session session = factory.getCurrentSession();
		Query q = session.createQuery(hql);
		q.setParameter("c_id", customerId);
		q.setParameter("status", "PAID");
		return q.getResultList();
	}
	
	public CartDetails changeCartStatusToPAID(int cartId) {
		Session session = factory.getCurrentSession();
		CartDetails cart = session.get(CartDetails.class, cartId);
		cart.setCartStatus("PAID");
		session.persist(cart);
		return cart;
	}
	
	
}
