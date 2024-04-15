package com.IM2073Mobile.IM2073Mobile.History;

import com.IM2073Mobile.IM2073Mobile.Question.Question;
import com.IM2073Mobile.IM2073Mobile.Question.QuestionRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistoryService {


    @Autowired
    private HistoryRepo historyRepo;

    public List<History> allHistory(){
        return historyRepo.findAll();
    }

    public History getHistoryById(int questionId) {
        Optional<History> optionalHistory = historyRepo.findByQuestionId(questionId);
        return optionalHistory.orElseThrow(() -> new RuntimeException("History not found for question ID: " + questionId));
    }
    public History addHistory(History history){
        return historyRepo.save(history);
    }



    @Transactional
    public History updateHistory(int questionId, int countA, int countB, int countC, int countD) {
        // Find the instance with the given questionId
        Optional<History> historyOptional = historyRepo.findByQuestionId(questionId);
        if (!historyOptional.isPresent()) {
            throw new IllegalArgumentException("No history record found with question ID: " + questionId);
        }

        // Get the existing History object
        History existingHistory = historyOptional.get();

        // Update the countA field
        existingHistory.setCountA(countA);
        existingHistory.setCountB(countB);
        existingHistory.setCountC(countC);
        existingHistory.setCountD(countD);

        // Save the updated entity
        return historyRepo.save(existingHistory);
    }



}
