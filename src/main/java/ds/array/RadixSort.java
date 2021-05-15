package ds.array;

public class RadixSort {

    public static void main(String[] args) {

        int array[] = { 4725, 4586, 1330, 8792, 1594, 5729 };

        radixSort(array, 10, 4);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    private static void radixSort(int[] array, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(array, i, radix);
        }
    }

    private static void radixSingleSort(int[] array, int position, int radix) {
        int[] countArray = new int[radix];
        for (int value : array) {
            countArray[getDigit(position, value, radix)]++;
        }
        // adjust the countArray for stable counting sort
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }
        int[] temp = new int[array.length];
        for (int tempIndex = array.length - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, array[tempIndex], radix)]] = array[tempIndex];
        }

        //copy back to array
        for (int i = 0; i < array.length; i++) {
            array[i] = temp[i];
        }

    }

    private static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }
}
