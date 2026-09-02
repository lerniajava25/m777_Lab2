package org.example;

public class Hit {

    private final double distance;
    private final Vector3D point;

    public Hit(double distance, Vector3D point) {
        this.distance = distance;
        this.point = point;
    }

    public double getDistance() {
        return distance;
    }

    public Vector3D getPoint() {
        return point;
    }
}



