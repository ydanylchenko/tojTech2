package day9.conditionalStatements.ifElse;

import day9.conditionalStatements.JobMarket;
import day9.conditionalStatements.JobOffer;

public class PickyMe {
    public static void main(String[] args) {
        JobMarket jobMarket = new JobMarket();
        JobOffer jobOffer = jobMarket.getJobOffer();
        int salary = jobOffer.getSalary();
        int commuteTime = jobOffer.getCommuteTime();
        System.out.println(String.format("I get a job offer with %d salary. The commute time is %d minutes.", salary, commuteTime));
        if (salary > 160000 && commuteTime < 60) {
            System.out.println("Where to put my signature?");
        }
    }
}
