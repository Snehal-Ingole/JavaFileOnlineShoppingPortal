package online.shopping.portal.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import online.shopping.portal.daos.ProductDaoImpl;
import online.shopping.portal.entities.ProductDetails;
@Service
public class ProductServiceImpl {
   @Autowired
	private ProductDaoImpl productDao;
	
	@Transactional
	public List<ProductDetails> getProductbyName(String product) {
		return productDao.getProductbyName(product);
	}
	
	@Transactional
	public ProductDetails getProductById(int productId) {
		return productDao.getProductbyId(productId);
	}

	@Transactional
	public List<ProductDetails> getAllProducts() {
		return productDao.getAllProducts();
	}
	
	@Transactional
	public ProductDetails addProduct(ProductDetails p) {
		productDao.addProduct(p);
		return p;
	}

	@Transactional
	public void update(ProductDetails p) {
		productDao.update(p);
	}
	
	@Transactional
	public void deleteProduct(int pid) {
		productDao.removeProduct(pid);
	}
}
