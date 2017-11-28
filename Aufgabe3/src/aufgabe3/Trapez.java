package aufgabe3;

/**
 *
 * @author lk
 */
public abstract class Trapez extends Form {

    Trapez() {
        name = "Trapez \n";
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
