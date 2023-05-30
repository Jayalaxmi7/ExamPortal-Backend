package com.examination.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examination.entity.User;
import com.examination.entity.UserRole;
import com.examination.repo.RoleRepository;
import com.examination.repo.UserRepository;
import com.examination.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	// Creating User
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {

		User local = userRepository.findByUsername(user.getUsername());
		if (local != null) {
			System.out.println("User is already exist!");
			throw new Exception("User is already present!");
		} else {
			// user create
			for (UserRole ur : userRoles) {
				roleRepository.save(ur.getRole());
			}
			user.getUserRoles().addAll(userRoles);
			local = this.userRepository.save(user);
		}

		return local;
	}

	// Getting user by UserName
	@Override
	public User getUser(String username) {

		return this.userRepository.findByUsername(username);
	}

	// Deleting user by Id
	@Override
	public void deleteUser(Long userId) {
		this.userRepository.deleteById(userId);

	}

	// Update User by Id

}
