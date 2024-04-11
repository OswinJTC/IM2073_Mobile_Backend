package com.IM2073Mobile.IM2073Mobile.Question;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface QuestionRepo extends JpaRepository<Question, Integer> {

    Optional<Question> findById(Integer id);
    List<Question> findByLevel(String level);



}
