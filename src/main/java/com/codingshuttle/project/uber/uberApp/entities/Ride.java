package com.codingshuttle.project.uber.uberApp.entities;

import com.codingshuttle.project.uber.uberApp.entities.enums.PaymentMethod;
import com.codingshuttle.project.uber.uberApp.entities.enums.RideRequestStatus;
import com.codingshuttle.project.uber.uberApp.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;
@Entity
@Getter
@Setter
public class Ride {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "Geometry(Point,4326)")
    private Point PickUpLocation;
    @Column(columnDefinition = "Geometry(Point,4326)")
    private Point dropOffLocation;
    @CreationTimestamp
    private LocalDateTime createdTime;
    @ManyToOne(fetch = FetchType.LAZY)
    private Rider rider;
    @ManyToOne(fetch = FetchType.LAZY)
    private Driver driver;

    @Enumerated(EnumType.STRING)
    private RideStatus rideStatus;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
    private String otp;

}
