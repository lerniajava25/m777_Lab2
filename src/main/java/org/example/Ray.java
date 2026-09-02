package org.example;


public class Ray {

    private final Vector3D origin;
    private final Vector3D direction;

    public Ray(Vector3D origin, Vector3D direction) {
        this.origin = origin;
        // enklare beräkningar när 'direction' är normaliserad,
        // som då alltid har en riktning med längden 1
        this.direction = direction.normalize();
    }

    public Vector3D getOrigin() {
        return origin;
    }

    public Vector3D getDirection() {
        return direction;
    }
    public Vector3D pointAt(double distance) {
        return origin.add(direction.multiply(distance));
    }

}


