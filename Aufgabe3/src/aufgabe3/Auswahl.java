package aufgabe3;

import static aufgabe3.Aufgabe3.index;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Auswahl {

    public static void auswahl() {
        //Input Methode Scanner
        Scanner scanner = new Scanner(System.in);
        int nr;
        //do while Schleife, wird mit Nr. 6 beendet
        do {
            System.out.print("1. Rechteck hinzufügen\n2. Dreieck hinzufügen\n"
                    + "3. Kreis hinzufügen\n4. Trapez hinzufügen\n"
                    + "5. Informationen aller Primitive ausgeben\n"
                    + "6. Liste der Primitive leeren\n7. Programm "
                    + "beenden\n");
            nr = scanner.nextInt();
            try {
                switch (nr) {
                    case 1:

                        System.out.print("Rechteck hinzufügen: \n");
                        //Case 1 fügt Rechteck hinzu
                        Aufgabe3.formen.add(new Rechteck() {
                        }
                        );

                        /*hier wird zur Methode values() gesprungen, aufgerufen
                        mit Aufgabe3.formen.get(Aufgabe3.index).values();
                        Für die nächsten Primitive gilt dasselbe*/
                        Aufgabe3.formen.get(Aufgabe3.index).values();
                        Aufgabe3.formen.get(Aufgabe3.index).ausgabeInfos();
                        index++;
                        break;
                    case 2:
                        System.out.print("Dreieck hinzufügen: \n");
                        Aufgabe3.formen.add(new Dreieck());
                        index++;
                        Aufgabe3.formen.get(Aufgabe3.index).values();
                        Aufgabe3.formen.get(Aufgabe3.index).ausgabeInfos();
                        break;
                    case 3:
                        System.out.print("Kreis hinzufügen: \n");
                        Aufgabe3.formen.add(new Kreis());
                        index++;
                        Aufgabe3.formen.get(Aufgabe3.index).values();
                        Aufgabe3.formen.get(Aufgabe3.index).ausgabeInfos();
                        break;
                    /*Trapez wird zwar hinzugefügt, die Berechnungen für 
                        Fläche und Umfang stimmen aber noch nicht und
                        werden noch hinzugefügt*/
                    case 4:
                        System.out.print("Trapez hinzufügen: \n");
                        Aufgabe3.formen.add(new Trapez() {
                        });
                        index++;
                        Aufgabe3.formen.get(Aufgabe3.index).values();
                        Aufgabe3.formen.get(Aufgabe3.index).ausgabeInfos();

                        break;
                    case 5:
                        System.out.print("Information aller Primitive: \n");
                        for (int i = 0; i < Aufgabe3.formen.size(); i++) {

                            Aufgabe3.formen.get(i).ausgabeInfos();

                        }
                        System.out.print("Press any key to continue!\n");
                        scanner.nextInt();
                        break;
                    case 6:
                        System.out.print("Komplette Liste löschen.\n");
                        Aufgabe3.formen.clear();
                        break;
                    case 7:
                        /*eigentlich überflüssig, da do-while Schleife schon
                        Bedingung abfragt und im Fall einer 7 das Programm
                        geschlossen wird*/
                        System.exit(0);
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("keine gültige Eingabe!");
                scanner.next();//cleared den Buffer
            }
            /*der index, also der Eintrag eines Primitivs wird nach jeder 
            Eingabe hochgezaehlt*/

        } while (nr != 7);
    }
}
