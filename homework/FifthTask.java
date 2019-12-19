package com.company;
/*
Для введенного целого числа определить является ли это число простым
 */

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        int a = console.nextInt();

        if (a == 0){
            System.out.println("Ноль не является ни простым, ни составным");
            return;
        }

        boolean b = false;

        for (int i = 2; i < a; i++) {
           if (a % i == 0) {
               b = true;
               break;
           }
        }

        if (b) {
            System.out.print("составное");
        } else{
            System.out.print("простое");
        }
    }
}
