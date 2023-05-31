package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + " FizzBuzz");

            } else if (i % 3 == 0) {

                System.out.println(i + " Fizz");

            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");

            } else {
                System.out.println(i);
            }
        }

        // Bonus
        Scanner requestNumbers = new Scanner(System.in);
        System.out.print("Quanti numeri vuoi stampare? ");
        int count = requestNumbers.nextInt();

        if (count <= 0 || count >= 1000) {
            System.out.println("I numeri da stampare devono essere maggiori di 0 e minori di 1000");
        } else {
            for (int i = 1; i <= count; i++) {
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    System.out.println(i + " FizzBuzz");

                } else if (i % 3 == 0) {

                    System.out.println(i + " Fizz");

                } else if (i % 5 == 0) {
                    System.out.println(i + " Buzz");

                } else {
                    System.out.println(i);
                }
            }

        }
    }


}


