package online.shopping.portal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import online.shopping.portal.daos.ShippingAddressDao;
import online.shopping.portal.entities.ProductDetails;
import online.shopping.portal.entities.ShippingAddressDetails;
@Service
public class ShippingAddressService {

	@Autowired
	 private ShippingAddressDao addressDao;
	
	@Transactional
	public void addAddress(ShippingAddressDetails p) {
		addressDao.addAddress(p);
		
	}
}
