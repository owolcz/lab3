import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 1 enum-y */
        /* zad.1
        a) Stworzyć prosty enum "LiczbyEnum" z liczbami od 1 do 6 zapisanymi słownie,
        b) stworzyć prosty enum "StatusEnum" z wartościami KONTYNUUJEMY i KONIEC,
        c) stworzyć pętlę while z wartością true w warunku (nieskończona pętla),
        d) niech w pętli są podawane wartości liczbowe z klawiatury,
        e) jeśli użytkownik poda z klawiatury 0 to program ma kończyć działanie,
        f) umieścić w pętli switch() case: które będą wypisywały cyfry słownie odpowiednio
        do podanych cyfr przez użytkownika,
        g) gdy użytkownik wciśnie 0 ma wyświetlić się status KONIEC w innym wypadku KONTYNUUJEMY :),
        */

        /* statusy i wybór ze switch case to najczęstsze użycia enumów, enumy są często używane
        * w różnego rodzaju listach, selectach jako krótkie opcje wyboru np. jako status A, X (Aktualny, Usunięty) */

        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj liczbę: ");
            double first = scan.nextDouble();

            String[] liczby = {LiczbyEnum.JEDEN.toString(), LiczbyEnum.DWA.toString(),LiczbyEnum.TRZY.toString(),
                    LiczbyEnum.CZTERY.toString(),LiczbyEnum.PIĘĆ.toString(), LiczbyEnum.SZEŚĆ.toString()};

            switch ((int) first) {
                case 1 -> System.out.println(liczby[0]);
                case 2 -> System.out.println(liczby[1]);
                case 3 -> System.out.println(liczby[2]);
                case 4 -> System.out.println(liczby[3]);
                case 5 -> System.out.println(liczby[4]);
                case 6 -> System.out.println(liczby[5]);
            }

            String[] status = {StatusEnum.KONTYNUJEMY.toString(), StatusEnum.KONIEC.toString()};
            if (first == 0){
                System.out.println(status[1]);
                break;
            }
            else{
                System.out.println(status[0]);
            }
        }


    }
}

enum LiczbyEnum{
    JEDEN, DWA, TRZY, CZTERY, PIĘĆ, SZEŚĆ;
}

enum StatusEnum{
    KONTYNUJEMY, KONIEC;
}
