package day12.objectsVsPrimitives;

public class Objects {
    public static void main(String[] args) {
        Mouse mickeyMouse = new Mouse("Mickey Mouse", 1928);
        System.out.println(String.format("Mouse in mickeyMouse variable is pointing to %s in memory and has %s name and %d DOB", mickeyMouse, mickeyMouse.name, mickeyMouse.dateOfBirth));
        Mouse jerry = new Mouse("Mikki", 1940);
        System.out.println(String.format("Mouse in jerry variable is pointing to %s in memory and has %s name and %d DOB", jerry, jerry.name, jerry.dateOfBirth));
        jerry = mickeyMouse;
        System.out.println("After assign of mickeyMouse to jerry:");
        System.out.println(String.format("Mouse in mickeyMouse variable is pointing to %s in memory and has %s name and %d DOB", mickeyMouse, mickeyMouse.name, mickeyMouse.dateOfBirth));
        System.out.println(String.format("Mouse in jerry variable is pointing to %s in memory and has %s name and %d DOB", jerry, jerry.name, jerry.dateOfBirth));
        jerry.name = "Igor";
        System.out.println("Changing the object that jerry variable is pointing to:");
        System.out.println(String.format("Mouse in mickeyMouse variable is pointing to %s in memory and has %s name and %d DOB", mickeyMouse, mickeyMouse.name, mickeyMouse.dateOfBirth));
        System.out.println(String.format("Mouse in jerry variable is pointing to %s in memory and has %s name and %d DOB", jerry, jerry.name, jerry.dateOfBirth));
        jerry.dateOfBirth = 2015;
        System.out.println("Changing the object that mickeyMouse variable is pointing to:");
        System.out.println(String.format("Mouse in mickeyMouse variable is pointing to %s in memory and has %s name and %d DOB", mickeyMouse, mickeyMouse.name, mickeyMouse.dateOfBirth));
        System.out.println(String.format("Mouse in jerry variable is pointing to %s in memory and has %s name and %d DOB", jerry, jerry.name, jerry.dateOfBirth));
    }
}
