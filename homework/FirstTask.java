package com.company;

/*
Имеется прямоугольное отверстие размера a на b.
Определить можно ли полностью закрыть отверстие круглой картонкой радиусом r
 */

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите сторону 'a' прямоугольника:");
        double a = console.nextDouble();

        System.out.println("Введите сторону 'b' прямоугольника:");
        double b = console.nextDouble();

        System.out.println("Введите радиус круга:");
        double r = console.nextDouble();

        if (r * r >= (a * a + b * b)/4) {
         System.out.println("Можно");

     } else System.out.println("Нельзя");

    }
}
