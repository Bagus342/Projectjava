import java.util.Scanner;

public class Aritmatika {
    public static void main(String[] args) {
        int detik, jam, menit, sisa;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Pengkonversian Waktu");        
            System.out.println("--------------------");        
            System.out.print("Masukkan Nilai detik : ");
            detik = input.nextInt();
        }
        jam = detik / 3600;
        menit = (detik % 3600) / 60;
        sisa = (detik % 3600) - (menit * 60);
        System.out.println(jam + "jam" + "-" + menit + "menit" + "-" + sisa + "detik");
    }
}
