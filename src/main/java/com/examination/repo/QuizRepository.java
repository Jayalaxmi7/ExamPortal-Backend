package com.examination.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examination.entity.exam.Category;
import com.examination.entity.exam.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

	public List<Quiz> findBycategory(Category category);

	public List<Quiz> findByActive(Boolean b);

	public List<Quiz> findByCategoryAndActive(Category c, Boolean b);
}
