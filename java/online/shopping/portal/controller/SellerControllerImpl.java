package online.shopping.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import online.shopping.portal.entities.SellerDetails;
import online.shopping.portal.services.SellerServiceImpl;
import online.shopping.portal.daos.*;
@RestController
public class SellerControllerImpl {
    @Autowired
	 private SellerServiceImpl sellerService;
    
	/*@GetMapping("/seller")
	public List<SellerDetails> getAllSellers() {
		List<SellerDetails> list = sellerService.getAllSellers();
		return list;
	}*/
    
    @CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/seller/{id}")
	public SellerDetails getBook(@PathVariable("id") int sellerID) {
		SellerDetails b = sellerService.getSellerDetails(sellerID);
		return b;
	}
}
