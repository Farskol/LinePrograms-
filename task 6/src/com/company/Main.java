package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("write coordinate x");
        double x = console.nextDouble();
        System.out.println("write coordinate y");
        double y = console.nextDouble();
        if (x >= -2 && x <= 2 && y <= 4 && y >= 0) {
            System.out.println("true");
        }
        else { if (x >= -4 && x <= 4 && y >= -3 && y <= 0) {
            System.out.println("true");
        }
            else {
                System.out.println("false");
            }

        }
    }
}
