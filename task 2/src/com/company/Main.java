package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Write a:");
        double a = console.nextDouble();
        System.out.println("Write b:");
        double b = console.nextDouble();
        System.out.println("Write c:");
        double c = console.nextDouble();
        double sum = ((b+Math.sqrt(Math.pow(b,2)+4*a*c))/(2*a)-Math.pow(a,3)*c+Math.pow(b,-3));
        System.out.println(sum);
    }
}
