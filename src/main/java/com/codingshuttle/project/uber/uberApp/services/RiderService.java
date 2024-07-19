package com.codingshuttle.project.uber.uberApp.services;

import com.codingshuttle.project.uber.uberApp.dto.DriverDto;
import com.codingshuttle.project.uber.uberApp.dto.RideDto;
import com.codingshuttle.project.uber.uberApp.dto.RideRequestDto;
import com.codingshuttle.project.uber.uberApp.dto.RiderDto;

import java.util.List;

public interface RiderService {
    public RideRequestDto requestRide(RideRequestDto rideRequestDto);
    public RideDto cancelRide(Long rideId);

    public DriverDto rateDriver(Long rideId,Integer rate);
    public RiderDto getMyProfile();
    public List<RideDto> getAllMyRides();
}
