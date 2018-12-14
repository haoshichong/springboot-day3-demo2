package com.demo2.dto;

import com.demo2.entity.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto implements Serializable {
    private Integer total;
    private List<Person> rows;
}
