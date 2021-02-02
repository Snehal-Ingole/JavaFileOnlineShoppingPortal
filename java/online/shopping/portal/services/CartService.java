package online.shopping.portal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import online.shopping.portal.daos.CartDao;
import online.shopping.portal.entities.CartDetails;
import online.shopping.portal.entities.ProductDetails;

@Service
public class CartService {

	@Autowired
	private CartDao dao;
	
	@Transactional
	public List<CartDetails> getCartItemsByCustomerIdNEW(int customerId) {
		return dao.getCartDetailsByCustomerIdNEW(customerId);
	}
	
	@Transactional
	public List<CartDetails> getCartItemsByCustomerIdPAID(int customerId) {
		return dao.getCartDetailsByCustomerIdPAID(customerId);
	}
	
	
	@Transactional
	public CartDetails addProductToCart(CartDetails cartItem) {
		return dao.addProductInCart(cartItem);
	}
	
	@Transactional
	public CartDetails makePayment(int cartId) {
		return dao.changeCartStatusToPAID(cartId);
	}
	
	@Transactional
	public CartDetails getCartItem(int cartId) {
		return dao.getCartDetails(cartId);
	}
}
