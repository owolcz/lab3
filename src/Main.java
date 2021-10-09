import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 3 klasy */

        /*  zad.1
            a) stworzyć objekt typu punkt, new Punkt()
            b)
        */

        /* stworzenie objektu p1 typu Punkt */
        Punkt p1 = new Punkt(); // wywołanie pustego konstruktora
        p1.setX(2); // przypisanie wartości / modyfikowanie zmiennych
        p1.setY(4);
        System.out.printf("x = %d, y = %d\n", p1.getX(), p1.getY()); // get zwraca wartość zmiennych
        System.out.println("Suma: " + p1.suma() + "\n"); // użycie metody z klasy


        /**/
        Punkt p2 = new Punkt(10, 20, 6); // wywołanie konstruktora z parametrami (przypisanie wartości)
        System.out.printf("x = %d, y = %d\n", p2.getX(), p2.getY()); // get zwraca wartość zmiennych
        System.out.println("Suma: " + p2.suma(1) + "\n"); // użycie metody z klasy

        p2.setY(13); // przypisanie nowej wartości do zmiennej Y i wywołanie prywatnej metody w klasie Punkt
        p2.wyswietl(); // wywołanie metody z klasy
    }
}
