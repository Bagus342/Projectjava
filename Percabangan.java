import java.util.Scanner;

public class Percabangan {

    public static void main(String[] args) {
        int angka;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Angka : ");
        angka = input.nextInt();
        if (angka % 2 == 0) {
            System.out.println("Bilangan Genap");
        } else {
            System.out.println("Bilangan Ganjil");
        }

        if (angka % 2 == 0) {
            if (angka > 10) {
                System.out.println("Bilangan Genap dan");
                System.out.println("Merupakan Bilangan le");
            }
        }
        String hasil = angka % 2 == 0 ? "Bilangan Genap" + " halo angka " + angka : "Bilangan Ganjil";
        System.out.println("Maka : " + hasil);
    }

}