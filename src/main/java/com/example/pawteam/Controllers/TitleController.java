package com.example.pawteam.Controllers;

import com.example.pawteam.Entities.Title;
import com.example.pawteam.Repositories.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/title")
public class TitleController {
    @Autowired
    private TitleRepository titleRepository;

    @GetMapping()
    public Iterable<Title> getAllTitle(){
        return titleRepository.findAll();
    }


    @PostMapping("/new")
    public void createTitle(@RequestBody Title title){
        titleRepository.save(title);
    }

    @PutMapping("/update")
    public void updateTitle(@RequestBody Title title){
        titleRepository.save(title);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Title> deleteTitle(@PathVariable int id){
        titleRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
