package online.shopping.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import online.shopping.portal.entities.ProductDetails;
import online.shopping.portal.entities.ShippingAddressDetails;
import online.shopping.portal.services.ShippingAddressService;
@RestController
public class ShippingAddressController {

	@Autowired
	 private ShippingAddressService addressService;
	      
	
	//Add Product
			@CrossOrigin(origins="http://localhost:4200")
			@PostMapping("/products/address")
			public ShippingAddressDetails addAdress(@RequestBody ShippingAddressDetails p) {
				try {
					addressService.addAddress(p);
					return p;
				}catch (Exception e) {
					e.printStackTrace();
				}
				return null;
			}
			
}
