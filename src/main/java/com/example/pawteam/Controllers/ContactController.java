package com.example.pawteam.Controllers;

import com.example.pawteam.Entities.Contact;
import com.example.pawteam.Repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/contact")
public class ContactController {
    @Autowired
    private ContactRepository contactRepository;

    @GetMapping
    public Iterable<Contact> getAllContact(){
        return contactRepository.findAll();
    }

    @PostMapping("/new")
    public void createContact(@RequestBody Contact contact){
        contactRepository.save(contact);
    }

    @PutMapping("/update")
    public void updateContact(@RequestBody Contact contact){
        contactRepository.save(contact);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Contact> deleteContact(@PathVariable int id){
        contactRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
