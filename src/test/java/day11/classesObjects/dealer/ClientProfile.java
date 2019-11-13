package day11.classesObjects.dealer;

public class ClientProfile {
    public String name;
    public String phoneNumber;

    public String make;
    public String model;
    public String trim;
    public int year;
    public int mileage;
    public String color;
    public double price;

    public ClientProfile(String name, String phoneNumber, String make, String model, String trim, int year, int mileage, String color, double price) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.make = make;
        this.model = model;
        this.trim = trim;
        this.year = year;
        this.mileage = mileage;
        this.color = color;
        this.price = price;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
