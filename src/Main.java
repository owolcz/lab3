public class Main {

    public static void main(String[] args) {
        /* przyklad 4 klasy */

        /* Deklaracja i inicjalizowanie objektu klasy ObjektPunktu pustymi wartościami */
        ObjektPunktu objektPunktu = new ObjektPunktu();
        System.out.println(objektPunktu.toString()); // ObjektPunktu{punkt=null, z=0}

        /* Deklaracja i inicjalizowanie objektu klasy Punkt pustymi wartościami */
        Punkt punkt = new Punkt();
        System.out.println(punkt.toString()); // Punkt{x=0, y=0}

        /* Wywołanie konstruktora parametryzowanego klasy Punkt */
        punkt = new Punkt(10, 15);
        System.out.println(punkt.toString()); // Punkt{x=10, y=15}

        /* Wywołanie konstruktora parametryzowanego klasy ObjektPunktu */
        objektPunktu = new ObjektPunktu(punkt, 20);
        System.out.println(objektPunktu.toString()); // ObjektPunktu{punkt=Punkt{x=10, y=15}, z=20}

        /* wywołanie metod wyliczjących */
        System.out.println(objektPunktu.dodawanie1()); // 45
        System.out.println(objektPunktu.dodawanie2()); // 45

        /* nadpisanie pola punkt z klasy ObjektPunktu */
        objektPunktu.setPunkt(new Punkt(1, 2));
        System.out.println(objektPunktu.dodawanie1()); // 23

    }
}
