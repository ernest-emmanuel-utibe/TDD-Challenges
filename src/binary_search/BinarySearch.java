package binary_search;

public class BinarySearch {

    public static int binarySearchAlgo(int[] arr, int number) {
        // Declare a leftPointer variable and initialize 1 to it
        int leftPointer = 1;
        // Declare a rightPointer variable and initialize the array.length to it
        int rightPointer = arr.length;

        // While the leftPointer is less than or equals to the rightPointer
        while(leftPointer <= rightPointer) {
            // Declare a middlePointer and initialize it to (leftPointer plus the rightPointer) in brackets divided by 2
            int middlePointer = (leftPointer + rightPointer) / 2;
            // If the number declared inside the arguments of the method is less than the arr index the middlePointer
            if (number < arr[middlePointer]) {
                // Minus the middlePointer with one and assign it to rightPointer
                rightPointer = middlePointer - 1;
            }// Else if the number declared inside the arguments of the method is greater than the arr index the middlePointer
            else if (number > arr[middlePointer]) {
                // Plus the middlePointer with one and assign it to leftPointer
                leftPointer = middlePointer + 1;
            }// Else return the middlePointer
            else {
                return middlePointer;
            }
        }
        // Return minus 1
        return -1;
    }
}
