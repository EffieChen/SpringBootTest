package com.example.springboottest.Service;

import com.example.springboottest.entity.Person;
import com.example.springboottest.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImp implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public List<Person> findAll() {
        return personMapper.findAll();
    }

    @Override
    public Optional<Person> findById(Long id) {
        return personMapper.findById(id);
    }

    @Override
    public List<Person> findByName(String name) {
        return personMapper.findByName(name);
    }

    @Override
    public Person save(Person person) {
        personMapper.save(person);
        return person;
    }

    @Override
    public Person update(Long id, Person person) {
        Optional<Person> existingPerson = personMapper.findById(id);
        if (existingPerson.isPresent()) {
            person.setId(id);
            personMapper.update(person);
            return person;
        } else {
            return null;
        }
    }

    @Override
    public void deleteById(Long id) {
        personMapper.deleteById(id);
    }
}
