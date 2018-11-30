package com.example.pawteam.Controllers;

import com.example.pawteam.Entities.Slogan;
import com.example.pawteam.Repositories.SloganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/slogan")
public class SloganController {

    @Autowired
    private SloganRepository sloganRepository;

    @GetMapping
    public Iterable<Slogan> getAllSlogan() {
        return sloganRepository.findAll();
    }

    @PostMapping("/new")
    public void createSlogan(@RequestBody Slogan slogan) {
        sloganRepository.save(slogan);
    }

    @PutMapping("/update")
    public void updateSlogan(@RequestBody Slogan slogan) {
        sloganRepository.save(slogan);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Slogan> deleteSlogan(@PathVariable int id) {
        sloganRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
