package com.rnsolucoes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rnsolucoes.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
