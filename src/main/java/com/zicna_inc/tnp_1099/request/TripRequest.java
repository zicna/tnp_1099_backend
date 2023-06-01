package com.zicna_inc.tnp_1099.request;

import com.zicna_inc.tnp_1099.enums.Platform;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

// TODO: add custom validation for platfor field (enum class)

public class TripRequest {
    // @NotBlank(message = "distance can not be blank")
    @Min(0)
    @NotNull(message = "trip distance must be present")
    private Double distance;
    private Platform platform;

    public TripRequest(Double distance, Platform platform) {
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

    public Platform getPlatform() {
        return this.platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

}
