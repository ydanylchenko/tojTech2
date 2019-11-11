package day10.variablesVisibility;

public class VariablesVisibilityClassFields {
    public String classField = "I am variable on class level. I'm available to all the methods in this class";

    public void printDefinedInClassField() {
//        "classField" is visible as it's defined on class level
        System.out.println("classField: " + classField);
    }

    public static void main(String[] args) {
        VariablesVisibilityClassFields variablesVisibilityClassFields = new VariablesVisibilityClassFields();
        variablesVisibilityClassFields.printDefinedInClassField();
//        "classField" is visible as it's defined on class level
        System.out.println("classField: " + variablesVisibilityClassFields.classField);
//        "classField" is not available from static method as the field is not static
//        System.out.println("classField: " + classField);
    }
}
