package com.company;

/*
Напишите программу расчета даты следующего дня введя 3 числа - день месяц и год
 */

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите день: ");
        int day = console.nextInt();

        System.out.println("Введите месяц: ");
        int month = console.nextInt();

        System.out.println("Введите год: ");
        int year = console.nextInt();

        int numberDay = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberDay = 31;
            break;

            case 4:
            case 6:
            case 9:
            case 11:
                numberDay = 30;
                break;

            case 2:

                if ((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0)) {
                    numberDay = 29;
                } else {
                    numberDay = 28;
                }
                break;
        }

        if (day != numberDay) {
                day = day + 1;
            } else if (day == numberDay && month != 12) {
                day = 1;
                month = month + 1;
            } else if (day == numberDay && month == 12) {
                day = 1;
                month = 1;
                year = year + 1;
            }
        System.out.println("Следующий день: " + day + " " + month + " " + year);
    }
}