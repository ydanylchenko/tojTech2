package day11.classesObjects.cooking;

import day11.classesObjects.cooking.ingridients.Meat;
import day11.classesObjects.cooking.ingridients.Rice;
import day11.classesObjects.cooking.ingridients.Vegetables;

public class Plov {
    public boolean isFresh;
    public double weight;
    public int amountOfPortions;

    Plov(Rice riceIngredient, Vegetables vegetablesIngredient, Meat meatIngredient) {
        washRice(riceIngredient);
        cookMeat(meatIngredient);
        cutVegetables(vegetablesIngredient);
        mixItUp(meatIngredient, riceIngredient, vegetablesIngredient);
        isFresh = true;
    }

    private void mixItUp(Meat meatIngredient, Rice riceIngredient, Vegetables vegetablesIngredient) {
        System.out.println("We are mixing all the stuff: " + meatIngredient + riceIngredient + vegetablesIngredient);
    }

    private void cutVegetables(Vegetables unCutVegetables) {
        System.out.println("Vegetables are being cut " + unCutVegetables);
    }

    private void cookMeat(Meat rawMeat) {
        System.out.println("Meat is cooked " + rawMeat);
    }

    private void washRice(Rice riceIngredient) {
        System.out.println("Rice is being washed: " + riceIngredient);
    }
}
