package com.example.demo.service.impl;

import com.example.demo.pojo.Person;
import com.example.demo.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Override
    public Person getPerson() {
        Person person = new Person();
        person.setId(1L);
        person.setName("zhangsan");
        person.setSex(1);
        return person;
    }
}
