public class Auto extends Pojazd{
    protected int liczbaKol;
    protected int liczbaDrzwi;
    protected int turbo;

    public Auto(){
        super();
        this.liczbaDrzwi =  0;
        this.liczbaKol = 0;
        this.turbo = 0;
    }

    public Auto(int liczbaDrzwi, int liczbaKol, int turbo){
        this.liczbaDrzwi = liczbaDrzwi;
        this.liczbaKol = liczbaKol;
        this.turbo = turbo;
    }

    public Auto(String marka, String model, int moc, int liczbaKol, int liczbaDrzwi, int turbo){
        super(marka, model, moc);
        this.liczbaKol = liczbaKol;
        this.liczbaDrzwi = liczbaDrzwi;
        this.turbo = turbo;
    }

    public void setLiczbaKol(int liczbaKol) {
        this.liczbaKol = liczbaKol;
    }

    public void setLiczbaDrzwi(int liczbaDrzwi) {
        this.liczbaDrzwi = liczbaDrzwi;
    }

    public void setTurbo(int turbo) {
        this.turbo = turbo;
    }

    public int getLiczbaKol() {
        return liczbaKol;
    }

    public int getLiczbaDrzwi() {
        return liczbaDrzwi;
    }

    public int getTurbo() {
        return turbo;
    }

    @Override
    protected int przeliczMoc(){
        return super.przeliczMoc() + turbo;
    }

    @Override
    public String toString(){
        return super.toString() +
                ", liczba drzwi= " + liczbaDrzwi +
                ", liczba kół= " + liczbaKol +
                ", dodatkowe turbo= " + turbo +
                "}";
    }

}
