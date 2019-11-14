package day11.classesObjects.dealer;

import java.util.ArrayList;
import java.util.List;

public class VisitOfJoraToCarDealer {
    public static void main(String[] args) {
        DealerOffice carDealer = new DealerOffice("Auto Empire", "2739 86th St, Brooklyn, NY 11223");
        {
            List<Car> carsOnMarket = new ArrayList<>();
            Car toyotaSiennaOfJerry = new Car("Toyota", "Sienna", "LE", 2019, 14000, "blue", 30000);
            Car toyotaCamryOfMelissa = new Car("Toyota", "Camry", "XLE", 2007, 81200, "white", 9000);
            Car bmwX5OfLevi = new Car("BMW", "X5", "xDrive35i", 2011, 91000, "white", 11000);
            Car gWagonOfRachel = new Car("Mercedes-Benz", "G-Class", "G500", 1993, 215000, "black", 36995);
            Car kiaSportageOfRobert = new Car("Kia", "Sportage", "LX V6", 2010, 102000, "red", 5600);
            carsOnMarket.add(toyotaSiennaOfJerry);
            carsOnMarket.add(toyotaCamryOfMelissa);
            carsOnMarket.add(bmwX5OfLevi);
            carsOnMarket.add(gWagonOfRachel);
            carsOnMarket.add(kiaSportageOfRobert);
            carDealer.setStockOfCars(carsOnMarket);
        }
        System.out.println(carDealer);
        ClientProfile clientProfileOfJora = new ClientProfile("Jorik", "9177551925", "any", "any", "any", 2000, 100000, "any", 11000);
        Car matchingCar = carDealer.getFilteredCarsList(clientProfileOfJora);
        System.out.println(matchingCar);
    }
}
