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





    }
}
