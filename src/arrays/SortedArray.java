package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedArray {

    public static List<Integer> sortedArray(int[] number) {

        List<Integer> numbers= new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);

        Collections.sort(numbers);


        return numbers;
    }
}
