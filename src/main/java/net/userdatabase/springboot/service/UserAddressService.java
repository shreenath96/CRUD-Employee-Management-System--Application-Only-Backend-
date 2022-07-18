package net.userdatabase.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;


import net.userdatabase.springboot.model.UserAddress;

public interface UserAddressService {

		List<UserAddress> getUserAddressById(long userId);
		void saveUserAddress(UserAddress UserAddress);
		Page<UserAddress> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
	}
