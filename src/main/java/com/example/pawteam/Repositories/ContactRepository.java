package com.example.pawteam.Repositories;

import com.example.pawteam.Entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContactRepository extends JpaRepository<Contact, Integer>{
}
