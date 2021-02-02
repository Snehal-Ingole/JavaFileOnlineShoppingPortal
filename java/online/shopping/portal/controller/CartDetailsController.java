package online.shopping.portal.controller;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import online.shopping.portal.entities.CartDetails;
import online.shopping.portal.entities.ProductDetails;
import online.shopping.portal.services.CartService;
import online.shopping.portal.services.ProductServiceImpl;

@RestController
public class CartDetailsController {
	  
	@Autowired
	 private CartService service;

	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/cart")
	public CartDetails addCartItem(@RequestBody CartDetails cartItem) {
		return service.addProductToCart(cartItem);
	}
	
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/cart/{customerId}")
	public List<CartDetails> getCartDetailsByNew(@PathVariable int customerId) {
		return service.getCartItemsByCustomerIdNEW(customerId);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("cart/orders/{customerId}")
	public List<CartDetails> getCartDetailsByPaid(@PathVariable int customerId) {
		return service.getCartItemsByCustomerIdPAID(customerId);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/cart/cart/{cartId}")
	public CartDetails getCartItem(@PathVariable int cartId) {
		return service.getCartItem(cartId);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/cart/pay/{cartId}")
	public CartDetails makePayment(@PathVariable int cartId) {
		return service.makePayment(cartId);
	}

}
