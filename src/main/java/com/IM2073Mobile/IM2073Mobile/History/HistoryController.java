package com.IM2073Mobile.IM2073Mobile.History;

import com.IM2073Mobile.IM2073Mobile.Question.Question;
import com.IM2073Mobile.IM2073Mobile.Question.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/historyApi")
@CrossOrigin(origins = "http://localhost:3000")
public class HistoryController {

    @Autowired
    private HistoryService historyService;


    @GetMapping ("/allHistories")
    public List<History> getAllHistorys(){
        return historyService.allHistory();
    }

    @GetMapping("/getHistory/{questionId}")
    public ResponseEntity<History> getSingleHistory(@PathVariable int questionId) {
        History histories = historyService.getHistoryById(questionId);

        return new ResponseEntity<>(histories, HttpStatus.OK);
    }

    @PostMapping("/addHistory")
    public ResponseEntity<History> addAnProduct(@RequestBody History history){
        return new ResponseEntity<>(historyService.addHistory(history), HttpStatus.CREATED);
    }
    @PutMapping("/updateHistory")
    public ResponseEntity<History> updateHistory(@RequestBody Map<String, Integer> requestBody) {
        try {
            int questionId = requestBody.get("questionId");
            int countA = requestBody.get("countA");
            int countB = requestBody.get("countB");
            int countC = requestBody.get("countC");
            int countD = requestBody.get("countD");
            History updatedHistory = historyService.updateHistory(questionId, countA, countB, countC, countD);
            return ResponseEntity.ok(updatedHistory);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }




}
