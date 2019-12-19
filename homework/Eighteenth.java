package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Eighteenth <K> {

        private K a;
        private Eighteenth(K a) {
            this.a = a;
        }
        public static <K> Map <K, Integer> countValues(List<Eighteenth> ks) {
            Map<K, Integer> map = new HashMap<>();
            for (Eighteenth k : ks) {
                map.compute((K) k, (k1, count) -> count == null ? 1 : count + 1);
            }
            System.out.println(map);
            return map;
        }

        public static void main(String[] args) {
            List <Eighteenth> list = new ArrayList<>();
            Eighteenth <Integer> a_1 = new Eighteenth<>(2);
            Eighteenth <Integer> a_2 = new Eighteenth<>(1);
            Eighteenth <Integer> a_3 = new Eighteenth<>(3);
            Eighteenth <Integer> a_4 = new Eighteenth<>(2);
            Eighteenth <Integer> a_5 = new Eighteenth<>(2);
            list.add(a_1);
            list.add(a_2);
            list.add(a_3);
            list.add(a_4);
            list.add(a_5);

            Eighteenth.countValues(list);

        }


}
