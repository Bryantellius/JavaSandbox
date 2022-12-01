import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class UsingGenerics {
    public static void testAll() {
        withGenericVariableType();

        withVarArgs();

        withWildcardOperator();
    }

    public static void withGenericVariableType() {
        ArrayList<Integer> test1 = toArrayList(new Integer[]{ 1, 2, 3, 4 }, new ArrayList<>());
        System.out.printf("Testing withGenericVariableType: %s\n", test1.toString());
    }

    public static <T> ArrayList<T> toArrayList(T[] arr, ArrayList<T> arrList) {
        for (T obj : arr) {
            arrList.add(obj);
        }

        return arrList;
    }

    public static void withVarArgs() {
        System.out.printf("Testing withVarArgs: %d\n", addWithVarArgs(new int[] { 1, 2, 3, 4, 5 }));
    }

    public static int addWithVarArgs(int ... args) {
        return Arrays.stream(args).sum();
    }

    public static void withWildcardOperator() {
        ArrayList<Square> squares = new ArrayList<>();
        squares.add(new Square());
        printShapes(squares);
    }

    public static void printShapes(ArrayList<? extends Shape> arrList) {
        System.out.printf("Printing squares...: %s", arrList.toString());
    }
}

class Shape {
    String name = "shape";
}

class Square extends Shape {
    String name = "square";
}