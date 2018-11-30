package com.example.pawteam.Controllers.PauController;

import com.example.pawteam.Entities.PauEntities.Lesson;
import com.example.pawteam.Repositories.PauRepositories.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/lesson")
public class LessonController {

    @Autowired
    private LessonRepository lessonRepository;

    @GetMapping
    public Iterable<Lesson> getAllLesson(){
        return lessonRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Lesson> getOneLesson(@PathVariable int id){
        return lessonRepository.findById(id);
    }


    @PostMapping("/new")
    public void createLesson(@RequestBody Lesson lesson){
        lessonRepository.save(lesson);
    }

    @PutMapping("/update")
    public void updateLesson(@RequestBody Lesson lesson){
        lessonRepository.save(lesson);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Lesson> deleteLesson(@PathVariable int id){
        lessonRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
