import java.util.Scanner;
public class Konversi_Nilai {

    public static void main(String[] args) {
        String nim, namaMahasiswa, setJurusan, mataKuliah, predikat;
        String grade = "";
        String getJurusan = "";
        int nilai;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Kartu Hasil Studi");
            System.out.println("-----------------");
            System.out.print("Masukkan Nim : ");
            nim = input.nextLine();
            System.out.print("Masukkan Nama Mahasiswa : ");
            namaMahasiswa = input.nextLine();
            setJurusan = nim.substring(2, 4);
            switch (setJurusan) {
                case "52":
                    getJurusan = "S1-Teknologi Informasi";
                    System.out.println("Prodi Mahasiswa : " + getJurusan);
                    break;
                case "51":
                    getJurusan = "S1-Sistem Informasi";
                    System.out.println("Prodi Mahasiswa : " + getJurusan);
                    break;
                case "31":
                    getJurusan = "S1-Sistem Informasi";
                    System.out.println("Prodi Mahasiswa : " + getJurusan);
                default:
                    System.out.println("Inputan anda tidak sesuai !");
                    break;
            }
            // if (setJurusan.equals("52getJurusan")) {
            //     getJurusan = "Prodi Mahasiswa : S1-Teknologi Informasi";
            //     System.out.println(getJurusan);
            // } else if (setJurusan.equals("51")) {
            //     getJurusan = "Prodi Mahasiswa : S1-Sistem Informasi";
            //     System.out.println(getJurusan);
            // } else if (setJurusan.equals("31")) {
            //     getJurusan = "Prodi Mahasiswa : S1-Sistem Informasi";
            //     System.out.println(getJurusan);
            // } else {
            //     System.out.println("Inputan tidak sesuai 1");
            // }
            System.out.print("Masukkan Mata Kuliah : ");
            mataKuliah = input.nextLine();
            System.out.print("Masukkan Nilai mahasiswa : ");
            nilai = input.nextInt();
        }
        if (nilai >= 85) {
            grade = "A";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 80) {
            grade = "A-";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 75) {
            grade = "B+";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 70) {
            grade = "B";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 65) {
            grade = "B-";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 60) {
            grade = "C+";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 55) {
            grade = "C";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 50) {
            grade = "C-";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 45) {
            grade = "D";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai < 54) {
            grade = "E";
            System.out.println("Grade nilai siswa : " + grade);
        } else {
            System.out.println("Inputan anda tidak sesuai !");
        }
        switch (grade) {
            case "A":
                System.out.println("Sangat Memuaskan");
                break;
            case "A-":
                System.out.println("Sangat Memuaskan");
                break;
            case "B+":
                System.out.println("Memuaskan");
                break;    
            case "B":
                System.out.println("Memuaskan");
                break;    
            case "B-":
                System.out.println("Memuaskan");
                break;    
            case "C+":
                System.out.println("Cukup");
                break;    
            case "C":
                System.out.println("Cukup");
                break;    
            case "C-":
                System.out.println("Cukup");
                break;    
            case "D":
                System.out.println("Kurang");
                break;    
            case "E":
                System.out.println("Sangat Kurang");
                break;    
            default:
                break;
        }
        // if (grade.equals("A") || grade.equals("A-")) {
        //     System.out.println("Predikat Mahasiswa : Sangat Memuaskan");
        // } else if (grade.equals("B+") || grade.equals("B") || grade.equals("B-")) {
        //     System.out.println("Predikat Mahasiswa : Memuaskan");
        // } else if (grade.equals("C-") || grade.equals("C") || grade.equals("C+")) {
        //     System.out.println("Predikat Mahasiswa : Cukup");
        // } else if (grade.equals("D")) {
        //     System.out.println("Predikat Mahasiswa : Kurang");
        // } else {
        //     System.out.println("Predikat Mahasiswa : Sangat Kurang");
        // } 
    }
}