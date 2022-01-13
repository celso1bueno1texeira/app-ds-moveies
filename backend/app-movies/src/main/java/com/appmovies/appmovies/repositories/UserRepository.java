package com.appmovies.appmovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appmovies.appmovies.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail (String email);

}
