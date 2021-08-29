// it package :)
package day11.classesObjects.cooking;

// imports :)

import day11.classesObjects.cooking.ingridients.Meat;
import day11.classesObjects.cooking.ingridients.Rice;
import day11.classesObjects.cooking.ingridients.Vegetables;

import java.util.Date;

// public - access modifier
// class is keyword for class
//Plov is the name of the class. It's used for references between other classes
public class Plov {
    //    class fields: they describe characteristics And state of the object created for this class
    public boolean isFresh;
    public double weight;
    public int amountOfPortions;
    private long cookTimestamp;

    // Constructor of the class. Name must match name of the class
//    Rice riceIngredient, Vegetables vegetablesIngredient, Meat meatIngredient are arguments of constructor
    Plov(Rice riceIngredient, Vegetables vegetablesIngredient, Meat meatIngredient) {
        riceIngredient = washRice(riceIngredient);
        cookMeat(meatIngredient);
        cutVegetables(vegetablesIngredient);
        mixItUp(meatIngredient, riceIngredient, vegetablesIngredient);
        isFresh = true;
        cookTimestamp = new Date().getTime();
    }

    public boolean isPlovFresh() {
        boolean anotherOption = ((new Date().getTime() - cookTimestamp) / 1000) > 30;
        long currentTimestamp = new Date().getTime();
        long timeDiff = currentTimestamp - cookTimestamp;
        System.out.println("Time difference in mils" + timeDiff);
        timeDiff = timeDiff / 1000;
        System.out.println("Time difference in mils" + timeDiff);
        boolean isStillFresh;
        if (timeDiff < 30) {
            isStillFresh = true;
        } else {
            isStillFresh = false;
        }
        return isStillFresh;
    }

    //    private method for use in constructor . Methods are for changing the state (characteristics ) of object of this class
    private void mixItUp(Meat meatIngredient, Rice riceIngredient, Vegetables vegetablesIngredient) {
        System.out.println("We are mixing all the stuff: " + meatIngredient + riceIngredient + vegetablesIngredient);
    }

    //    private method for use in constructor
    private void cutVegetables(Vegetables unCutVegetables) {
        System.out.println("Vegetables are being cut " + unCutVegetables);
    }

    //    private method for use in constructor
    private void cookMeat(Meat rawMeat) {
        System.out.println("Meat is cooked " + rawMeat);
    }

    //    private method for use in constructor
    private Rice washRice(Rice riceIngredient) {
        System.out.println("Rice is being washed: " + riceIngredient);
        System.out.println("Is rice washed?: " + riceIngredient.isWashed);
        riceIngredient.isWashed = true;
        System.out.println("Is rice washed now?: " + riceIngredient.isWashed);
        return riceIngredient;
    }
}
