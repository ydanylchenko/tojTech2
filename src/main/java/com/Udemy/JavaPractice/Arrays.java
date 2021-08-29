package com.Udemy.JavaPractice;

/*Arrays is used to store multiple values of one type. It is a container of objects.
 Array length is fixed after the definition


 */

public class Arrays { // how to get Sum of the Arrays?
    public static void main(String[] args) {

        int c[] = {2, 3, 4, 5, 6, 7,};
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum = sum + c[i];
        }

        System.out.println(sum);

        int a[] = {2, 3, 4, 5, 6, 7,};    ///to print desired index in the array
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 7) {
                System.out.println(i);
                {
                    break;
                }
            }
        }
    }

}