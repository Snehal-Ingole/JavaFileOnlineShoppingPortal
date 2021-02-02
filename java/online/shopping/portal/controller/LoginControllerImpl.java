package online.shopping.portal.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import online.shopping.portal.entities.ProductDetails;
import online.shopping.portal.entities.UserDetails;
import online.shopping.portal.moduls.Login;
import online.shopping.portal.services.UserServiceImpl;
@RestController
public class LoginControllerImpl {
	@Autowired
	private UserServiceImpl userService;
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/Login")
	public UserDetails doLoginMethod(@RequestBody Login cred) {
		System.out.println("IN CONTROLLLER: "+cred.getEmail());
		UserDetails user = userService.validate(cred);
		
		if(user != null) 
		{
		    return user;
		}
		else
		{
			return null;
		}
	}
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/Register")
	 public UserDetails addUser(@RequestBody UserDetails user)
	 {
		try {
			userService.addUser(user);
			    return user;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		 
	 }

	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/users")
	public List<UserDetails> getAllUsers() {
		List<UserDetails> list = userService.getAllUsers();
		return list;
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/users/remove/{userId}")
	public void removeUser(@PathVariable int userId) {
		userService.removeUser(userId);
	}
}
