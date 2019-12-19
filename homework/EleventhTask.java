package com.company;

import java.util.Scanner;

public class EleventhTask {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int a = console.nextInt();
        int sum = 0;


        int[][] array = new int[a][a];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if (i < j && i < a - 1 - j || i > j && i > a - 1- j) {
                    array[i][j] = (int) (Math.random() * 10 - 1) + 1;

                } else if (i > j && i < a - 1 - j|| i < j && i > a - 1 - j) {
                    array[i][j] = (int) (Math.random() * (-10) + 1) - 1;
                }
                    sum = sum + array[i][j];
            }
            array[i][i] = 0;
            array[i][a - i - 1] = 0;
        }
        for (int[] anArray : array) {
            for (int anAnArr : anArray) {
                if(anAnArr>=0) {
                    System.out.print(" "+anAnArr+" ");
                }
                else {
                    System.out.print(anAnArr + " ");
                }
            }
            System.out.println();
        }
        System.out.println("Сумма всех элементов " + sum);
    }
}

