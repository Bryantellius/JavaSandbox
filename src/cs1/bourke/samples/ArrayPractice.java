package cs1.bourke.samples;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ArrayPractice {
    public static int findMax(int [] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) max = i;
        }
        return max;
    }

    public static int streamMax(int [] array) {
        OptionalInt max = Arrays.stream(array).max();
        if (max.isPresent()) return max.getAsInt();
        else return 0;
    }

    public static int findMin(int [] array) {
        int min = array[0];
        for (int i : array) {
            if (min > i) min = i;
        }
        return min;
    }

    public static int streamMin(int [] array) {
        OptionalInt min = Arrays.stream(array).min();
        if (min.isPresent()) return min.getAsInt();
        else return 0;
    }

    public static int findAverage(int [] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;
    }

    public static int streamAverage(int [] array) {
        return Arrays.stream(array).sum() / array.length;
    }

    public static int[] addArrays(int[] arrayA, int[] arrayB) {
        int[] ab = new int[arrayA.length + arrayB.length];
        int idx = 0;

        for (int n : arrayA) {
            ab[idx] = n;
            idx++;
        }

        for (int n : arrayB) {
            ab[idx] = n;
            idx++;
        }

        return ab;
    }

    public static int[] streamAdd(int[] arrayA, int[] arrayB) {
        return IntStream.concat(Arrays.stream(arrayA), Arrays.stream(arrayB)).toArray();
    }

    public static int[] addSortedArrays(int[] arrayA, int[] arrayB) {
        int[] ab = new int[arrayA.length + arrayB.length];
        int idxA = 0;
        int idxB = 0;

        for (int i = 0; i < ab.length; i++) {
            if (idxA < arrayA.length && idxB == arrayB.length) {
                ab[i] = arrayA[idxA];
                idxA++;
            } else if (idxB < arrayB.length && idxA == arrayA.length) {
                ab[i] = arrayB[idxB];
                idxB++;
            } else {
                if (arrayA[idxA] < arrayB[idxB]) {
                    ab[i] = arrayA[idxA];
                    idxA++;
                } else {
                    ab[i] = arrayB[idxB];
                    idxB++;
                }
            }
        }
        return ab;
    }
}
