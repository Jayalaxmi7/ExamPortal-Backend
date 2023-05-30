package com.examination.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examination.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUsername(String username);

}
