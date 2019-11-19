package day11.classesObjects.cars.manufacturer;

public class Car {
    public String make;
    public String model;
    public String trim;
    public int year;
    public int mileage;
    public String color;
    public String bodyStyle;
    public int seatingCapacity;
    public int engine;
    public int maxSpeed;
    public double msrp;
    public int mpgCity;
    public int mpgHighway;

    public int dimensionsLength;
    public int dimensionsWidth;
    public int dimensionsHeight;
    public int towingCapacity;
    public int horsepower;

    public Car(String make, String model, String trim, int year, int mileage, String color, String bodyStyle, int seatingCapacity, int engine, int maxSpeed, double msrp, int mpgCity, int mpgHighway, int dimensionsLength, int dimensionsWidth, int dimensionsHeight, int towingCapacity, int horsepower) {
        this.make = make;
        this.model = model;
        this.trim = trim;
        this.year = year;
        this.mileage = mileage;
        this.color = color;
        this.bodyStyle = bodyStyle;
        this.seatingCapacity = seatingCapacity;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
        this.msrp = msrp;
        this.mpgCity = mpgCity;
        this.mpgHighway = mpgHighway;
        this.dimensionsLength = dimensionsLength;
        this.dimensionsWidth = dimensionsWidth;
        this.dimensionsHeight = dimensionsHeight;
        this.towingCapacity = towingCapacity;
        this.horsepower = horsepower;
    }
}
