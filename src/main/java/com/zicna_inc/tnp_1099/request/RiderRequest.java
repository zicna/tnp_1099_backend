package com.zicna_inc.tnp_1099.request;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
// TODO: add custom validation for gender field 

public class RiderRequest {
    @NotBlank(message = "email must be valid")
    @Email(message = "email must be valid")
    private String email;
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
