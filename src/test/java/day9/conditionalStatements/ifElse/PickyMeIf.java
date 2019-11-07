package day9.conditionalStatements.ifElse;

import day9.JobMarket;
import day9.JobOffer;

public class PickyMeIf {
    public static void main(String[] args) {
        JobMarket jobMarket = new JobMarket();
        JobOffer jobOffer = jobMarket.getJobOffer();
        int salary = jobOffer.getSalary();
        System.out.println(String.format("I get a job offer with %d salary. The commute time is %d minutes.", salary, jobOffer.getCommuteTime()));
        if (salary > 160000) {
            System.out.println("Where to put my signature?");
        }
    }
}
