import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        String nik, nama, tmpLahir, tglLahir, alamat;
        int usia;
        String jKel;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Masukkan NIK : ");
            nik = in.nextLine();
            System.out.println("Masukkan Nama : ");
            nama = in.nextLine();
            System.out.println("Masukkan Tempat Lahir : ");
            tmpLahir = in.nextLine();
            System.out.println("Masukkan Tanggal Lahir : ");
            tglLahir = in.nextLine();
            System.out.println("Masukkan Alamat : ");
            alamat = in.nextLine();
            System.out.println("Masukkan Jenis Kelamin L/P : ");
            jKel = in.nextLine();
            System.out.println("Masukkan Usia : ");
            usia = in.nextInt();
        }
        System.out.println("Identitas Pribadi Kami");
        System.out.println("----------------------");
        System.out.println("NIK : " + nik);
        System.out.println("Nama : " + nama);
        System.out.println("Tempat, Tanggal Lahir : " + tmpLahir + ", " + tglLahir);
        System.out.println("Alamat : " + alamat);
        System.out.println("Umur : " + usia);
        System.out.println("Jenis Kelamin : " + jKel);
    }
}