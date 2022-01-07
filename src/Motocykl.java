public class Motocykl extends Auto{
    public String typMotocyklu;
    protected int dodatkowySilnik;
    public Motocykl(){
        super();
        this.typMotocyklu = "";
        this.dodatkowySilnik = 0;
    }

    public Motocykl(String typMotocyklu, int dodatkowySilnik){
        this.typMotocyklu = typMotocyklu;
        this.dodatkowySilnik = dodatkowySilnik;
    }

    public Motocykl(String marka, String model,String typMotocyklu, int moc, int liczbaKol, int liczbaDrzwi, int turbo, int dodatkowySilnik){
        super(marka, model, moc, liczbaKol, liczbaDrzwi, turbo);
        this.typMotocyklu = typMotocyklu;
        this.dodatkowySilnik = dodatkowySilnik;
    }

    public String getTypMotocyklu() {
        return typMotocyklu;
    }

    public void setTypMotocyklu(String typMotocyklu) {
        this.typMotocyklu = typMotocyklu;
    }

    public int getDodatkowySilnik() {
        return dodatkowySilnik;
    }

    public void setDodatkowySilnik(int dodatkowySilnik) {
        this.dodatkowySilnik = dodatkowySilnik;
    }

    @Override
    protected int przeliczMoc(){
        return super.przeliczMoc() + dodatkowySilnik;
    }

    @Override
    public String toString(){
        return super.toString() +
                ", typ motocyklu= " + typMotocyklu +
                ", dodatkowy silnik= " + dodatkowySilnik +
                "}";
    }
}


