import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */

            List<Student> studentList = new ArrayList<>();

            Student student = new Student();

            student.Imie = "Oskar";
            student.Nazwisko = "Wołcz";
            student.NrAlbumu = 62642;

            studentList.add(student);

        for (Student s : studentList) {
            System.out.println(s.Imie + " - " + s.Nazwisko + " - " + s.NrAlbumu);
        }

    }
}

