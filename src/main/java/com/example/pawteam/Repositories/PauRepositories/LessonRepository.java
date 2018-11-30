package com.example.pawteam.Repositories.PauRepositories;

import com.example.pawteam.Entities.PauEntities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface LessonRepository extends JpaRepository<Lesson, Integer>, PagingAndSortingRepository<Lesson, Integer> {
}
