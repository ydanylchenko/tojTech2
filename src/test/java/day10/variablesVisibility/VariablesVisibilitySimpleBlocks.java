package day10.variablesVisibility;

public class VariablesVisibilitySimpleBlocks {
    public void blocksVisibility() {
        int x = 1;
//        "x" is visible as it's defined on this level
        System.out.println("x: " + x);
//        "y" is not yet defined
//        System.out.println("y: " + y);
//        "z" is not yet defined
//        System.out.println("z: " + z);
        {
            int y = 2;
//            "x" is visible as it's defined on the upper level
            System.out.println("x: " + x);
//            "y" is visible as it's defined on this level
            System.out.println("y: " + y);
//            "z" is not yet defined so that not visible
//            System.out.println("z: " + z);
            {
                int z = 3;
//                "x" is visible as it's defined on the upper level
                System.out.println("x: " + x);
//                "y" is visible as it's defined on the upper level
                System.out.println("y: " + y);
//                "z" is visible as it's defined on this level
                System.out.println("z: " + z);
            }
        }
        System.out.println("x: " + x);
//        "y" and "z" were defined in inner blocks and they are not available on this level
//        System.out.println("y: " + y);
//        System.out.println("z: " + z);
    }

    public static void main(String[] args) {
        VariablesVisibilitySimpleBlocks variablesVisibility = new VariablesVisibilitySimpleBlocks();
        variablesVisibility.blocksVisibility();
//        this method has no idea about the variables defined in other methods
//        System.out.println("x: " + x);
//        System.out.println("y: " + y);
//        System.out.println("z: " + z);
    }
}
