package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("write time in seconds:");
        int timeSec = console.nextInt();
        int timeMin = timeSec/60;
        timeSec %= 60;
        int timeHour = timeMin/60;
        timeMin %= 60;
        System.out.println(timeHour + "ч " + timeMin + "мин " + timeSec + "с");

    }
}
