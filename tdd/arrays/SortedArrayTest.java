package arrays;

import static arrays.SortedArray.isSorted;

class SortedArrayTest {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10}, n = new int[]{5};
        System.out.println(isSorted(array, n));
    }

}