package com.Udemy.JavaPractice.OOPConcepts;

/***public class MethodOverloading {
 * // Three ways to achieve method overloading
 * // 1. Different Number of parameters in arguments list
 * // 2. Difference in data type of arguments
 * // 3. Difference is sequence of data type of arguments

 1. DIFFERENT NUMBER OF PARAMETERS IN ARGUMENT LIST

 public class CarsOverloading1 {

 public static void main(String[] args) {
 increaseSeatHeight(2);
 increaseSeatHeight(8, true);
 }

 public static void increaseSeatHeight(INT heightToIncrease) {
 System.out.println("Increased seat height by " + heightToIncrease + " inches");
 }

 public static void increaseSeatHeight(INT heightToIncrease, BOOLEAN rememberHeight) {
 System.out.println("Increased seat height by " + heightToIncrease + " inches");

 if (rememberHeight) {
 System.out.println("Your selection is saved");
 } else {
 System.out.println("Your selection is not saved");
 }
 }
 }

 2. DIFFERENT IN DATA TYPE OF ARGUMENTS

 public class CarsOverloading2 {
 public static void main(String[] args) {
 increaseSeatHeight(2);
 increaseSeatHeight("8");
 }

 public static void increaseSeatHeight(INT heightToIncrease) {
 System.out.println("Increased seat height by " + heightToIncrease + " inches. I am the interger one.");
 }

 public static void increaseSeatHeight(STRING heightToIncrease) {
 System.out.println("Increased seat height by " + heightToIncrease + " inches. I am the String one.");
 }
 }

 3. SEQUENCE OF DATA TYPE OF ARGUMENTS

 public class CarsOverloading3 {

 public static void main(String[] args) {
 increaseSeatHeight("2", 2);
 increaseSeatHeight(8, "8");
 }

 public static void increaseSeatHeight(STRING variable1, INT variable2) {
 System.out.println("I am the 1st overload.");
 }

 public static void increaseSeatHeight(INT variable2, STRING variable1) {
 System.out.println("I am the 2nd overload.");
 }
 }

 */

