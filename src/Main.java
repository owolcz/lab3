import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */

        Pojazd pojazd = new Pojazd("Audi", "A4", 190);
        System.out.println(pojazd.toString());
        System.out.println("Całkowita moc: " + pojazd.przeliczMoc());


        Auto auto = new Auto("BMW", "X7", 345, 4, 5, 90);
        System.out.println(auto.toString());
        System.out.println("Całkowita moc: " + auto.przeliczMoc());

//        Operacja na prywatnej zmiennej czyPojazd setterem
//        auto.setCzyPojazd(true);
//        System.out.println(auto.isCzyPojazd());


        Motocykl motocykl = new Motocykl("Harley-Davidson", "FLHX Street Glide","Cruiser",
                90, 2, 0, 20, 30);
        System.out.println(motocykl.toString());
        System.out.println("Całkowita moc: " + motocykl.przeliczMoc());


        Motocykl motocykl1 = new Motocykl("BMW", "S","Sportowy",
                160, 2, 0, 40);
        System.out.println(motocykl1.toString());
        System.out.println("Całkowita moc: " + motocykl1.przeliczMoc());

        List<Pojazd> pojazdList = new ArrayList<>();
        pojazdList.add(pojazd);
        pojazdList.add(auto);
        pojazdList.add(motocykl);
        pojazdList.add(motocykl1);
        System.out.println(pojazdList);


        List<Auto> autoList = new ArrayList<>();
        autoList.add(auto);
        System.out.println(autoList);

        List<Motocykl> motocyklList = new ArrayList<>();
        motocyklList.add(motocykl);
        motocyklList.add(motocykl1);
        System.out.println(motocyklList);



    }
}
