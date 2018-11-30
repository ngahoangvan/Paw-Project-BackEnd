package com.example.pawteam.Repositories;

import com.example.pawteam.Entities.Slideshow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface SlideshowRepository extends JpaRepository<Slideshow, Integer> {

    @Query(value = "SELECT image FROM slideshow where id_slideshow = :idSlideshow", nativeQuery = true)
    String findImageSlideShow(@Param("idSlideshow") Integer idTrainer);
}
