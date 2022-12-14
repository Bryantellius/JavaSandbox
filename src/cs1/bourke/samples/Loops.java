package cs1.bourke.samples;

import java.util.Scanner;

public class Loops {
    public static void printToN(int N) {
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }

    public static void printEvensFromN(int N) {
        for (int i = N; i > 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printPatternNToM(int N, int M) {
        StringBuilder row = new StringBuilder();

        for (int i = N; i <= M; i++) {
            for (int j = N; j <= M; j++) {
                row.append(i + M * j);
                if (j != M) {
                    row.append(" ");
                }
            }

            System.out.println(row);
            row = new StringBuilder();
        }
    }
}
