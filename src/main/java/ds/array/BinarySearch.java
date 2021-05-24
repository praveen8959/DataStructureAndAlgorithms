package ds.array;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = { -22, -15, 1, 43, 55, 98, 99 };

        System.out.println(binarySearchIterative(array, 1));
        System.out.println(binarySearchIterative(array, 99));
        System.out.println(binarySearchIterative(array, 105));

        System.out.println(binarySearchRecursive(array, 1));
        System.out.println(binarySearchRecursive(array, 99));
        System.out.println(binarySearchRecursive(array, 105));

    }

    private static int binarySearchIterative(int[] array, int value) {
        int start = 0;
        int end = array.length;
        while (start < end) {
            int mid = (start + end) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] < value) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return -1;
    }

    private static int binarySearchRecursive(int[] array, int value) {
        return binarySearchRecursiveOne(array, 0, array.length, value);
    }

    private static int binarySearchRecursiveOne(int[] array, int start, int end, int value) {
        if (start >= end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (array[mid] == value) {
            return mid;
        } else if (array[mid] < value) {
            return binarySearchRecursiveOne(array, mid + 1, end, value);
        } else {
            return binarySearchRecursiveOne(array, start, mid, value);
        }
    }
}
