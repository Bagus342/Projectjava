import java.util.Scanner;

public class Searching {
    public static int linear(int[] arr, int input) {
        boolean ketemu = false;
        int i = 0;
        while ((!ketemu) && (i < arr.length)) {
            if (input == arr[i]) {
                ketemu = true;
            } else {
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] data1 = { 9, 2, 5, 12, 4, 8, 15, 10, 9, 7 };
        int[] data2 = {18, 15, 14, 13, 11, 10, 9, 7, 5, 4, 3, 1};
        int cari, jml = data1.length;

        System.out.println("Data1 yang ada : ");
        for (int i = 0; i < jml; i++) {
            System.out.print(data1[i] + " ");
        }
        System.out.print("\nData yang dicari : ");
        cari = input.nextInt();
        int result = linear(data1, cari);
        if (result != 10) {
            System.out.print("\nData ketemu di posisi ke " + result + "\n");
        } else {
            System.out.print("\nData tidak ketemu..!\n");
        }
    }
}