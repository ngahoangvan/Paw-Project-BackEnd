package com.example.pawteam.Repositories;

import com.example.pawteam.Entities.Footer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FooterRepository extends CrudRepository<Footer, Integer> {
    Footer findAllByText(String q);
}
