package com.example.springEducation;

import java.util.Date;

public class Person {
    private String firstName;
    private String secondName;
    private Date birth;

    public Person(String firstName, String secondName, Date birth) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birth = birth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", birth=" + birth +
                '}';
    }
}
