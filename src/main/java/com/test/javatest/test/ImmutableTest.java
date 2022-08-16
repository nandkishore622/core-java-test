package com.test.javatest.test;

import java.util.Date;

final class Student {
    private final String name;
    private final Date date;
    private final Address address;

    public Student(String name, Date date, Address address) {
        this.name = name;
        this.date = date;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return (Date) date.clone();
    }

    public Address getAddress() throws CloneNotSupportedException {
//        return (Address) address.clone();
//        return address;
        return new Address(address.getAddress(), address.getCity(), address.getState());
    }
}

class Address implements Cloneable {
    private String address;
    private String city;
    private String state;

    public Address(String address, String city, String state) {
        this.address = address;
        this.city = city;
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ImmutableTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student stu = new Student("nand", new Date(), new Address("krishnapuri", "patna", "bihar"));
        Address add = stu.getAddress();
        Date dt = stu.getDate();
        System.out.println(add);
        System.out.println(dt);

        add.setAddress("boringroad");
        add.setCity("ranchi");
        add.setState("jharkand");

        dt.setTime(12345678);

        System.out.println(stu.getAddress());
        System.out.println(stu.getDate());

    }
}
