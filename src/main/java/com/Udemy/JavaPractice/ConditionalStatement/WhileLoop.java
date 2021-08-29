package com.Udemy.JavaPractice.ConditionalStatement;

public class WhileLoop { // until the boolean condition is true,
    // while will execute the code
    public static void main(String[] args) {

           int i = 10;

		/*while (i < 10) {
			//System.out.println(i);
			i++;
			if (i == 17) {
				continue;
			}
			System.out.println("Value of i " + i);
		}
		System.out.println("Outside loop...");*/

                do { // will proceed with the first iteration and then check the condition
                    //System.out.println("do while loop...");
                    System.out.println(i);
                    i++;

                } while (i < 10);
            }
        }
