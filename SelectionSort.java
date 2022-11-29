public class SelectionSort {
    public static void main(String[] args) {
        int[] data = {9, 2, 5, 12, 4, 8, 15, 10, 9, 7};
        int temp, posMin;
        boolean tukar;

        System.out.print("Data yang sebelum disorting : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

        for (int i = 0; i < data.length-1; i++) {
            posMin = i;
            tukar = false;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[posMin]) {
                    posMin = j;
                    tukar = true;
                }
            }
            if (tukar) {
                temp = data[i];
                data[i] = data[posMin];
                data[posMin] = temp;
            }
        }

        System.out.print("\nData hasil sorting : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }   
}
