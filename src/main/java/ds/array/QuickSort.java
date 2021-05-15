package ds.array;

public class QuickSort {

    public static void main(String[] args) {

        int array[] = { 20, 35, -15, 7, 55, 1, -22 };

        quickSort(array, 0, array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    private static void quickSort(int inputArray[], int start, int end) {
        if (end - start < 2) {
            return;
        }
        int pivotIndex = partition(inputArray, start, end);
        quickSort(inputArray, start, pivotIndex);
        quickSort(inputArray, pivotIndex + 1, end);
    }

    private static int partition(int[] inputArray, int start, int end) {
        int pivot = inputArray[start];
        int i = start;
        int j = end;

        while (i < j) {

            // empty while loop
            while (i < j && inputArray[--j] >= pivot)
                ;
            if (i < j) {
                inputArray[i] = inputArray[j];
            }
            // empty while loop
            while (i < j && inputArray[++i] <= pivot)
                ;
            if (i < j) {
                inputArray[j] = inputArray[i];
            }
        }
        inputArray[j] = pivot;
        return j;
    }
}
