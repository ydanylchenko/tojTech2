package day11.classesObjects.cooking;

import day11.classesObjects.cooking.ingridients.Meat;
import day11.classesObjects.cooking.ingridients.Rice;
import day11.classesObjects.cooking.ingridients.Vegetables;

public class SatorPlov {
    public static void main(String[] args) throws InterruptedException {
//        8AM
        Plov kazanWithPlov = new Plov(new Rice(), new Vegetables(), new Meat());
        System.out.println("is my plov fresh? " + kazanWithPlov.isFresh);
        System.out.println("is my plov fresh by time?" + kazanWithPlov.isPlovFresh());
        Thread.sleep(31000);
        System.out.println("is my plov fresh by time?" + kazanWithPlov.isPlovFresh());
//        4PM
    }
}
