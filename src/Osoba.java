public class Osoba {

    private String imie;
    private String nazwisko;
    private int indeks;

    public Osoba(){
        this.imie = "Oskar";
        this.nazwisko = "Wołcz";
        this.indeks = 525234;
    }

    public Osoba(String imie, String nazwisko, int indeks){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getIndeks() {
        return indeks;
    }

    @Override
    public String toString(){
        return "Imię:" + imie +
                " Naziwsko:" + nazwisko +
                " Numer indeksu: " + indeks;
    }
}
