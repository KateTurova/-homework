package com.company;

/*
Найти в строке все знаки препинания.
Подсчитать общее количество их.
 */
import java.util.Scanner;

public class TwelfthTask {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите сообщение");
        String n = console.nextLine();

        int count = 0;

        for (int i = 0; i < n.length(); i++){
           if (n.charAt(i) == ',' || n.charAt(i) == '.' || n.charAt(i) == '!' || n.charAt(i) == '?' || n.charAt(i) == ':' ||
                   n.charAt(i) == ';' || n.charAt(i) == '-' ) {

               count++;
           }

        }
        System.out.println("Общее количество сиволов " + count);






    }
}
