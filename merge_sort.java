public class Main {
    private static int[] arr;
    private static int[] tempMergeArr;
    private static int length;
    
    public static void sort(int[] a) {
        arr = a;
        length = a.length;
        tempMergeArr = new int[length];
        divideArr(0, length - 1);
    }
    
    public static void divideArr(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            divideArr(lowerIndex, middle);
            divideArr(middle + 1, higherIndex);
            mergeSort(lowerIndex, middle, higherIndex);
        }
    }
    
    public static void mergeSort(int lowerIndex, int middle, int higherIndex) {
        // Copy both parts into the temp array
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergeArr[i] = arr[i];
        }
        
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        
        // Merge the temp arrays back into arr[]
        while (i <= middle && j <= higherIndex) {
            if (tempMergeArr[i] <= tempMergeArr[j]) {
                arr[k] = tempMergeArr[i];
                i++;
            } else {
                arr[k] = tempMergeArr[j];
                j++;
            }
            k++;
        }
        
        // Copy the remaining elements of left subarray, if any
        while (i <= middle) {
            arr[k] = tempMergeArr[i];
            k++;
            i++;
        }
    }
    
    public static void main(String[] args) {
        int[] a = {1, 4, 22, 3, 51, 6, 81};
        sort(a);
        System.out.print("Sorted Array is:");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
