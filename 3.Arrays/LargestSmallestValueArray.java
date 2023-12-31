
/**
 * The class finds the largest and smallest values in an array of integers.
 */
import java.util.*;

public class LargestSmallestValueArray {

    public static void value(int num[]) {

        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        // The code is finding the largest value in the array `num[]`.
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
        }
        System.out.println("Largest num in array is :" + largest);

        // The code block is finding the smallest value in the array `num[]`.
        for (int i = 0; i < num.length; i++) {
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        System.out.println("Smallest num in array is :" + smallest);

    }

    /**
     * The main function calls the value function and passes an array of integers as
     * an argument.
     */
    public static void main(String[] args) {
        int num[] = { 3, 8, 6, 12, 8, 6, 3, 1, 1, 0, 22, 22, -10 };
        value(num);
    }
}
