package com.example.pawteam.Repositories.PauRepositories;

import com.example.pawteam.Entities.PauEntities.GroupCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface GroupCategoryRepository extends CrudRepository<GroupCategory, Integer>,PagingAndSortingRepository<GroupCategory,Integer> {
    List<GroupCategory> findAllByCategory(String q);

}
