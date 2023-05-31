package org.lessons.java;

import java.util.Scanner;
import java.text.DecimalFormat;
public class TrainTicket {
    public static void main(String[] args) {
        //il prezzo del biglietto è definito in base ai km (0.21 € al km)
        //va applicato uno sconto del 20% per i minorenni
        //va applicato uno sconto del 40% per gli over 65

        Scanner keyboardReader = new Scanner(System.in);
        int km;
        int age;
        double price;
        double pricePerKm = 0.21;
        double discountUnder18 = 0.2;
        double discountOver65 = 0.4;

        System.out.print("Inserisci i Km da percorrere (numero intero): ");
        km = keyboardReader.nextInt();

        System.out.print("Inserisci la tua età (numero intero): ");
        age = keyboardReader.nextInt();

        if(age < 18) {
            price = km * pricePerKm - (discountUnder18 * (km * pricePerKm));
        } else if (age > 65) {
            price = km * pricePerKm - (discountOver65 * (km * pricePerKm));
        } else {
            price = km * pricePerKm;
        }

        DecimalFormat decimalFormat = new DecimalFormat("###,###.##");

        System.out.print("Il costo del tuo biglietto è: " + decimalFormat.format(price) + "€");
    }
}
