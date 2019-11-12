package day10.variablesVisibility;

public class VariablesVisibilityLoopExample {
    public void loopsBlockExample(int limit) {
//        this main method has no idea about the variables in method that called it, i.e.:
//        "myLimitValue" is not visible as it's not defined in this method
//        System.out.println("myLimitValue: " + myLimitValue);
//        "limit" is visible as it's defined in method arguments
        System.out.println("limit: " + limit);
        {
//            "limit" is visible as it's defined in method arguments
            System.out.println("limit: " + limit);
        }
//        "i" is not yet defined so that not visible
//        System.out.println("i: " + i);
        for (int i = 0; i < limit; i++) {
//            "i" is visible as it's defined in loop structure
            System.out.println("i: " + i);
//            "limit" is visible as it's defined in method arguments
            System.out.println("limit: " + limit);
        }
//        "i" is not available on this level as it was defined in loop body
//        System.out.println("i: " + i);
//        "limit" is visible as it's defined in method arguments
        System.out.println("limit: " + limit);
    }

    public static void main(String[] args) {
        int myLimitValue = 3;
//        "myLimitValue" is visible as it's defined on this level
        System.out.println("myLimitValue: " + myLimitValue);
        new VariablesVisibilityLoopExample().loopsBlockExample(myLimitValue);
//        this main method has no idea about the variables defined in other methods
//        System.out.println("i: " + i);
//        this main method has no idea that the value "3" is stored in variable with name "limit" in the loopsBlockExample method
//        System.out.println("limit: " + limit);
    }
}
