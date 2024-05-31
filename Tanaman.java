abstract class Tanaman {

    private int masaHidup;
    private int lamaHidup;
    private int berubah;
    private int buah;
    private double perkembangan;
    private double prosesBerbuah;
    private int berkembang;

    public int getMasaHidup() {
        return masaHidup;
    }

    public void setMasaHidup(int masaHidup) {
        this.masaHidup = masaHidup;
    }

    public int getLamaHidup() {
        return lamaHidup;
    }

    public void setLamaHidup(int lamaHidup) {
        this.lamaHidup = lamaHidup;
    }

    public int getBerubah() {
        return berubah;
    }

    public void setBerubah(int berubah) {
        this.berubah = berubah;
    }

    public int getBuah() {
        return buah;
    }

    public void setBuah(int buah) {
        this.buah = buah;
    }

    public double getPerkembangan() {
        return perkembangan;
    }

    public void setPerkembangan(double perkembangan) {
        this.perkembangan = perkembangan;
    }

    public double getProsesBerbuah() {
        return prosesBerbuah;
    }

    public void setProsesBerbuah(double prosesBerbuah) {
        this.prosesBerbuah = prosesBerbuah;
    }

    public int getBerkembang() {
        return berkembang;
    }

    public void setBerkembang(int berkembang) {
        this.berkembang = berkembang;
    }

    public Tanaman(int masaHidup, int lamaHidup, int berubah, int buah, int perkembangan, int prosesBerbuah) {
        this.masaHidup = masaHidup;
        this.lamaHidup = lamaHidup;
        this.berubah = berubah;
        this.buah = buah;
        this.perkembangan = perkembangan;
        this.prosesBerbuah = prosesBerbuah;
    }

    public abstract void berkembang ();


    public String Status () {
        if (lamaHidup >= masaHidup) {
            return "mati";
        }
        else{
            return "hidup";
    }

    }

    public String toString() {
        return "Masa hidup : " + lamaHidup + "\nlama hidup: " + lamaHidup + "\nbuah dihasilkan: " + berubah + "\nstatus tanaman: " + Status() + '\'' + '}';
}
}

    
    
