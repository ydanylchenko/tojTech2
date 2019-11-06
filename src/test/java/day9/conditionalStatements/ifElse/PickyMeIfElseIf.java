package day9.conditionalStatements.ifElse;

import day9.conditionalStatements.JobMarket;
import day9.conditionalStatements.JobOffer;

public class PickyMeIfElseIf {
    public static void main(String[] args) {
        JobMarket jobMarket = new JobMarket();
        JobOffer jobOffer = jobMarket.getJobOffer();
        int salary = jobOffer.getSalary();
        System.out.println(String.format("I get a job offer with %d salary. The commute time is %d minutes.", salary, jobOffer.getCommuteTime()));
        if (salary < 60000) {
            System.out.println("WTF?");
        } else if (salary < 100000) {
            System.out.println("You can give me a better deal");
        } else if (salary < 140000) {
            System.out.println("I just get a better offer. Will you be able to match it?");
        } else {
            System.out.println("Where to put my signature?");
        }
    }
}
