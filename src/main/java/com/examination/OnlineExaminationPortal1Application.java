package com.examination;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.examination.entity.Role;
import com.examination.entity.User;
import com.examination.entity.UserRole;
import com.examination.service.UserService;

@SpringBootApplication
public class OnlineExaminationPortal1Application implements CommandLineRunner {

	@Autowired
	private UserService userService;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(OnlineExaminationPortal1Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Running");

		// Setting Admin
//		User user = new User();
//
//		user.setFirstname("Jayalaxmi");
//		user.setLastname("Routray");
//		user.setUsername("Jayalaxm77");
//		user.setPassword(this.bCryptPasswordEncoder.encode("Sipun@123"));
//		user.setEmail("jayalaxmioutray@gmail.com");
//		user.setPhone("917008023228");
//		user.setProfile("default.png");
//
//		Role role1 = new Role();
//		role1.setRoleId(77L);
//		role1.setRoleName("ADMIN");
//
//		Set<UserRole> userRoleSet = new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//
//		User user1 = this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUsername());

	}

}
