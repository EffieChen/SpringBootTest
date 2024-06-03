package com.example.controller;

import com.example.entity.Person;
import com.example.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    private PersonRepository personRepository;
    @GetMapping("/findAll")
    public List<Person> findAll(){
        return personRepository.findAll();
    }
}
