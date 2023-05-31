package org.lessons.java;

import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {

        Scanner request = new Scanner(System.in);

        System.out.print("Inserisci il numero di chilometri da percorrere: ");
        int kilometres = request.nextInt();

        System.out.print("Inserisci età del passeggero: ");
        int age = request.nextInt();

        double ticketPrice = kilometres * 0.21;
        double discount_20 = ticketPrice * 0.2;
        double discount_40 = ticketPrice * 0.4;
        double discountPrice_20 = ticketPrice - discount_20;
        double discountPrice_40 = ticketPrice - discount_40;
        System.out.println("Il costo del biglietto è: " + ticketPrice + " euro");

        if (age < 18) {
            System.out.println("Hai diritto ad uno sconto del 20% sul totale del biglietto. Dovrai pagare solo " + discountPrice_20 + " euro");
        } else if (age >= 65) {
            System.out.println("Hai diritto ad uno sconto del 40% sul totale del biglietto. Dovrai pagare solo " + discountPrice_40 + " euro");

        } else {
            System.out.println("Il totale del biglietto da pagare è: " + ticketPrice + " euro");
        }


    }
}
