package com.codingshuttle.project.uber.uberApp.services;

import com.codingshuttle.project.uber.uberApp.dto.DriverDto;
import com.codingshuttle.project.uber.uberApp.dto.RideDto;

import java.util.List;

public interface DriverService {
    public RideDto acceptRide(Long rideId);
    public RideDto cancelRide(Long rideId);
    public RideDto startRide(Long rideId);
    public RideDto endRide(Long rideId);
    public RideDto rateRider(Long rideId,Integer rate);
    public DriverDto getMyProfile();
    public List<RideDto> getAllMyRides();

}
