package day12.objectsVsPrimitives;

public class Mouse {
    String name;
    int dateOfBirth;
    Teeth teeth = new Teeth();

    Mouse(String name, int dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
}
