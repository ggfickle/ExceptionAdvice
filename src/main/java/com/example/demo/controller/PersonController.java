package com.example.demo.controller;

import com.example.demo.pojo.Person;
import com.example.demo.service.PersonService;
import com.example.demo.util.ResultInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller
 */
@RestController
@RequestMapping("/person")
@Slf4j
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/getPerson")
    public ResultInfo<Object> getPerson(@Validated @RequestBody Person person) {
        return new ResultInfo<>();
    }
}
