/* klasa ObjektPunktu */
public class ObjektPunktu {
    /* zadeklarowanie zmiennej typu klasy Punkt */
    Punkt punkt;
    private int z;

    /* Pusty konstruktor */
    public ObjektPunktu() {
    }

    /* Konstruktor z parametrami */
    public ObjektPunktu(Punkt punkt, int z) {
        this.punkt = punkt;
        this.z = z;
    }

    /* Settery */
    public void setPunkt(Punkt punkt) {
        this.punkt = punkt;
    }

    public void setZ(int z) {
        this.z = z;
    }

    /* Gettery */
    public Punkt getPunkt() {
        return punkt;
    }

    public int getZ() {
        return z;
    }

    /* Dwa sposoby wywołania działania z wykorzystaniem zmiennych z innej klasy
     * albo się odwołujemy do zmiennych przez getter, albo wywolujemy metodę która zwraca
     * nam szykane wartości  */
    public int dodawanie1() {
        return punkt.getX() + punkt.getY() + z;
    }

    public int dodawanie2() {
        return punkt.dodawanie() + z;
    }

    //    metoda toString()
    @Override
    public String toString() {
        return "ObjektPunktu{" +
                "punkt=" + punkt +
                ", z=" + z +
                '}';
    }
}
