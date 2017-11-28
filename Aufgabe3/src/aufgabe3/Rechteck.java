package aufgabe3;

/**
 *
 * @author lk
 */
public abstract class Rechteck extends Form {

    Rechteck() {
        name = "Rechteck\n";
    }

    public double berechneFlaeche() {
        return this.getHoehe() * this.getBreite();
    }

    public double berechneUmfang() {
        return 2 * this.getHoehe() + 2 * this.getBreite();
    }

}
