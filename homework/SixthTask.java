package com.company;
/*
Электронные часы показывают время в формате от 00:00 до 23:59.
Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация для той,
что справа от двоеточия (например, 02:20, 11:11 или 15:51)
 */


public class SixthTask {
    public static void main(String[] args) {

        int count = 0;

        int b = 10;

        for (int i = 0; i < 24; i++) {
            for (int a = 0; a < 60; a++) {
                if (i/b%b == a%b && i%b == a/b%b) {
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
}
