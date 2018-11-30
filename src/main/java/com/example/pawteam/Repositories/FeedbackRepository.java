package com.example.pawteam.Repositories;

import com.example.pawteam.Entities.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FeedbackRepository extends JpaRepository<Feedback, Integer>{
    
}
