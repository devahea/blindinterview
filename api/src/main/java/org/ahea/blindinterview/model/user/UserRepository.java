package org.ahea.blindinterview.model.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String>{

	public User findByEmailAndPassword(String email, String password);
	
} 
