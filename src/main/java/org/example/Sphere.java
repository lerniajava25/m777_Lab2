package org.example;

import java.util.Optional;


public class Sphere implements Shape {

    private final Vector3D center;
    private final double radius;

    public Sphere(Vector3D center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public Optional<Hit> hit(Ray ray) {

        Vector3D oc = ray.getOrigin().subtract(center);

        double a = ray.getDirection().dot(ray.getDirection());
        double b = 2.0 * oc.dot(ray.getDirection());
        double c = oc.dot(oc) - radius * radius;

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            return Optional.empty();
        }

        double t = (-b - Math.sqrt(discriminant)) / (2.0 * a);

        if (t < 0) {
            t = (-b + Math.sqrt(discriminant)) / (2.0 * a);
        }

        if (t < 0) {
            return Optional.empty();
        }


        Vector3D point = ray.pointAt(t);
        return Optional.of(new Hit(t, point));

    }


}


