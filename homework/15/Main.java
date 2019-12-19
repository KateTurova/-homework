package flower;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Нужка упаковка? (да/нет) Цена упаковки 10 руб.");
        String packaging = scanner.next();

        System.out.println("Введите количество красных роз. Цена красных роз 15 руб.");
        int numberRedRose = scanner.nextInt();

        System.out.println("Введите количество желтых роз. Цена желтых роз 10 руб.");
        int numberYellowRose = scanner.nextInt();

        System.out.println("Введите количество розовых тюльпанов. Цена розовых тульпанов 20 руб.");
        int numberPinkTulip = scanner.nextInt();

        System.out.println("Введите количество белых тюльпанов тюльпанов. Цена белых тюльпанов 20 руб.");
        int numberWhiteTulip = scanner.nextInt();

        Rose redRose = new Rose(15);
        Rose yellowRose = new Rose(10);
        Tulip pinkTulip = new Tulip(20);
        Tulip whiteTulip = new Tulip(20);

        int buket;

        if(packaging.equalsIgnoreCase("да")) {
            buket = numberRedRose * redRose.getPrice() + numberYellowRose * yellowRose.getPrice() +
                    numberPinkTulip * pinkTulip.getPrice() + numberWhiteTulip * whiteTulip.getPrice() + 10;
            System.out.println("Цена вашего букета "+ buket + " руб.");
        } else {
            buket = numberRedRose * redRose.getPrice() + numberYellowRose * yellowRose.getPrice() +
                    numberPinkTulip * pinkTulip.getPrice() + numberWhiteTulip * whiteTulip.getPrice();
            System.out.println("Цена вашего букета "+ buket + " руб.");
        }

    }
}
