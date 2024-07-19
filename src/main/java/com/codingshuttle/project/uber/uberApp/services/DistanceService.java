package com.codingshuttle.project.uber.uberApp.services;

import org.locationtech.jts.geom.Point;

public interface DistanceService {
    public Double calculateDistance(Point src,Point des);
}
