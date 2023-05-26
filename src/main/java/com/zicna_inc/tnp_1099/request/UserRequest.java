package com.zicna_inc.tnp_1099.request;

import java.util.Date;

import com.zicna_inc.tnp_1099.entity.Gender;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
// TODO: add custom validation for date_of_birth and gender
public class UserRequest {
    @Email(message = "must be valid email")
    private String email;
    @Past(message = "date of birth must be in past")
    private Date date_of_birth;
    private Gender gender;

    public UserRequest() {
    }

    public UserRequest(String email, Date date_of_birth, Gender gender) {
        this.email = email;
        this.date_of_birth = date_of_birth;
        this.gender = gender;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate_of_birth() {
        return this.date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public UserRequest email(String email) {
        setEmail(email);
        return this;
    }

    public UserRequest date_of_birth(Date date_of_birth) {
        setDate_of_birth(date_of_birth);
        return this;
    }

    public UserRequest gender(Gender gender) {
        setGender(gender);
        return this;
    }

}
