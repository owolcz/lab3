public class Main {

    public static void main(String[] args) {

        /* przykład 1 enum-y */
        /* Najprostsze Użycie enumów jako prosty typ wyliczeniowy */
        System.out.println("kolor " + KolorEnum.CZERWONY);

        /* użycie enuma */
        String[] kolory = {KolorEnum.NIEBIESKI.toString(), KolorEnum.ZIELONY.toString()};
        System.out.println("Drugi kolor to: " + kolory[1]);

        /* Użycie enumów z booleanem i metodą */
        drukujDoKonsoli(WielkoscEnum.MALY, "dlugopis");
        drukujDoKonsoli(WielkoscEnum.DUZY, "Dom");
    }

    static void drukujDoKonsoli(WielkoscEnum wartosc, String przedmiot) {
        System.out.println(przedmiot + " jest " + wartosc + " " + wartosc.wielkosc);
    }
}

/* Prosty enum */
enum KolorEnum {
    CZERWONY, ZIELONY, NIEBIESKI;
}

/* enum z metodą i zmienną */
enum WielkoscEnum {
    MALY(false), DUZY(true), SREDNI(false), OGROMNY(true);

    boolean wielkosc;

    WielkoscEnum(boolean czyDuzy) {
        wielkosc = czyDuzy;
    }
}