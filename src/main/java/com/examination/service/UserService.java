package com.examination.service;

import java.util.Set;

import com.examination.entity.User;
import com.examination.entity.UserRole;

public interface UserService {

	// Creating user(User containing roles)
	public User createUser(User user, Set<UserRole> userRoles) throws Exception;

	// Get User by UserName
	public User getUser(String username);

	// Delete User by Id
	public void deleteUser(Long userId);

	// Update User by Id

}
