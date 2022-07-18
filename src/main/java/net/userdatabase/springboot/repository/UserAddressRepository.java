package net.userdatabase.springboot.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.*;
import net.userdatabase.springboot.model.UserAddress;


@Repository
public interface UserAddressRepository extends JpaRepository<UserAddress, Long>{

	List<UserAddress> findByUser_Id( long id);

}