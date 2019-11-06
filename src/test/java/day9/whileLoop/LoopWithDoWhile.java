package day9.whileLoop;

import day9.JobMarket;
import day9.JobOffer;

public class LoopWithDoWhile {
    public static void main(String[] args) {
        JobMarket jobMarket = new JobMarket();
        JobOffer offer;
        do {
            offer = jobMarket.getJobOffer();
            System.out.println("I am considering an offer with " + offer.getSalary() + " salary");
        }
        while (offer.getSalary() < 100000);
        System.out.println("I accepted the one with " + offer.getSalary() + " salary");
    }
}
