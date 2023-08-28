package linear_search;

import static linear_search.LinearSearch.linearSearchAlgo;

public class BinarySearchTest {

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 5, 6, 7, 8, 10, 12};

        System.out.println(linearSearchAlgo(arr, 11));
    }

}