package ds.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    public static void main(String[] args) {

        int[] array = { 54, 46, 83, 66, 95, 92, 43 };

        bucketSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void bucketSort(int[] array) {
        List<Integer>[] buckets = new List[10];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int i = 0; i < array.length; i++) {
            buckets[hashIt(array[i])].add(array[i]);
        }

        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }

        int j = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int value : buckets[i]) {
                array[j++] = value;
            }
        }

    }

    public static int hashIt(int val) {
        return val / 10;
    }

}
