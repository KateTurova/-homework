/*Реализовать класс Pair, который будет создержать 2 значения любого типа. Класс умеет выводить:

first() - возвращает 1ый элемент
last() - возвращает 2ой элемент
swap() - меняет элементы местами
replaceFirst() - заменяет 1ый элемент на новый
replaceLast() - заменяет 2ой элемент на новый
 */
package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pair <T> {

    T a;
    Pair (T a) {
        this.a = a;
    }

    public static void first(List<Pair> myList) {

        for (int index = 0; index < myList.size(); index++) {
            if (index == 0) {
                System.out.println("Первый элемент " + myList.get(index).a);
            }
        }
    }

    public static void last(List<Pair> myList) {

        for (int index = 0; index < myList.size(); index++) {

            if (index == myList.size()-1) {
                System.out.println("Второй элемент " + myList.get(index).a);
            }
        }
    }

    public static void swap(List<Pair> myList){
        Collections.swap(myList, 0, 1);

        for(Pair List : myList) {
            System.out.println(List.a);
        }
        Collections.swap(myList, 0, 1);
    }

    public static void replaceFirst(List<Pair> myList,Pair<String> str1) {

        myList.remove(0);
        myList.add(0,str1);
        for(Pair List : myList){
        System.out.println(List.a);
        }
    }

    public static void replaceLast(List<Pair> myList,Pair<Integer>inter1){
        myList.remove(1);
        myList.add(1,inter1);
        for(Pair List : myList){
            System.out.println(List.a);
        }
    }

    public static void main(String[] args) {
        List<Pair> myList = new ArrayList<>();

        Pair<String> str = new Pair<> ("friend");
        Pair<Integer> inter = new Pair<> (12);
        Pair<String> str1 = new Pair<> ("друг");
        Pair<Integer> inter1 = new Pair<> (666);

        myList.add(str);
        myList.add(inter);

        Pair.first(myList);
        Pair.last(myList);
        Pair.swap(myList);
        Pair.replaceFirst(myList,str1);
        Pair.replaceLast(myList,inter1);
    }
}

