import cs1.bourke.samples.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] result = ArrayPractice.addSortedArrays(new int[] {1, 4, 5}, new int[] {2, 3, 6});
        System.out.println(Arrays.toString(result));
    }
}