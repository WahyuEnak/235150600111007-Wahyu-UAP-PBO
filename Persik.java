public class Persik extends Tanaman implements Perawatan {

    public Persik(int masaHidup, int lamaHidup, int berubah, int buah, int perkembangan, int prosesBerbuah) {
        super(masaHidup, lamaHidup, berubah, buah, perkembangan, prosesBerbuah);
    }// ini klo gapake super kok eror mas??


    @Override
    public void berkembang() {

    }

    @Override
    public void treatment() {
        
    }
    
}