package com.jpa.example.jpademo.dao;

import com.jpa.example.jpademo.entity.PersonDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonDetailsRepository extends JpaRepository<PersonDetails, Integer> {

    List<PersonDetails> findAll();
}
