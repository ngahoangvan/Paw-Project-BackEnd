package com.example.pawteam.Repositories.PauRepositories;

import com.example.pawteam.Entities.PauEntities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;



public interface CourseRepository extends JpaRepository<Course,Integer>,PagingAndSortingRepository<Course,Integer> {
    @Query(value = "select count(id_course) from course",nativeQuery = true)
    Long countCourse();

    @Query(value = "SELECT image FROM course where id_course = :idCourse", nativeQuery = true)
    String findImageCourse(@Param("idCourse") Integer idCourse);
}
