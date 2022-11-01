public class MaxElementArray {
    public static void main(String[] args) {
        int[] arr = new int[] {44, 23, 55, 76, 21, 100};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >  max) {
                max = arr[i];
            }
        }
        System.out.println("Bilangan terbesar dari array adalah : " + max);
    }
}
