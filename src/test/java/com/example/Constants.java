package com.example;


import java.util.Date;

public class Constants {
    public static String staticField = "https://google.com";

    public static String getCurrentDate(){
        return new Date().toString();
    }

    public static void main(String[] args) {
        System.out.println("Static field:" + Constants.staticField);
        System.out.println("Static method:" + Constants.getCurrentDate());
    }
}
