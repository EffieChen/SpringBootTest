package com.example.springboottest.mapper;

import com.example.springboottest.entity.Person;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PersonMapper {

    @Select("SELECT * FROM person")
    List<Person> findAll();

    @Select("SELECT * FROM person WHERE id = #{id}")
    Optional<Person> findById(Long id);

    @Select("SELECT * FROM person WHERE name = #{name}")
    List<Person> findByName(String name);

    @Insert("INSERT INTO person(name, sex, age) VALUES(#{name}, #{sex}, #{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void save(Person person);

    @Update("UPDATE person SET name = #{name}, sex = #{sex}, age = #{age} WHERE id = #{id}")
    void update(Person person);

    @Delete("DELETE FROM person WHERE id = #{id}")
    void deleteById(Long id);
}
