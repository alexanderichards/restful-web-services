package com.cajacuadrada.rest.webservices.restfulwebservices.Models;

import java.time.LocalDate;

public class User {

    private int Id;
    private String name;
    private int age;
    private LocalDate birthDate;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(int id, String name, int age, LocalDate birthDate) {
        Id = id;
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


}
