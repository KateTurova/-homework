package com.company;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Nineteenth {
    public static void main(String[] args) throws Exception {
        FileWriter a = new FileWriter("text.txt");

        a.write("Каждый наш друг, это целый мир для нас, мир, который мог " +
                "бы и не родиться и который родился только благодаря нашей встрече с этим человеком.");
        a.close();

        System.out.println("Количество слов в файле " + Files.lines(Paths.get("text.txt"))
                .flatMap(str-> Stream.of(str.split("[ ,.!?\r\n]")))
                .filter(s->s.length()>0).count());


        final Pattern p = Pattern.compile("[,|.|?|!|:|;]");
        System.out.println(p.splitAsStream("Каждый наш друг, это целый мир для нас, мир, который мог " +
                "бы и не родиться и который родился только благодаря нашей встрече с этим человеком.").count());

    }
}
