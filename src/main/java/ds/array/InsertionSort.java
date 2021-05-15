package ds.array;

public class InsertionSort {

    public static void main(String[] args) {

        int array[] = { 20, 35, -15, 7, 55, 1, -22 };

        for (int firstUnSortedIndex = 1; firstUnSortedIndex < array.length; firstUnSortedIndex++) {
            int newElement = array[firstUnSortedIndex];
            int i;
            for (i = firstUnSortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
