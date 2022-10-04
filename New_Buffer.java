import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class New_Buffer {
    public static void main(String[] args) throws IOException {
        String nama;
        int usia;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Masukkan Nama : ");
        nama = br.readLine();
        System.out.println("Masukkan Usia : ");
        usia = Integer.parseInt(br.readLine());
        System.out.println("Nama mu adalah : " + nama);
        System.out.println("Usia mu adalah : " + usia);
    }
}