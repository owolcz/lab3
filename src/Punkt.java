/* klasa Punkt */
public class Punkt {
    /* stworzyć zmienne prywatne pX, pY, pZ */

    private int r;

    @Override
    public String toString() {
        return "Punkt{" +
                "r=" + r +
                '}';
    }

    /* stworzyć
    a) pusty konstruktor,
    b) konstruktor inicjalizujacy zmienną pX,
    c) konstruktor inicjalizujący wszystkie zmienne,
    d) stworzyć settery i gettery,

        podpowiedz ALT + INSERT można wybrać generowanie automatyczne
        konstruktora, getterów, setterów, nadpisywanie metody toString() i inne ...
    */

    public Punkt(int r) {
        this.r = r;
    }
}
