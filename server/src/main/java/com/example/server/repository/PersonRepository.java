package com.example.server.repository;

import com.example.server.model.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JPARepository<Personal,Long> {
    
    
    Optional<Person> findByPersonId(@P){

    }
}
