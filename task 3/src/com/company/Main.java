package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Write x:");
        double x = console.nextDouble();
        System.out.println("Write y:");
        double y = console.nextDouble();
        double sum = (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))-Math.tan(x*y);
        System.out.println(sum);
    }
}
