package com.test.javatest.test;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Emp {
    Integer empId;
    String empName;
    Integer empAge;
    Double salary;
    String dept;
    String status;

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
