package online.shopping.portal.daos;
import online.shopping.portal.entities.ProductDetails;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl {
   
	@Autowired  
   private SessionFactory factory;
	
	
	public List<ProductDetails> getProductbyName(String product) {
		String hql = "from ProductDetails where productCategory=:p_product";
		Session session = factory.getCurrentSession();
		Query q = session.createQuery(hql);
		q.setParameter("p_product", product);
		return q.getResultList();
	}
	
	public ProductDetails getProductbyId(int productId) {
		Session session = factory.getCurrentSession();
		return session.get(ProductDetails.class, productId);
	}
	
	
	public List<ProductDetails> getAllProducts() {
		String hql = "from ProductDetails";
		Session session = factory.getCurrentSession();
		Query q = session.createQuery(hql);
		return q.getResultList();
	}
	
	public ProductDetails addProduct(ProductDetails p) {
		Session session = factory.getCurrentSession();
		session.persist(p);
		return p;
	}
	
	public void update(ProductDetails p) {
		Session session = factory.getCurrentSession();
		session.update(p);		
	}
	
	public void removeProduct(int pid) {
		Session session = factory.getCurrentSession();
		ProductDetails p = session.get(ProductDetails.class, pid);
		session.delete(p);
	}
	
}	
