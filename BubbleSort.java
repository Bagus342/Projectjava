public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {9, 2, 5, 12, 4, 8, 15, 10, 9, 7};
        int temp;

        System.out.print("Data sebelum disorting : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

        for (int i = 1; i < data.length; i++) {
            for (int j = 0; j < data.length - i; j++) {
                if (data[j] > data[j+1]) {
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }

        System.out.print("\nData hasil sorting : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
