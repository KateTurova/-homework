package task_17;

import java.util.*;


public class Result {

    enum TypeOpration{
        добавлени,
        удаление,
        поиск
    }

    public static void main(String[] args){

        String st = "";

        ArrayList<String> arrayLists = new ArrayList<>();

        LinkedList<String> linkedList = new LinkedList<>();

        HashSet<String> hashSet = new HashSet<>();

        TreeSet<String> treeSet = new TreeSet<>();

        for(int g = 1; g < 5; g++) {

            for (int i = 0; i <= 1000000; i++) {

                if(g==1) { arrayLists.add(Measurement.generateRandomWords(1)); st = "ArrayList";}
                if (g==2){ linkedList.add(Measurement.generateRandomWords(1)); st = "LinkedList";}
                if (g==3){ hashSet.add(Measurement.generateRandomWords(1)); st = "HashSet";}
                if(g==4) { treeSet.add(Measurement.generateRandomWords(1)); st = "TreeSet";}

                long startTime = System.nanoTime();

                if (i == 100) {
                    int time = Measurement.measureAdd(startTime);
                    System.out.println("Тип колекции: "+ st + ", " + "тип данных: String " + "количество элементов: " + i + " операция: " + TypeOpration.добавлени + " элемента" + " время: " + time + "ms");
                }

                if (i == 10000) {
                    int time = Measurement.measureAdd(startTime);
                    System.out.println("Тип колекции: " + st + ", " + "тип данных: String " + "количество элементов: " + i + " операция: " + TypeOpration.добавлени + " элемента" + " время: " + time + "ms");
                }

                if (i == 1000000) {
                    int time = Measurement.measureAdd(startTime);
                    System.out.println("Тип колекции: " + st + ", " + "тип данных: String " + "количество элементов: " + i + " операция: " + TypeOpration.добавлени + " элемента" + " время: " + time + "ms\n");
                }
            }

            int size = 0;

            if(g==1) {int size1= arrayLists.size(); size=size1; }
            if (g==2){int size2= linkedList.size(); size=size2; }
            if (g==3){ int size3= hashSet.size(); size=size3;}
            if(g==4) { int size4= treeSet.size(); size=size4;}
            
            int count = 0;
            String serch = Measurement.generateRandomWords(1);

            for (int c = 0; c < size; c++) {

                if(g==1) {
                    if (arrayLists.get(c).contains(serch)) {
                        count++;
                    }
                }
                if (g==2){
                    if (linkedList.get(c).contains(serch)) {
                        count++;
                    }
                }
                if (g==3){
                     if (hashSet.contains(serch)) {
                        count++;
                    }
                }
                if(g==4) {
                    if (treeSet.contains(serch)) {
                        count++;
                    }
                }

                long startTime = System.nanoTime();

                if (c == 100) {
                    int time = Measurement.measureRemove(startTime);
                    System.out.println("Тип колекции: "+ st + ", " + "тип данных: String " + "количество элементов: " + c + ", количество найденых элементов: " + count + " операция: " + TypeOpration.поиск + " элемента" + " время: " + time + "ms");
                }

                if (c == 10000) {
                    int time = Measurement.measureRemove(startTime);
                    System.out.println("Тип колекции: " + st + ", " + "тип данных: String " + "количество элементов: " + c + ", количество найденых элементов: " + count + " операция: " + TypeOpration.поиск + " элемента" + " время: " + time + "ms");
                }

                if (c == 1000000) {
                    int time = Measurement.measureRemove(startTime);
                    System.out.println("Тип колекции: " + st + ", " + "тип данных: String " + "количество элементов: " + c + ", количество найденых элементов: " + count + " операция: " + TypeOpration.поиск + " элемента" + " время: " + time + "ms\n");
                }

            }

            for (int j = 0; j < size; j++) {

                if (g==1){ arrayLists.remove(arrayLists.size() - 1); }
                if (g==2){ linkedList.remove(linkedList.size() - 1); }
                if (g==3){ Iterator<String> itr = hashSet.iterator();
                    hashSet.remove(itr.next()); }
                if (g==4){ Iterator<String> iterator = treeSet.iterator();
                    treeSet.remove(iterator.next()); }


                long startTime = System.nanoTime();

                if (j == 100) {
                    int time = Measurement.measureRemove(startTime);
                    System.out.println("Тип колекции: " + st + ", " + "тип данных: String " + "количество элементов: " + j + " операция: " + TypeOpration.удаление + " элемента" + " время: " + time + "ms");
                }

                if (j == 10000) {
                    int time = Measurement.measureRemove(startTime);
                    System.out.println("Тип колекции: " + st + ", " + "тип данных: String " + "количество элементов: " + j + " операция: " + TypeOpration.удаление + " элемента" + " время: " + time + "ms");
                }

                if (j == 1000000) {
                    int time = Measurement.measureRemove(startTime);
                    System.out.println("Тип колекции: " + st + ", " + "тип данных: String " + "количество элементов: " + j + " операция: " + TypeOpration.удаление + " элемента" + " время: " + time + "ms\n");
                }

            }

        }

    }
}
