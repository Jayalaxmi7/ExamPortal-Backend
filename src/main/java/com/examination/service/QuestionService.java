package com.examination.service;

import java.util.Set;

import com.examination.entity.exam.Question;
import com.examination.entity.exam.Quiz;

public interface QuestionService {

	public Question addQuestion(Question question);

	public Question updateQuestion(Question question);

	public void deleteQuestion(Long quesId);

	public Set<Question> getQuestions();

	public Question getQuestion(Long questionId);

	public Set<Question> getQuestionsOfQuiz(Quiz quiz);

	public Question get(Long questionId);
}
