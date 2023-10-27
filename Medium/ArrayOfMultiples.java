package Medium;

import java.util.Arrays;

public class ArrayOfMultiples {
    public static int[] arrayOfMultiples(int number, int length) {

        int[] arrayMultiply = new int[length];
        int numberReset = number;

        for (int i = 0; i < length; i++) {
            number = number * (1 + i);
            arrayMultiply[i] = number;
            number = numberReset;
        }

        System.out.println(Arrays.toString(arrayMultiply));
        return arrayMultiply;
    }
}
