package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Scene {

    private final List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public Optional<Hit> hit(Ray ray) {
        Hit closestHit = null;

        for (Shape shape : shapes) {
            Optional<Hit> hit = shape.hit(ray);

            if (hit.isPresent()) {
                Hit currentHit = hit.get();

                if (closestHit == null
                        || currentHit.getDistance() < closestHit.getDistance()) {
                    closestHit = currentHit;
                }
            }
        }

        return Optional.ofNullable(closestHit);
    }

}



