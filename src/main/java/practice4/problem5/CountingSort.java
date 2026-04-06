package practice4.problem5;

public class CountingSort {

    public static int[] sort(int[] arr) {
        int[] count = new int[11]; 

        for (int num : arr) {
            count[num]++;
        }

        int[] sorted = new int[arr.length];
        int idx = 0;
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < count[i]; j++) {
                sorted[idx++] = i;
            }
        }

        return sorted;
    }

    public static void printFrequency(int[] arr) {
        int[] count = new int[11];
        for (int num : arr) count[num]++;

        System.out.println("Element frequencies:");
        for (int i = 0; i <= 10; i++) {
            if (count[i] > 0) {
                System.out.println("  " + i + " -> " + count[i] + " time(s)");
            }
        }
    }
}

