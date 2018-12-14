package com.demo2.service;

import com.demo2.dto.PersonDto;

public interface PersonService {
    PersonDto queryAll(Integer page, Integer rows);
}
