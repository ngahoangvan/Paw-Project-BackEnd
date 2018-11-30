package com.example.pawteam.security.repository;

import com.example.pawteam.model.security.UserAuthority;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserAuthorityRepository extends JpaRepository<UserAuthority, Long> {
}
