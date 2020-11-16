package com.training.demorestservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.demorestservice.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByFirstName(String firstName);
}
