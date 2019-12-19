package com.company;

/*
Создать массив заполнить его случайными элементами, распечать, перевернуть, и снова распечатать

При перевороте элементов не желательно создавать еще один массив
 */

import java.util.Scanner;

public class TenthTask {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int s = console.nextInt();

        int array[] = new int[s];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < array.length/2; i++) {
            int number = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = number;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
