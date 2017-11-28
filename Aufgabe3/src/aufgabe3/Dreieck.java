package aufgabe3;

/**
 *
 * @author lk
 */
public class Dreieck extends Form {

    Dreieck() {
        name = "Dreieck\n";
    }

    public double berechneFlaeche() {
        return this.getBreite() * this.getHoehe() / 2.0;
    }

    public double berechneUmfang() {
        double basislaenge = this.getBreite();
        double seitenlaenge = Math.sqrt(0.25 * basislaenge * basislaenge
                + this.getHoehe() * this.getHoehe());
        return 2 * seitenlaenge + basislaenge;
    }
}
