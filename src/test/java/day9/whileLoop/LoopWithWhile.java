package day9.whileLoop;

import day9.JobMarket;
import day9.JobOffer;

public class LoopWithWhile {
    public static void main(String[] args) {
        JobMarket jobMarket = new JobMarket();
        JobOffer offer = jobMarket.getJobOffer();
        while (offer.getSalary() < 100000) {
            System.out.println("I get offer with " + offer.getSalary() + " salary but did not accept it");
            offer = jobMarket.getJobOffer();
        }
        System.out.println("I accepted offer with " + offer.getSalary() + " salary");
    }
}
