package com.example.demo;

import com.example.demo.entity.Person;
import com.example.demo.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class MybatisPlusExample {

    @Autowired
    public PersonMapper personMapper;

    public static void main(String[] args) {
        MybatisPlusExample example = new MybatisPlusExample();
        List<Person> personList = example.personMapper.selectList(null);
        System.out.println("personList: " + personList);
    }
}
