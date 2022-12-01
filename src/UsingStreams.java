import java.util.ArrayList;

public class UsingStreams {
    public static void testAll() {
        simpleExample();
    }

    public static void simpleExample() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Andrew");
        names.add("Ben");
        names.add("Caleb");
        names.add("Daniel");
        names.add("Andy");
        names.add("David");

        names.stream().filter(n -> n.startsWith("A")).forEach(System.out::println);
    }
}
