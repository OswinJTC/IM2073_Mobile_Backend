package com.IM2073Mobile.IM2073Mobile.History;

import com.IM2073Mobile.IM2073Mobile.Question.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface HistoryRepo extends JpaRepository<History,Integer> {
    Optional<History> findById(Integer id);
    Optional<History> findByQuestionId(Integer questionId);
}
