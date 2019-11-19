package day11.classesObjects.cooking;

import day11.classesObjects.cooking.ingridients.Meat;
import day11.classesObjects.cooking.ingridients.Rice;
import day11.classesObjects.cooking.ingridients.Vegetables;

public class SatorPlov {
    public static void main(String[] args) {
//        8AM
        Plov kazanWithPlov = new Plov(new Rice(), new Vegetables(), new Meat());
        System.out.println("is my plov fresh? " + kazanWithPlov.isFresh);

//        4PM
    }
}
