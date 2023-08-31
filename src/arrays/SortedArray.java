package arrays;

public class SortedArray {

    public static boolean isSorted(int[] array, int n) {
        for(int i = 1; i < n; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
