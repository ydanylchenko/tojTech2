package day11.classesObjects.dealer;

public class Car {
    public String make;
    public String model;
    public String trim;
    public int year;
    public int mileage;
    public String color;
    public double price;

    private int currentSpeed;
    private int currentSteeringWheelPosition;

    public Car(String make, String model, String trim, int year, int mileage, String color, double price) {
        this.make = make;
        this.model = model;
        this.trim = trim;
        this.year = year;
        this.mileage = mileage;
        this.color = color;
        this.price = price;
    }

    public void accelerate() {
        currentSpeed++;
    }

    public void accelerate(int targetSpeed) {
        while (currentSpeed < targetSpeed) {
            accelerate();
        }
    }

    public void brake() {
        currentSpeed--;
    }

    public void brake(int targetSpeed) {
        while (currentSpeed < targetSpeed) {
            brake();
        }
    }

    public void stop() {
        brake(0);
    }

    public void turn(int targetSteeringAngle) {
        if (currentSteeringWheelPosition > targetSteeringAngle) {
            while (currentSteeringWheelPosition != targetSteeringAngle) {
                currentSteeringWheelPosition--;
            }
        } else if (currentSteeringWheelPosition < targetSteeringAngle) {
            while (currentSteeringWheelPosition != targetSteeringAngle) {
                currentSteeringWheelPosition++;
            }
        }
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", trim='" + trim + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
