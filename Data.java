import java.util.ArrayList;
import java.util.Scanner;

class Data{

    public static ArrayList<Tanaman> tanamans = new ArrayList<>();
    
    public static ArrayList<Integer> lokasi = new ArrayList<>();

    public static Scanner in = new Scanner(System.in);

    public static void mulai () {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan masa tanam dalam bulan: ");
        int bulan = in.nextInt();

    }

}