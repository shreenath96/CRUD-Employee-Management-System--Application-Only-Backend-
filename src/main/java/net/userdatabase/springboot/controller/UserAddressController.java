package net.userdatabase.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

import net.userdatabase.springboot.model.UserAddress;
import net.userdatabase.springboot.service.UserAddressService;

@RestController
public class UserAddressController {
	
	@Autowired
	private UserAddressService userAddressService;
	
	// display list of UsersAddresses by ID
	@GetMapping("/listAllUsersAddress/{userId}")
	public List<UserAddress> getUserAddressById(@PathVariable (value = "userId") long userId) {
		System.out.printf("Successfuly retrieved employee");
		return userAddressService.getUserAddressById(userId);

	}
	

	
	@PostMapping("/usersAddress")
	public String saveUserAddress(@ModelAttribute("UserAddress") UserAddress UserAddress) {
		// save UserAddr to database
		userAddressService.saveUserAddress(UserAddress);
		return "Successfully saved";
	}
	

	
}
