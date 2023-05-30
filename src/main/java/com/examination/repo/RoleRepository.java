package com.examination.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examination.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
