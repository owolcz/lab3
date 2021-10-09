/* klasa Punkt */
public class Punkt {
    private int x, y;

    /* konstruktory */
    public Punkt() {
    }

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /* Settery */
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    /* Gettery */
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /* publiczna metoda */
    public int dodawanie() {
        return x + y;
    }

    /* Nadpisanie metody toString() */
    @Override
    public String toString() {
        return "Punkt{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

