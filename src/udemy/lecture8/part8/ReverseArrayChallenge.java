package udemy.lecture8.part8;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] testArray = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(testArray));
        reverse(testArray);
        System.out.println(Arrays.toString(testArray));
    }

    public static void reverse(int[] array) {
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        int n = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = arrayCopy[n - i];
        }
    }
}
