package com.company;

/*
Имеется строка с текстом.
Подсчитайте уникальное количество слов в тексте.
Учитывайте, что слова могут разделяться несколькими пробелами, знаками препинания.
Пробелы могут присутствовать в начале и конце текста.
Примеры уникальности:

dog и Dog - одинаковые
dog и dogs - разные
 */

import java.util.*;

public class ThirteenthTask {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String n = console.nextLine();

        int res = 0;

        String [] retval = n.split("\\s*(\\s|,|!|\\.)\\s*");

        ArrayList<String> string_list = new ArrayList<String>();


        for(int i=0; i < retval.length; i++){
            String word = retval[i].toLowerCase();

            if(string_list.contains(word.toLowerCase()) == false){
                string_list.add(word);
                res++;
            }
        }

        System.out.println("Количество уникальных слов в тексте = " + res);
    }
}