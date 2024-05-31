public class Tomat extends Tanaman implements Perawatan {
    
        public Tomat(int masaHidup, int lamaHidup, int berubah, int buah, int perkembangan, int prosesBerbuah) {
        super(masaHidup, lamaHidup, berubah, buah, perkembangan, prosesBerbuah);
    }

        @Override
        public void berkembang() {
            System.out.println("Masa hidup: 100 hari");
        }
    
        @Override
        public String toString() {
            return null;
        }
    
        @Override
        public void treatment() {
            System.out.println("perkembangan 25%");
        }
    }
    
