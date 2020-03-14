package com.springboot.pjct.User.dao;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.springboot.pjct.User.pojos.User;



public interface UserRepository  extends CrudRepository<User,Integer> {
	
User findByUsernameAndPassword(String username,String password);

User findByUsernameAndPasswordAndConfirmed(String username, String password, String string);

Optional<User> findByEmail(String emailId);

}

