package com.examination.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examination.entity.exam.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
