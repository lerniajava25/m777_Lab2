
package org.example;


public class Main {


    public static void main(String[] args) throws Exception {
        Scene scene = new Scene();

        scene.addShape(new Sphere(
                new Vector3D(0, 0, 4),
                1.0
        ));

        scene.addShape(new Triangle(
                new Vector3D(-1.5, -1, 5),
                new Vector3D(1.5, -1, 5),
                new Vector3D(0, 1.5, 5)
        ));

        Renderer renderer = new Renderer();

        renderer.render(
                scene,
                400,
                300,
                "output.ppm"
        );
    }

}




