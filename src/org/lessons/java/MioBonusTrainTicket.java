package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MioBonusTrainTicket {
    public static void main(String[] args) {
        Scanner request = new Scanner(System.in);

        int kilometres;

        do {
            System.out.print("Inserisci il numero di chilometri da percorrere: ");

            if (request.hasNextInt()) {
                kilometres = request.nextInt();

                if (kilometres <= 0) {
                    System.out.println("Il numero di chilometri deve essere maggiore di 0");
                }
            } else {
                System.out.println("Inserisci un numero valido.");
                request.next(); // Consuma l'input non valido per evitare un loop infinito
                kilometres = -1; // Assegna un valore non valido per continuare il ciclo
            }
        } while (kilometres <= 0);

        System.out.print("Inserisci età del passeggero: ");
        int age = request.nextInt();

        //variabili generali
        double pricePerKilometer = 0.21;
        double discountMinors = 0.2;
        double discountOver = 0.4;

        //Operazioni matematiche per apportare sconti e prezzi al biglietto del treno
        double ticketPrice = kilometres * pricePerKilometer;
        double discount_20 = ticketPrice * discountMinors;
        double discount_40 = ticketPrice * discountOver;
        double discountPrice_20 = ticketPrice - discount_20;
        double discountPrice_40 = ticketPrice - discount_40;

        DecimalFormat decimalFormat = new DecimalFormat("#0.00");

        System.out.println("Il costo del biglietto è: " + decimalFormat.format(ticketPrice) + " euro");

        if (age < 18) {
            System.out.println("Hai diritto ad uno sconto del 20% sul totale del biglietto. Dovrai pagare solo " + decimalFormat.format(discountPrice_20) + " euro");
        } else if (age >= 65) {
            System.out.println("Hai diritto ad uno sconto del 40% sul totale del biglietto. Dovrai pagare solo " + decimalFormat.format(discountPrice_40) + " euro");

        } else {
            System.out.println("Il totale del biglietto da pagare è: " + decimalFormat.format(ticketPrice) + " euro");
        }


    }
}
