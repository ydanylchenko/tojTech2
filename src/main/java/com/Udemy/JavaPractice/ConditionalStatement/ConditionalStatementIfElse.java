package com.Udemy.JavaPractice.ConditionalStatement;

public class ConditionalStatementIfElse {
    public static void main(String[] args) {
        int score = 69;
        String grade;

        if(score > 90)
        {
            grade = "A";
        }
        else if(score>89)
        {
            grade = "B";
        }
        else
        {
            grade = "C";
        }
        System.out.println("My score is: " + score);
        System.out.println("My grade is: " + grade);
    }

}
