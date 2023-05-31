package org.lessons.java;

import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
//        for (int i = 1; i <= 100 ; i++) {
//            if(i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        Scanner keyboardReader = new Scanner(System.in);
        int num;
        System.out.print("Inserisci un numero tra 0 e 1000: ");
        num = keyboardReader.nextInt();

        if(num > 0 && num < 1000) {
            for (int i = 1; i <= num ; i++) {
                if(i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                     System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Il numero da te inserito deve essere compreso tra 0 e 1000 (estremi esclusi)!");
        }
    }
}
