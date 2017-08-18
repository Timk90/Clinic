package main.java.ru.timur.clinic.bean;

import java.util.Date;

/**
 * Created by Tester on 16/08/2017.
 */
public class Client {

    long id;
    String firstname;
    String surename;
    String patronim;
    Date birthDate;
    String phoneNumber;
    short enabled;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getPatronim() {
        return patronim;
    }

    public void setPatronim(String patronim) {
        this.patronim = patronim;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public short getEnabled() {
        return enabled;
    }

    public void setEnabled(short enabled) {
        this.enabled = enabled;
    }
}
