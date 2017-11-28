package aufgabe3;

/**
 *
 * @author lk
 */
public class Kreis extends Form {

    Kreis() {
        name = "Kreis\n";
    }

    public double berechneFlaeche() {
        return Math.PI / 4.0 * this.getBreite() * this.getBreite();
    }

    public double berechneUmfang() {
        return Math.PI * this.getBreite();
    }

    public void setHoehe(int hoehe) {
        super.setHoehe(hoehe);
        super.setBreite(hoehe);
    }

    public void setBreite(int breite) {
        super.setHoehe(breite);
        super.setBreite(breite);
    }

}
