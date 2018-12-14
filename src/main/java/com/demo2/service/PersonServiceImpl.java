package com.demo2.service;

import com.demo2.dto.PersonDto;
import com.demo2.entity.Person;
import com.demo2.entity.PersonExample;
import com.demo2.mapper.PersonMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Resource
    private PersonMapper mapper;
    @Override
    public PersonDto queryAll(Integer page, Integer rows) {
        int begin = (page-1)*rows-1;
        int end = page*rows;
        PersonExample example = new PersonExample();
        example.createCriteria().andIdBetween(begin,end);
        List<Person> list = mapper.selectByExample(example);
        int count = mapper.selectCount(new Person());
        return new PersonDto(count,list);
    }
}
