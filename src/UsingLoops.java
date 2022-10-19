public class UsingLoops {
    public static void testAll() {
        System.out.println("\nFor Loop:");
        forLoopCount();
        System.out.println("\nWhile Loop:");
        whileLoopCount();
        System.out.println("\nDo/While Loop:");
        doWhileLoopCount();
        System.out.println("\nForEach Loop:");
        forEachLoopCount();
    }

    public static void forLoopCount() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // TODO
    }

    public static void whileLoopCount() {
        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void doWhileLoopCount() {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void forEachLoopCount() {
        String[] names = {"Kvothe", "Simmon", "Wilem"};

        for (String name : names) {
            System.out.printf("Hello %s!\n", name);
        }
    }
}
