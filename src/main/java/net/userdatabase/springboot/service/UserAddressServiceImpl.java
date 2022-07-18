package net.userdatabase.springboot.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import net.userdatabase.springboot.model.UserAddress;
import net.userdatabase.springboot.repository.UserAddressRepository;

@Service
public class UserAddressServiceImpl implements UserAddressService {
	
	@Autowired
	private UserAddressRepository userAddressRepository;
	

	@Override
	public void saveUserAddress(UserAddress UserAddress) {
		this.userAddressRepository.save(UserAddress);
	}

	public List<UserAddress> getUserAddressById(long userId) {
		return userAddressRepository.findByUser_Id(userId);
	}

	
	@Override
	public Page<UserAddress> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
			Sort.by(sortField).descending();
		
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		return this.userAddressRepository.findAll(pageable);
	}

}
