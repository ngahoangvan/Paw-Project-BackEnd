package com.example.pawteam.Controllers;

import com.example.pawteam.Entities.Feedback;
import com.example.pawteam.Repositories.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @GetMapping()
    public Iterable<Feedback> getAllFeedback(){
        return feedbackRepository.findAll();
    }

    @PostMapping("/new")
    public void createFeedback(@RequestBody Feedback feedback){
        feedbackRepository.save(feedback);
    }

    @PutMapping("/update")
    public void updateFeedback(@RequestBody Feedback feedback){
        feedbackRepository.save(feedback);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Feedback> deleteFeedback(@PathVariable int id){
        feedbackRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
