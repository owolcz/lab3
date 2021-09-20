/* klasa Punkt */
public class Punkt {
    /* prywatne zmienne dostępne tylko w tym pliku */
    private int x, y;
    private char znak = 'y';

    /* Pusty konstruktor */
    Punkt() {
    }

    /* konstruktor z parametrami */
    Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /* przeładowanie konstruktorów - wiele konstruktorów z inną liczbą parametrów lub różnymi typami*/
    Punkt(int x, int y, int z) {
        this.x = x;
        this.y = y + z;
    }

    /* gettery - metody umożliwiający pośredni dostęp do zmiennych */
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /* settery - metody modyfikujące zmienne */
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        zmienY(); // wywołanie prywatnej metody (dostęp do niej tylko w obrębie tego pliku i klasy)
        this.y = y;
    }

    /* dowolne metody */
    public int suma() {
        return x + y;
    }

    public int suma(int z) {
        return z + y;
    }

    public void wyswietl() {
        System.out.println("Zmienna x: " + x + ", Zmienna y: " + y);
    }

    private void zmienY() { // prywatna metoda
        System.out.println("Zmieniono zmienną " + znak);
    }

}
