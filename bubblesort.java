public class Main {
    public static void bubbleSort(int[] a, int n) {
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    // Swap a[j] and a[j+1]
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped in this pass, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 5, 3, 6};
        int n = a.length;
        bubbleSort(a, n);
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
