import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */

        System.out.println("Zadanie 1: ");

        Punkt punktA = new Punkt(7);
        punktA.toString();

        Punkt punktB = new Punkt(1,2,3);
        punktA.toString();

        punktA.setX(10);
        punktA.toString();

        System.out.println("Wartość x w punkcie A: " +punktA.getX());

        System.out.printf("x = %d, y= %d, z = %d\n", punktB.getX(), punktB.getY(),punktB.getZ());

        System.out.printf("Suma: " + punktB.suma() + "\n");

        System.out.printf("Suma: " + punktB.roznica() + "\n");

        System.out.printf("Suma: " + punktB.roznica(5,10,15) + "\n");




    }
}
