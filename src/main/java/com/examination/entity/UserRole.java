package com.examination.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class UserRole {

	// User role ID(Primary key)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userRoleId;

	// RoleRoleId (Foreign key)
	@ManyToOne(fetch = FetchType.EAGER)
	private User user;

	// Role (User Id-table)(Foreign key)
	@ManyToOne()
	private Role role;

	// Default Constructor
	public UserRole() {

	}

	// Getters and Setters
	public Long getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Long userRoleId) {
		this.userRoleId = userRoleId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
