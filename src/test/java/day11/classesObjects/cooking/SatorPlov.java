package day11.classesObjects.cooking;

import day11.classesObjects.cooking.ingridients.Meat;
import day11.classesObjects.cooking.ingridients.Rice;
import day11.classesObjects.cooking.ingridients.Vegetables;

public class SatorPlov {
    public static void main(String[] args) {
//        8AM
        Meat freshMeat = new Meat();
        Vegetables freshVegetables = new Vegetables();
        Rice brandNewRice = new Rice();
        Plov kazanWithPlov = new Plov(brandNewRice, freshVegetables, freshMeat);
        System.out.println("is my plov fresh? " + kazanWithPlov.isFresh);

//        4PM
    }
}
