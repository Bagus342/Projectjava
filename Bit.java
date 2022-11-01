public class Bit {
    public static void main(String[] args) {
        int a = 3, b = 4, c;
        c = a & b;
        System.out.println("a AND b = " + c);
        c = a | b;
        System.out.println("a OR b = " + c);
        c = a ^ b;
        System.out.println("a X OR b = " + c);
        c = ~a;
        System.out.println("NOT a X OR b = " + c);
        c = a << 2;
        System.out.println("a geser kiri = " + c);
        c = a >> 2;
        System.out.println("a geser kanan = " + c);
    }
}
