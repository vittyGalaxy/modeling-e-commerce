package com.vittorio.ecommerce;

import java.util.Date;
import java.util.List;

public class User {
    private String          name;
    private String          surname;
    private Date            date;
    private Role            role;
    private List<String>    listPhone;

    public User(String name, String surname, Date date, Role role) {
        setName     (name);
        setSurname  (surname);
        setDate     (date);
        setRole     (role);
    }

    // getter
    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public Date getDate() {
        return this.date;
    }

    public Role getRole() {
        return this.role;
    }

    public List<String> getListPhone() {
        return this.listPhone;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setListPhone(List<String> listPhone) {
        this.listPhone = listPhone;
    }
}
