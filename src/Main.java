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
        osoba.setImie("Oskar");
        osoba.setNazwisko("Wołcz");
        osoba.setIndeks(62642);
        Student student4 = new Student(osoba4, WydzialEnum.SOPOT);
        student4.setWydział(WydzialEnum.GDYNIA);

        Osoba osoba1 = new Osoba();
        osoba.setImie("Marek");
        osoba.setNazwisko("Mostowiak");
        osoba.setIndeks(997);
        Student student1 = new Student(osoba1, WydzialEnum.SOPOT);
        student1.setWydział(WydzialEnum.GDANSK);

        Osoba osoba2 = new Osoba();
        osoba.setImie("Adam");
        osoba.setNazwisko("Małysz");
        osoba.setIndeks(2137);
        Student student2 = new Student(osoba2, WydzialEnum.SOPOT);
        student2.setWydział(WydzialEnum.SOPOT);

        Osoba osoba3 = new Osoba();
        osoba.setImie("Adam");
        osoba.setNazwisko("Nowak");
        osoba.setIndeks(120938);
        Student student3 = new Student(osoba3, WydzialEnum.SOPOT);
        student3.setWydział(WydzialEnum.GDANSK);



        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

//        for (Student p : studentList) {
//            System.out.printf(student.toString());
//        }

        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.toString());
        }






    }
}
