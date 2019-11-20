package com.udemyjavacompleto2019.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemyjavacompleto2019.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
