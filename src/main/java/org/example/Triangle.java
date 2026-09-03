package org.example;


import java.util.Optional;

public class Triangle implements Shape {

    private final Vector3D a;
    private final Vector3D b;
    private final Vector3D c;

    public Triangle(Vector3D a, Vector3D b, Vector3D c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public Optional<Hit> hit(Ray ray) {

        Vector3D edge1 = b.subtract(a);
        Vector3D edge2 = c.subtract(a);

        Vector3D h = ray.getDirection().cross(edge2);

        double determinant = edge1.dot(h);

        if (Math.abs(determinant) < 0.000001) {
            return Optional.empty();
        }

        double inverseDeterminant = 1.0 / determinant;
        Vector3D s = ray.getOrigin().subtract(a);
        double u = inverseDeterminant * s.dot(h);

        if (u < 0.0 || u > 1.0) {
            return Optional.empty();
        }

        Vector3D q = s.cross(edge1);
        double v = inverseDeterminant * ray.getDirection().dot(q);

        if (v < 0.0 || u + v > 1.0) {
            return Optional.empty();
        }

        double t = inverseDeterminant * edge2.dot(q);

        if (t < 0) {
            return Optional.empty();
        }

        Vector3D point = ray.pointAt(t);

        return Optional.of(new Hit(t, point));

    }

}



