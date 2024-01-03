package com.sthev.beanvalidation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sthev.beanvalidation.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
