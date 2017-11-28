package aufgabe3;

/**
 *
 * @author lk
 */
public class Position {

    private int x;
    private int y;

    public void verschiebe(int umX, int umY) {
        this.x += umX;
        this.y += umY;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
