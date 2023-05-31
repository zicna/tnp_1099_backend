package com.zicna_inc.tnp_1099.request;

import com.zicna_inc.tnp_1099.entity.Platform;

import jakarta.validation.constraints.NotBlank;

// TODO: 

public class TripRequest {
    @NotBlank(message = "distance can not be blank")
    private Long distance;
    private Platform platform;

    public TripRequest(Long distance, Platform platform) {
        this.distance = distance;
        this.platform = platform;
    }

    public TripRequest() {
    }

    public Long getDistance() {
        return this.distance;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }

    public Platform getPlatform() {
        return this.platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

}
