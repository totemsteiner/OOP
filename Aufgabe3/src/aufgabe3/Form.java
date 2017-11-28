package aufgabe3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lk
 */
public abstract class Form {

    private Position zentrum = new Position();
    private int breite;
    private int hoehe;
    protected String name;

    public abstract double berechneFlaeche();

    public abstract double berechneUmfang();

    public Position getZentrum() {
        return this.zentrum;
    }

    public int getBreite() {
        return this.breite;
    }

    public void setBreite(int breite) {
        if (breite >= 0) {
            this.breite = breite;
        } else {
            throw new IllegalArgumentException("Breite darf nicht < 0 sein.\n");
        }
    }

    public int getHoehe() {
        return this.hoehe;
    }

    public void setHoehe(int hoehe) {
        if (hoehe >= 0) {
            this.hoehe = hoehe;
        } else {
            throw new IllegalArgumentException("Breite darf nicht < 0 sein.\n");
        }
    }

    // Ausgabe der Informationen
    public void ausgabeInfos() {
        /*Ausgabe des Namens, der "name" steht in der abstrakten Klasse, z.B. im 
         Rechteck() {
        name = "Rechteck\n";
        }*/
        System.out.format("Form: %s", name);
        System.out.format("Zentrum Rechteck: %d, %d\n", this.getZentrum().getX(),
                this.getZentrum().getY());
        System.out.format("Breite Rechteck: %d\n", this.getBreite());
        System.out.format("Hoehe Rechteck: %d\n", this.getHoehe());
        System.out.format("Umfang Rechteck: %f\n", this.berechneUmfang());
        System.out.format("Flache Rechteck: %f\n", this.berechneFlaeche());
    }

    //Methode zum Eingeben der Primitivparameter
    public void values() {
        Scanner scanner = new Scanner(System.in);
        int x, y = 0;
        try {
            System.out.print("x = ");
            x = scanner.nextInt();
            Aufgabe3.formen.get(Aufgabe3.index).getZentrum().setX(x);
            System.out.print("y = ");
            y = scanner.nextInt();
            Aufgabe3.formen.get(Aufgabe3.index).getZentrum().setY(y);
            System.out.print("heohe = ");
            hoehe = scanner.nextInt();
            Aufgabe3.formen.get(Aufgabe3.index).setHoehe(hoehe);
            System.out.print("breite = ");
            breite = scanner.nextInt();
            Aufgabe3.formen.get(Aufgabe3.index).setBreite(breite);

        } catch (InputMismatchException e) {
            System.out.println("keine gültige Eingabe!");
            scanner.next();//cleared den Buffer
        }

    }

}
