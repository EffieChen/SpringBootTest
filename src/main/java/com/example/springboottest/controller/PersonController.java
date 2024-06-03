package com.example.springboottest.controller;

import com.example.springboottest.entity.Person;
import com.example.springboottest.Service.PersonServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServiceImp personService;

    @GetMapping("/findAll")
    public List<Person> findAll() {
        return personService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Person> findById(@PathVariable Long id) {
        return personService.findById(id);
    }

    @GetMapping("/findByName/{name}")
    public List<Person> findByName(@PathVariable String name) {
        return personService.findByName(name);
    }

    @PostMapping("/save")
    public Person save(@RequestBody Person person) {
        return personService.save(person);
    }

    @PutMapping("/update/{id}")
    public Person update(@PathVariable Long id, @RequestBody Person person) {
        return personService.update(id, person);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        personService.deleteById(id);
    }
}
