package task_17;


import java.util.*;

class Measurement {

    public static int measureAdd (long startTime){

        long stopTime = System.nanoTime();
        long elapsedTime = stopTime - startTime;
        int time = (int) elapsedTime;
        return time;

    }

    public static int measureRemove (long startTime){
        long stopTime = System.nanoTime();
        long elapsedTime = stopTime - startTime;
        int time = (int) elapsedTime;
        return time;
    }

    public static int measureContains (long startTime){
        long stopTime = System.nanoTime();
        long elapsedTime = stopTime - startTime;
        int time = (int) elapsedTime;
        return time;
    }


    public static String generateRandomWords(int numberOfWords)
    {

        String words= "";
        Random random = new Random();
        for(int i = 0; i < numberOfWords; i++)
        {
            char[] word = new char[random.nextInt(8)+3];
            for(int j = 0; j < word.length; j++)
            {
                word[j] = (char)('a' + random.nextInt(26));
            }
            words = new String(word);
        }
        return words;
    }
}
