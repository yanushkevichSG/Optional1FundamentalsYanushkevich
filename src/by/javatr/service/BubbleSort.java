package by.javatr.service;

public class BubbleSort {
    public static void bubbleSort(int[]arr, int fromIndex, int toIndex) {
        if(arr == null) {
            return;
        }
        if(fromIndex < 0 || toIndex < 0 || fromIndex > toIndex) {
            return;
        }
        int n = toIndex - fromIndex + 1;

        for(int j = 1; j < n; j++) {
            for(int i = fromIndex; i <= toIndex - j; i++) {
                if(arr[i] > arr[i + 1]) {
                    swapElements(arr, i, i + 1);
                }
            }
        }
    }

    public static void bubbleSort(int[]arr) {
        if(arr == null) {
            return;
        }

        bubbleSort(arr, 0, arr.length -1);
    }

    private static void swapElements(int[] arr, int ind1, int ind2) {
        int buf = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = buf;
    }
}
