package com.test.javatest.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Employee {
    Integer id;
    String name;
    Integer age;
    String gender;
    String department;
    Integer yearOfJoining;
    Double salary;

}
