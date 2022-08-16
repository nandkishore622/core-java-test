package com.test.javatest.test;

import java.util.*;
import java.util.stream.Collectors;

public class JavaStreamAll {
    public static void main(String[] args) {

        List<Employee> listEmp = getListOfEmployee();

        /*System.out.println("\n\nhow many male and female emp in a company");
        listEmp.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())).forEach((k,v)-> System.out.println(k+"  "+v));
        Map<String, List<Employee>> map = listEmp.stream().collect(Collectors.groupingBy(e->e.getGender(), Collectors.toList()));
        map.forEach((k,v)-> System.out.println(k+"  "+v));*/

        /*System.out.println("\n\nprint the name of all departments in the company");
        listEmp.stream().map(e->e.department).distinct().forEach(System.out::println);*/

        /*System.out.println("\n\nprint the avg age of male and female emp");
        listEmp.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge))).forEach((k,v)-> System.out.println(k+"  "+v));*/

        /*System.out.println("\n\nprint the highest salry paid emp");
        Optional<Employee> empOpt = listEmp.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(empOpt.get().getName());
        System.out.println(listEmp.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get().name);*/

        /*System.out.println("\n\nGet the details of all employee who have joined after 2015");
        listEmp.stream().filter(e->e.getYearOfJoining()>2015).forEach(e-> System.out.println(e.getName()));*/

        /*System.out.println("\n\nGet the details of youngest employee in the company");
        listEmp.stream().sorted(Comparator.comparing(Employee::getAge)).limit(1).map(Employee::getName).forEach(System.out::println);
        System.out.println(listEmp.stream().sorted(Comparator.comparing(Employee::getAge)).findFirst().get().name);*/

        /*System.out.println("\n\nGet the details of most working experience employee in the company");
        listEmp.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).limit(1).map(Employee::getName).forEach(System.out::println);*/

        /*System.out.println("\n\nGet the name of all employee in each department");
//        listEmp.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toList())).forEach((k,v)-> System.out.println(k+"  "+v));
        listEmp.stream().collect(Collectors.groupingBy(Employee::getDepartment)).forEach((k,v)-> System.out.println(k+"  "+v));*/

        /*System.out.println("\n\nGet the avg and total salary of all employee");
        DoubleSummaryStatistics empStat = listEmp.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Total Salary : "+ empStat.getSum());
        System.out.println("Average Salary : "+ empStat.getAverage());*/

        System.out.println("\n\nwho is the oldest employee an the company and what is his/her age and department name");
//        Optional<Employee> empOpt = listEmp.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).findFirst();
        Optional<Employee> empOpt = listEmp.stream().max(Comparator.comparing(Employee::getAge));
        System.out.println("Oldest Emp : "+ empOpt.get().name +", age : "+ empOpt.get().age + ", dept : "+ empOpt.get().department);

    }

    private static List<Employee> getListOfEmployee() {
        List<Employee> listEmp = new ArrayList<>();
        listEmp.add(new Employee(1,"nand",32, "male", "sg",2017, 10000d));
        listEmp.add(new Employee(2,"narm",31, "male", "cg",2018, 20000d));
        listEmp.add(new Employee(3,"alka",34, "female", "sap",2010, 6000d));
        listEmp.add(new Employee(4,"rahul",25, "male", "sg",2009, 100000d));
        listEmp.add(new Employee(5,"rita",38, "female", "sap",2013, 50000d));
        listEmp.add(new Employee(6,"raj",29, "male", "sap",2016, 60000d));
        listEmp.add(new Employee(7,"adya",25, "female", "cg",2020, 80000d));

        return listEmp;
    }
}

