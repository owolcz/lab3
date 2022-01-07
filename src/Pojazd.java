public class Pojazd {
    protected String marka;
    protected String model;
    protected int moc;
    private boolean czyPojazd;


    public Pojazd(){
        this.marka = "";
        this.model = "";
        this.moc = 0;
        this.czyPojazd = true;
    }

    public Pojazd(String marka, String model, int moc){
        this.marka = marka;
        this.model = model;
        this.moc = moc;
        czyPojazd = true;
    }

    protected int przeliczMoc(){
        return this.moc;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }

    public void setCzyPojazd(boolean czyPojazd) {
        this.czyPojazd = czyPojazd;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getMoc() {
        return moc;
    }

    public boolean isCzyPojazd() {
        return czyPojazd;
    }

    @Override
    public String toString(){
        return "Pojazd {" +
                "marka= " + marka +
                ", model= " + model +
                ", czyPojazd= " + (czyPojazd ? "Tak" : "Nie") +
                ", moc= " + moc +
                "}";
    }

}
