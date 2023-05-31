package com.zicna_inc.tnp_1099.request;

import com.zicna_inc.tnp_1099.entity.Gender;

import jakarta.validation.constraints.Email;
// TODO: add custom validation for gender field (Gender Enum)

public class RiderRequest {
    @Email(message = "email must be valid")
    private String email;
    private Gender gender;

    public RiderRequest(String email, Gender gender) {
        this.email = email;
        this.gender = gender;
    }

    public RiderRequest() {

    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

}
