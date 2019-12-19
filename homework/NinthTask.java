package com.company;
/*
Найти максимальный и минимальный элементы массива и вывести их индексы на экран
 */

import java.util.Scanner;

public class NinthTask {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int a = console.nextInt();

        int array[] = new int[a];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
            System.out.println(array[i]);
        }

        int indexMax = 0;
        int indexMin = 0;
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > array[indexMax])
            {
                indexMax = i;
            }
            else if (array[i] < array[indexMin])
            {
                indexMin = i;
            }
        }
        System.out.println("Max = " + indexMax);
        System.out.println("Min = " + indexMin);


    }
}
