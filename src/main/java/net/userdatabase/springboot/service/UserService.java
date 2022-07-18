package net.userdatabase.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import net.userdatabase.springboot.model.User;

public interface UserService {
	List<User> getAllUsers();
	void saveUser(User User);
	User getUserById(long id);
	void deleteUserById(long id);
	Page<User> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}