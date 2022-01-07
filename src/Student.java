public class Student {
    private Osoba osoba;
    private WydzialEnum wydział;

    public Student(){

        this.osoba = new Osoba();
        this.wydział = WydzialEnum.SOPOT;


    }

    public Student(Osoba osoba, WydzialEnum wydzialEnum){
        this.osoba = osoba;
        this.wydział = wydzialEnum;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    public void setWydział(WydzialEnum wydział) {
        this.wydział = wydział;
    }



    public WydzialEnum getWydział() {
        return wydział;
    }

    @Override
    public  String toString(){
        return "Student) " + osoba +
                "Wydział) " + wydział;

    }
}
