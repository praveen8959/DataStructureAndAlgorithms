package ds.array;

public class MergeSort {

    public static void main(String[] args) {

        int array[] = { 20, 35, -15, 7, 55, 1, -22 };

        mergeSort(array, 0, array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    private static void mergeSort(int inputArray[], int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(inputArray, start, mid);
        mergeSort(inputArray, mid, end);
        merge(inputArray, start, mid, end);
    }

    private static void merge(int[] inputArray, int start, int mid, int end) {
        if (inputArray[mid - 1] <= inputArray[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] tempArray = new int[end - start];
        while (i < mid && j < end) {
            tempArray[tempIndex++] = inputArray[i] <= inputArray[j] ? inputArray[i++] : inputArray[j++];
        }
        System.arraycopy(inputArray, i, inputArray, start + tempIndex, mid - i);
        System.arraycopy(tempArray, 0, inputArray, start, tempIndex);
    }
}
