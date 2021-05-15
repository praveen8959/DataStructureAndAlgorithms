package ds.assignments;

public class MissingNumber {

    public static void main(String[] args) {
        int array[] = { 3, 7, 1, 2, 8, 4, 5, 6, 10 };
        countArrayMethod(array, array.length - (array.length - 1), array.length + 1);
        sumMethod(array);
    }

    /**
     * Complex not recommended
     *
     * This solution is to add a counter array which will keep track of the range count
     *
     * It is same technique like counting sort
     */
    private static void countArrayMethod(int[] array, int min, int max) {
        int countArray[] = new int[(max - min) + 1];
        for (int i = 0; i < array.length; i++) {
            countArray[array[i] - min]++;
        }
        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] == 0) {
                System.out.println("Missing number with counting sort solution is " + (i + 1));
            }
        }

    }

    /**
     * Simple Recommended
     *
     * This solution is to sum all the numbers with (n *(n+1))/2 and minus the total number by array contents
     *
     */
    private static void sumMethod(int[] array) {
        int n = array.length + 1;
        n = n * (n + 1) / 2;
        for (int i = 0; i < array.length; i++) {
            n = n - array[i];
        }
        System.out.println("Missing number with sum solution is " + n);
    }
}
