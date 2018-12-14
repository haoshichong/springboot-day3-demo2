package com.demo2;

import com.demo2.dto.PersonDto;
import com.demo2.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo2ApplicationTest {
    @Resource
    private PersonService service;
    @Test
    public void queryAllTest(){
        PersonDto personDto = service.queryAll(1, 5);
        System.out.println(personDto);
    }
}
