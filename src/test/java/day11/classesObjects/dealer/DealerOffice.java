package day11.classesObjects.dealer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DealerOffice {
    private String name;
    private String location;
    private List<Car> stockOfCars = new ArrayList<>();

    public DealerOffice(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Car getFilteredCarsList(ClientProfile client) {
        String targetMake = client.make;
        String targetModel = client.model;
        String targetTrim = client.trim;
        int targetYear = client.year;
        int targetMileage = client.mileage;
        double targetPrice = client.price;
        List<Car> matchingCars = new ArrayList<>();
        for (Car car : stockOfCars) {
            if (car.make.equalsIgnoreCase(targetMake) || targetMake.equalsIgnoreCase("any")) {
                if (car.model.equalsIgnoreCase(targetModel) || targetModel.equalsIgnoreCase("any")) {
                    if (car.trim.equalsIgnoreCase(targetTrim) || targetTrim.equalsIgnoreCase("any")) {
                        if (car.year >= targetYear) {
                            if (car.mileage <= targetMileage) {
                                if (car.price <= targetPrice) {
                                    return car;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("We don't have any cars matching your criteria. Will you consider:");
        return stockOfCars.get(new Random().nextInt(stockOfCars.size()));
    }

    public void setStockOfCars(List<Car> stockOfCars) {
        this.stockOfCars = stockOfCars;
    }

    @Override
    public String toString() {
        return "Welcome to " + name + " car dealer. We are located at " + location + " and have " + stockOfCars.size() + " cars in stock!";
    }
}
