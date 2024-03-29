package com.zicna_inc.tnp_1099.request;

import com.zicna_inc.tnp_1099.validation.CustomTypeValidation;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class TripRequest {
    @Min(0)
    @NotNull(message = "trip distance must be present")
    private Double distance;
    @NotBlank(message = "Trip must have platform")
    @CustomTypeValidation(acceptedTypes = { "LIFT", "UBER" }, message = "Platform type must be either LIFT or UBER")
    private String platform;

    public TripRequest(Double distance, String platform) {
        this.distance = distance;
        this.platform = platform;
    }

    public TripRequest() {
    }

    public Double getDistance() {
        return this.distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getPlatform() {
        return this.platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

}
