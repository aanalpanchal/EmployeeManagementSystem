package com.humber.j2ee.Week3Demo.entity;

import lombok.Data;

@Data
public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private String emailId;

    public Employee(int id, String firstname, String lastname, String emailId) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailId = emailId;
    }

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
