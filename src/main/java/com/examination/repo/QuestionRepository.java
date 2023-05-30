package com.examination.repo;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examination.entity.exam.Question;
import com.examination.entity.exam.Quiz;

public interface QuestionRepository extends JpaRepository<Question, Long> {

	Set<Question> findByQuiz(Quiz quiz);

}
