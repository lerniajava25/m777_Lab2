package org.example;

import java.util.Optional;

public interface Shape {

    Optional<Hit> hit(Ray ray);
}