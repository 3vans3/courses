package com.hackerrank.exercises;

import java.util.Scanner;

public class JavaExercises {

    public void javaLoopIIProblem() {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if (t >= 0 && t <= 500) {
            for (int i = 0; i < t; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                int aux = 0, result = 0;
                if ((a >= 0 && a <= 50) && (b >= 0 && b <= 50)) {
                    if (n >= 1 && n <= 15) {
                        for (int j = 1; j <= n; j++) {
                            aux = aux + ((int) Math.pow(2, j - 1) * b);
                            result = a + aux;
                            System.out.print(result + " ");
                        }
                        System.out.println();
                    }
                }
            }
        }
        in.close();
    }

    public void javaDataTypesProblem() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) System.out.println("* byte");
                if (x >= -32768 && x <= 32767) System.out.println("* short");
                if (x >= -Math.pow(2, 31) && x <= Math.pow(2, 31)) System.out.println("* int");
                if (x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1) System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
