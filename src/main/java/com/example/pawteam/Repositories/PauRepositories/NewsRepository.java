package com.example.pawteam.Repositories.PauRepositories;

import com.example.pawteam.Entities.PauEntities.News;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface NewsRepository extends CrudRepository<News, Integer>, PagingAndSortingRepository<News, Integer> {

    @Query(value = "select count(id_news) from news",nativeQuery = true)
    Long countNews();
}
