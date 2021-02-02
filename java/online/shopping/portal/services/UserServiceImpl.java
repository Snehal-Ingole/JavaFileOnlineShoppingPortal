package online.shopping.portal.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import online.shopping.portal.daos.UserDaoImpl;
import online.shopping.portal.entities.ProductDetails;
import online.shopping.portal.entities.UserDetails;
import online.shopping.portal.moduls.Login;
@Service
public class UserServiceImpl {

	@Autowired
	private UserDaoImpl userDao;
	
	@Transactional
	public UserDetails validate(Login cred) {
		UserDetails user = userDao.getUser(cred.getEmail());
		if(user != null && user.getPassword().equals(cred.getPassword()) )
			return user;
		return null;
	}
	
	@Transactional
	public void addUser(UserDetails user)
	{
		userDao.addUser(user);
	}
	
	@Transactional
	public void removeUser(int userId)
	{
		userDao.removeUser(userId);
	}
	
	@Transactional
	public List<UserDetails> getAllUsers() {
		return userDao.getAllUsers();
		}
}
