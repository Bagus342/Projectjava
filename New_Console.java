import java.io.Console;

public class New_Console {
    public static void main(String[] args) {
        String nama;
        int usia;
        Console masukan = System.console();
        System.out.println("Masukkan Nama : ");
        nama = masukan.readLine();
        System.out.println("Masukkan Usia : ");
        usia = Integer.parseInt(masukan.readLine());
        System.out.println("Nama mu adalah : " + nama);
        System.out.println("Usia mu adalah : " + usia);
    }
}
