import java.util.Scanner;

public class BinarySearching {
    public static void main(String[] args) {
        int[] data = {18, 15, 14, 13, 11, 10, 9, 7, 5, 4, 3, 1};
        int cari, bb, ba, t, jml = data.length;
        boolean ketemu = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Data yang ada : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.print("\nData yang dicari : ");
        cari = input.nextInt();
        ketemu = false;
        bb = 0;
        ba = jml - 1;
        t = (bb + ba) / 2;
        while ((!ketemu) && (bb<=ba)) {
            if (cari == data[t]) {
                ketemu = true;
            } else if (cari > data[t]) {
                ba = t - 1;
            } else {
                bb = t + 1;
                t = (bb + ba) / 2;
            }
        }
        if (ketemu) {
            System.out.print("\nData ketemu di posisi ke " + t + "\n");
        } else {
            System.out.print("\nData tidak ketemu..!\n");
        }
    }
}
