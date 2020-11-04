package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Write number:");
        float number = console.nextFloat();
        System.out.println(number);
        /*double wholeNumber = Math.floor(number);
        System.out.println(wholeNumber);
        double fractionNumber = number - wholeNumber;
        String d = Double.toString(fractionNumber);
        int a = d.length();
        double s = Math.pow(10,a);
        fractionNumber *= s;
        d = Double.toString(wholeNumber);
        a = d.length();
        s = Math.pow(10,a);
        wholeNumber /= s;
        System.out.println(fractionNumber+wholeNumber);*/



    }
}
