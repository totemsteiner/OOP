/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe_2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lk
 */
public class Aufgabe_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Eingabefunktion

        int n; //Deklaration n in for Schleife
        double a = 0, b = 0, u = 0, o = 0; //Deklaration Eingabevariable
        int k = 0; //Deklaration Zaehlervariable
        boolean validInput = false;
        System.out.println("Programm, welches das "
                + "Integral der Normalverteilung f in einem"
                + "Intervall [a, b] berechnet.\n");
        System.out.println("Achten Sie darauf, dass sie nur gültige Zahlenwerte"
                + " (reelle Zahlen) eingeben!!!\n");
        System.out.println("Gleitkommazahlen mit KOMMA trennen!!!\n");
        do {

            try {
                System.out.print("Geben Sie den Erwartungswert u ein:\n");
                u = scanner.nextDouble();
                System.out.print("Geben Sie die Standardabweichung o ein:\n");
                o = scanner.nextDouble();
                System.out.print("Grenzen. Eingabe a:\n");
                a = scanner.nextDouble();
                System.out.print("Eingabe b:\n");
                b = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("keine gültige Eingabe!");
                scanner.next();//cleared den Buffer
            }

        } while (!validInput);
        //Ausgabe der Werte a und b (Kontrolle)
        System.out.format("a: %f\n", a); //Ausgabe der Werte a und b (Kontrolle)
        System.out.format("b: %f\n", b);

        // Schleife zum berechnen der Werte  
        for (n = 0; n < 1000000; n++) {
            Random randObj = new Random();
            //Zufallszahl im Intervall a - b erzeugen
            double x = (a + randObj.nextFloat() * (b - a));
            //Zufallszahl im Intervall 0 bis 1 erzeugen
            double y = randObj.nextDouble();
            //Funktion zur Berechnung der Normalverteilung (Normalverteilung.java)
            Normalverteilung normalverteilung = new Normalverteilung();
            double erg;
            erg = normalverteilung.function(u, o, x);
            //Bedingung, wenn y kleiner erg, dann wird Zaehlervariable 
            //hochgezaehlt
            if (y < erg) {
                k += 1;
            }
        }
        //Flaeche wird berechnet
        double E = (float) ((float) k / 1000000 * (b - a));
        System.out.println("E = " + E);
    }

}
