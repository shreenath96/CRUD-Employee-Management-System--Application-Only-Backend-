package net.userdatabase.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import net.userdatabase.springboot.model.User;
import net.userdatabase.springboot.service.UserService;


@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	// display list of Users
	@GetMapping("/listAllUsers")
	public List<User> getAllUser() {
		return userService.getAllUsers();	
	}
	
	
	@PostMapping("/users")
	public String saveUser(@ModelAttribute("User") User User) {
		// save User to database
		userService.saveUser(User);
		return "Successfully saved";
	}
	
	
	@DeleteMapping("/users/{id}")
	public String deleteUser(@PathVariable (value = "id") int id) {
		
		// call delete User method 
		this.userService.deleteUserById(id);
		return "Successfully deleted";
	}
	
	
	@GetMapping("/users/{userId}")
	public User findUserById(@PathVariable (value = "userId") int userId) {
		
		User user = userService.getUserById(userId);		
		return user;
	}
	
}