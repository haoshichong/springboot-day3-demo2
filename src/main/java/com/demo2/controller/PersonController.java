package com.demo2.controller;

import com.alibaba.fastjson.annotation.JSONField;
import com.demo2.dto.PersonDto;
import com.demo2.entity.Person;
import com.demo2.service.PersonService;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping("person")
public class PersonController {
    @Resource
    private PersonService service;
    @RequestMapping("all")
    public PersonDto queryAll(int page,int rows){
        System.out.println("all");
        return service.queryAll(page,rows);
    }
    @RequestMapping("ins")
    public void ins(Person person){
        System.out.println(person);
    }
    @RequestMapping("inss")
    public void inss(@DateTimeFormat(pattern = "yyyy-MM-dd") Date birthday){
        System.out.println(birthday);
    }
}
