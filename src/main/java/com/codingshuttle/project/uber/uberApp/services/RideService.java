package com.codingshuttle.project.uber.uberApp.services;

import com.codingshuttle.project.uber.uberApp.dto.RideDto;
import com.codingshuttle.project.uber.uberApp.dto.RideRequestDto;
import com.codingshuttle.project.uber.uberApp.entities.Driver;
import com.codingshuttle.project.uber.uberApp.entities.Ride;
import com.codingshuttle.project.uber.uberApp.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {
    public Ride getRideById(Long rideId);
    public void matchWithDrivers(RideRequestDto rideRequestDto);
    Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);
    Ride updateRideStatus(RideStatus rideStatus,Long rideId);
    Page<Ride> getAllRidesByRider(Long riderId, PageRequest pageRequest);
    Page<Ride> getAllRidesByDriver(Long driverId, PageRequest pageRequest);
}
