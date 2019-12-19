package com.company;
/*
Напишите программу, которая будет переводить секунды в форматированный вид - часы минуты секунды
 */

public class FourthTask {
    public static void main(String[] args) {

        int n = (int) (Math.random() * 150000);
        System.out.println("Время в секундах " + n);

        int d = n / 86400;
        int h = (n % 86400) / 3600;
        int m = (n % 3600) / 60;
        int s = n % 60;

       System.out.println(d + " : " + h + " : " + m + " : " + s);

        if (d == 1) {
            System.out.print(d + " сутки" + " ");
        } else System.out.print(d + " суток" + " ");

        if (h == 1 || h == 21) {
            System.out.print(h + " час" + " ");
        } else if (h >= 2 && h <= 4 || h >= 22 && h <= 24) {
            System.out.print(h +  " часа" + " ");
        } else if (h == 0 || h >= 5 && h <= 20) {
            System.out.print(h + " часов" + " ");
        }

        if (m == 0) {
            System.out.print(m + " минут" + " ");
        } else if (m == 1 || m == 21 || m == 31 || m == 41 || m == 51) {
            System.out.print(m + " минута" + " ");
        } else if (m >= 2 && m <= 4 || m >= 22 && m <=24 || m >= 32 && m <=34 || m >= 42 && m <=44 || m >= 52 && m <=54){
            System.out.print(m + " минуты" + " ");
        } else if (m >= 5 && m <= 20 || m >= 25 && m <= 30 || m >= 35 && m <= 40 || m >= 45 && m <= 50 || m >= 55) {
            System.out.print(m + " минут" + " ");
        }

        if (s == 0) {
            System.out.print(s + " секунд" + " ");
        } else if (s == 1 || s == 21 || s == 31 || s == 41 || s == 51) {
            System.out.print(s + " секунда" + " ");
        } else if (s >= 2 && s <= 4 || s >= 22 && s <=24 || s >= 32 && s <=34 || s >= 42 && s <=44 || s >= 52 && s <=54){
        System.out.print(s + " секунды" + " ");
        } else if (s >= 5 && s <= 20 || s >= 25 && s <= 30 || s >= 35 && s <= 40 || s >= 45 && s <= 50 || s >= 55) {
        System.out.print(s + " секунд" + " ");
        }
    }
}
