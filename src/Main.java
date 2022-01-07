import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */

        List<Student> studentList = new ArrayList<>();

        Osoba osoba = new Osoba();
        osoba.setImie("Jan");
        osoba.setNazwisko("Kowalski");
        osoba.setIndeks(1231);
        Student student = new Student(osoba, WydzialEnum.SOPOT);
        student.setWydział(WydzialEnum.GDYNIA);

        Osoba osoba4 = new Osoba();
        osoba4.setImie("Oskar");
        osoba4.setNazwisko("Wołcz");
        osoba4.setIndeks(62642);
        Student student4 = new Student(osoba4);
        student4.setWydział(WydzialEnum.GDYNIA);

        Osoba osoba1 = new Osoba();
        osoba1.setImie("Marek");
        osoba1.setNazwisko("Mostowiak");
        osoba1.setIndeks(997);
        Student student1 = new Student(osoba1, WydzialEnum.SOPOT);
        student1.setWydział(WydzialEnum.GDANSK);

        Osoba osoba2 = new Osoba();
        osoba2.setImie("Adam");
        osoba2.setNazwisko("Małysz");
        osoba2.setIndeks(2137);
        Student student2 = new Student(osoba2, WydzialEnum.SOPOT);
        student2.setWydział(WydzialEnum.SOPOT);

        Osoba osoba3 = new Osoba();
        osoba3.setImie("Adam");
        osoba3.setNazwisko("Nowak");
        osoba3.setIndeks(120938);
        Student student3 = new Student(osoba3, WydzialEnum.SOPOT);
        student3.setWydział(WydzialEnum.GDANSK);



        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

//        for (Student p : studentList) {
//            System.out.printf(student.toString());
//            System.out.printf(student1.toString());
//            System.out.printf(student2.toString());
//            System.out.printf(student3.toString());
//            System.out.printf(student4.toString());
//        }

//        for (int i = 0; i < studentList.size(); i++) {
//            System.out.println(studentList.toString());
//
//        }

        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.toString());
        }




    }
}
