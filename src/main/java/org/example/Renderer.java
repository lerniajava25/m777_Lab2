package org.example;


public class Renderer {

    public void render(Scene scene, int width, int height, String filename) throws java.io.FileNotFoundException {

        try (var writer = new java.io.PrintWriter(filename)) {

            writer.println("P3");
            writer.println(width + " " + height);
            writer.println("255");

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {

                    double aspectRatio = (double) width / height;
                    double screenX = ((2.0 * x / width) - 1.0) * aspectRatio;

                    double screenY = 1.0 - (2.0 * y / height);

                    Vector3D direction = new Vector3D(screenX, screenY, 1.0);
                    Ray ray = new Ray(new Vector3D(0, 0, 0), direction);

                    var hit = scene.hit(ray);

                    Color color;

                    if (hit.isPresent()) {
                        color = new Color(255, 255, 255);
                    } else {
                        color = new Color(0, 0, 0);
                    }

                    writer.println(color);

                }
            }

        }
    }

}





