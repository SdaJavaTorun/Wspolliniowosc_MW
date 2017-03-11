package com.sdajava.wspoliniowosc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i, det;
        int x[] = new int[3];
        int y[] = new int[3];

        System.out.println("Wprowadź współrzędne dla punktów.");
        for (i = 1; i <= 3; i++) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Punkt " + i);
            System.out.println("x = ");

            x[i - 1] = sc.nextInt();
            System.out.println("y = ");
            y[i - 1] = sc.nextInt();
        }

        det = x[0] * y[1] + x[1] * y[2] + x[2] * y[0] -
                x[2] * y[1] - x[0] * y[2] - x[1] * y[0];

        if (det > 0) System.out.println("Punkt 3 leży po lewej stronie wektora 1 -> 2");
        else if (det < 0) System.out.println("Punkt 3 leży po prawej stronie wektora 1 -> 2");
        else System.out.println("Punkty leża na wspólnej prostej");
    }
}




