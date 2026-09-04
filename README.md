
## Struktur

- Vector3D hanterar 3D-vektorer och matematiska operationer

- Ray representerar en stråle med startpunkt och riktning

- Hit innehåller information om en träff

- Shape är ett interface för geometriska objekt

- Sphere och Triangle implementerar Shape

- Scene lagrar alla former

- Renderer skapar bilden och sparar den som PPM


## Lägg till en ny Shape

En Shape är en geometrisk form som kan träffas av en Ray, till exempel Sphere eller Triangle.

För att lägga till en ny form:

1. Skapa en ny Java-klass, till exempel Plane.
2. Skriv implements Shape efter klassnamnet. Då säger klassen att den följer reglerna som finns i Shape.
3. Lägg till metoden hit(Ray ray). Den metoden ska kontrollera om en Ray träffar formen.
4. Om det blir en träff returneras information om träffen som ett Hit. Om det inte blir någon träff returneras Optional.empty().
5. Lägg till den nya formen i Scene med addShape(...) så att den används vid rendering.

Exempel på början av en ny form:

public class Plane implements Shape {

    @Override
    public Optional<Hit> hit(Ray ray) {
        return Optional.empty();
    }

}