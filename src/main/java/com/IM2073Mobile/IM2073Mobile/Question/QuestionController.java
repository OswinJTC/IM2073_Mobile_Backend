package com.IM2073Mobile.IM2073Mobile.Question;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/questionApi")
@CrossOrigin(origins = "http://localhost:3000")
public class QuestionController {

    @Autowired
    private QuestionService questionService;


    @GetMapping ("/allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.allQuestion();
    }

    @GetMapping("/questionsByLevel/{level}")
    public ResponseEntity<List<Question>> getQuestionsByLevel(@PathVariable String level) {
        List<Question> questions = questionService.getQuestionsByLevel(level);
        if (questions.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }






}
