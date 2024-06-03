package com.example.springboottest.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author wang
 */

//与数据库表绑定
@Entity
//自动生成setter 和getter
@Data
public class Person {
    @Id
    private Long id;
    private String name;
    private String sex;
    private Integer age;
}
