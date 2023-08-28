package binary_search;

import static binary_search.BinarySearch.binarySearchAlgorithm;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    public static void main(String[] args) {
        int[] binarySearching = {7, 38, 85, 6, 2, 19, 26, 49, 57, 26};

        System.out.println(binarySearchAlgorithm(binarySearching, 57));
    }

}