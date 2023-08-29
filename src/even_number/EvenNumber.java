package even_number;

public class EvenNumber {
    public static String printOutEvenNumber() {
        for(int number = 0; number <= 100; number += 2) {
            System.out.println(number);
        }
        return "Loop finished";
    }
}
