package ds.array;

public class CountingSort {

    public static void main(String[] args) {
        int[] array = { 2, 8, 5, 1, 3, 1, 3, 4 };

        countSort(array, 1, 8);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    private static void countSort(int[] array, int start, int end) {
        int[] countArray = new int[(end - start) + 1];
        for (int i = 0; i < array.length; i++) {
            countArray[array[i] - start]++;
        }

        int j = 0;
        for (int i = start; i <= end; i++) {
            while (countArray[i - start] > 0) {
                array[j++] = i;
                countArray[i - start]--;
            }
        }
    }
}
