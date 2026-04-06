package practice4.problem5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 2, 10, 3, 2, 7, 4, 4, 1, 0, 7, 5};

        System.out.println("Original array:  " + Arrays.toString(arr));

        CountingSort.printFrequency(arr);

        int[] sorted = CountingSort.sort(arr);
        System.out.println("Sorted array:    " + Arrays.toString(sorted));
    }
}