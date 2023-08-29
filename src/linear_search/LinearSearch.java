package linear_search;

public class LinearSearch {

    public static int linearSearchAlgorithm(int[] arr, int number) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -5;
    }
}
