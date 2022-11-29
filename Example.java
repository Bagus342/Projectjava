public class Example {
    public static int jam(int detik) {
        int jam, menit, sisa;
        jam = detik / 3600;
        menit = (detik % 3600) / 60;
        sisa = (detik % 3600) - (menit * 60);
        // System.out.println(jam + "jam" + "-" + menit + "menit" + "-" + sisa + "detik");
        return jam;
    }
    public static void main (String[] args) {
        Example meth = new Example();
        int a = meth.jam(1200);
        System.out.println(a);
    }
}