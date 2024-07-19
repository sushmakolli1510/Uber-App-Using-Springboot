package com.codingshuttle.project.uber.uberApp.strategies;

import com.codingshuttle.project.uber.uberApp.dto.RideRequestDto;
import com.codingshuttle.project.uber.uberApp.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);
}
