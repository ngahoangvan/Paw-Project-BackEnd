package com.example.pawteam.Repositories.PauRepositories;

import com.example.pawteam.Entities.PauEntities.Level;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface LevelRepository extends JpaRepository<Level, Integer>, PagingAndSortingRepository<Level, Integer> {
}
