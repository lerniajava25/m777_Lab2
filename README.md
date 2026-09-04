
## Lab 2 - Raytracer

En enkel raytracer i Java som renderar en scen med geometriska objekt till en PPM-bild.

### Klasser
- Main startar programmet, skapar scenen och kör renderingen
- Vector3D hanterar 3D-vektorer och matematiska operationer
- Ray representerar en stråle med startpunkt och riktning
- Hit innehåller information om en träff, till exempel avstånd och träffpunkt
- Shape är ett interface för geometriska former
- Sphere representerar en sfär och kontrollerar om en Ray träffar den
- Triangle representerar en triangel och kontrollerar om en Ray träffar den
- Scene lagrar alla former i en List<Shape> och hittar den närmaste träffen
- Color representerar en RGB-färg
- Renderer skickar ut rays genom bilden och sparar resultatet som output.ppm


## Lägg till en ny Shape

En Shape är en geometrisk form som kan träffas av en Ray, till exempel Sphere eller Triangle.

För att lägga till en ny form:

1. Skapa en ny Java-klass, till exempel Plane
2. Skriv implements Shape efter klassnamnet. Då säger klassen att den följer reglerna som finns i Shape
3. Lägg till metoden hit(Ray ray). Den metoden ska kontrollera om en Ray träffar formen
4. Om det blir en träff returneras information om träffen som ett Hit. Om det inte blir någon träff returneras Optional.empty()
5. Lägg till den nya formen i Scene med addShape(...) så att den används vid rendering

Exempel på början av en ny form:

public class Plane implements Shape {

    @Override
    public Optional<Hit> hit(Ray ray) {
        return Optional.empty();
    }

}