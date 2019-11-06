package day9;

import java.util.Random;

public class JobOffer {
    private int salary;
    private int commuteTimeInMinutes;

    JobOffer() {
        salary = new Random().nextInt(25) * 10000;
        commuteTimeInMinutes = new Random().nextInt(180);
    }

    public int getSalary() {
        return salary;
    }

    public int getCommuteTime() {
        return commuteTimeInMinutes;
    }
}
