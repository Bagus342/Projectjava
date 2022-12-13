
package rekursif;

public class Nilai_Faktorial {

    public static void main(String[] args) {
        int hasil = rekursif(4);
        System.out.println(hasil);
    }
    
    public static Integer rekursif(int n){
        if (n == 0 || n == 1){
            return 1;
        } else {
            return n * rekursif(n-1);
        }
    }  
}
