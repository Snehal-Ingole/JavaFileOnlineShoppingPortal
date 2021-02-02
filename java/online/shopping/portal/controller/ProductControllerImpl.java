package online.shopping.portal.controller;

import java.util.List;
import java.util.TreeMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import online.shopping.portal.services.ProductServiceImpl;
import online.shopping.portal.entities.ProductDetails;

@RestController
public class ProductControllerImpl {
    @Autowired
	 private ProductServiceImpl productService;

    @CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/products/{productCategory}")
	public List<ProductDetails> getProductbyName(@PathVariable("productCategory") String product) {
		List<ProductDetails> list = productService.getProductbyName(product);
		return list;	
	}
    
    @CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/products/id/{productId}")
	public ProductDetails getProductbyId(@PathVariable("productId") int productId) {
    	return 	productService.getProductById(productId);
	}
    
    
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/products")
	public List<ProductDetails> getAllProducts() {
		List<ProductDetails> list = productService.getAllProducts();
		return list;
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/products/remove/{pid}")
	public void removeProduct(@PathVariable int pid) {
		productService.deleteProduct(pid);
	}
	
	//Add Product
		@CrossOrigin(origins="http://localhost:4200")
		@PostMapping("/products")
		public ProductDetails addProduct(@RequestBody ProductDetails p) {
			try {
				productService.addProduct(p);
				return p;
			}catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		
		//	Edit product
		@PutMapping("/products/{id}")
		public boolean updateProduct(@PathVariable("id") int id, @RequestBody ProductDetails p) {
			try {
				productService.update(p);
				return true;
			}catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
		
	
	
	/*@GetMapping("/cart/{cartID}")
	public String addToCart(@PathVariable("cartID") int id, HttpSession session){
		if(session.getAttribute("user")!=null)
		{
			int count = 1;
			TreeMap<Integer, Integer> cart = (TreeMap<Integer, Integer>) session.getAttribute("cart");
			if (cart.containsKey(id)) {
				count = cart.get(id);
				count++;
				cart.remove(id);
			}

			cart.put(id, count);
			return "Success";
		}
		else
		{
			return "Failed";
		}
	}
*/	
}
