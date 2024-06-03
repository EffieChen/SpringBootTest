package com.example.springboottest.Service;

import com.example.springboottest.entity.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    List<Person> findAll();
    Optional<Person> findById(Long id);
    List<Person> findByName(String name);
    Person save(Person person);
    Person update(Long id, Person person);
    void deleteById(Long id);
}
