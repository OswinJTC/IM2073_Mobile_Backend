package com.IM2073Mobile.IM2073Mobile.Question;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {


    @Autowired
    private QuestionRepo questionRepo;

    public List<Question> allQuestion(){
        return questionRepo.findAll();
    }

    public List<Question> getQuestionsByLevel(String level) {
        return questionRepo.findByLevel(level);
    }







}
