package com.mysite.sbbmission.answer;

import com.mysite.sbbmission.answer.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}