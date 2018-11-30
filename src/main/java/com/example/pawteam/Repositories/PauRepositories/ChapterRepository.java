package com.example.pawteam.Repositories.PauRepositories;

import com.example.pawteam.Entities.PauEntities.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface ChapterRepository extends JpaRepository<Chapter, Integer>, PagingAndSortingRepository<Chapter,Integer> {
}
