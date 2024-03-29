package com.zicna_inc.tnp_1099.request;


import com.zicna_inc.tnp_1099.validation.CustomTypeValidation;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class RiderRequest {
    @NotBlank(message = "email must be valid")
    @Email(message = "email must be valid")
    private String email;
    @NotBlank(message = "Gender field must be present")
    @CustomTypeValidation(acceptedTypes = {"MALE", "FEMALE", "OTHER"}, message = "Gender must be one of: MALE, FEMALE, OTHER")
    private String gender;

    public RiderRequest(String email, String gender) {
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

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
