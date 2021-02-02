package online.shopping.portal.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import online.shopping.portal.entities.*;
import online.shopping.portal.daos.*;
@Service
public class SellerServiceImpl {

	 @Autowired
	 private SellerDaoImpl sellerDao;
	
	/*@Transactional
	public List<SellerDetails> getAllSellers() {
		return sellerDao.getAllSeller();
	}*/
	 
	 @Transactional
		public SellerDetails getSellerDetails(int sellerID)  {
			return sellerDao.getSellerDetails(sellerID);
		}

}
