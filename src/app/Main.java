package app;

import java.util.Scanner;

public class Main {

    static  String[] goods;
    static int count;

    public static void main(String[] args){

        goods = new String[]{"Potato", "Carrot", "Beet", "Potato",
                "Cabbage", "Onion", "Cabbage", "Tomato"};

        System.out.println("Available in stock:");
        for (String product : goods) {
            count++;
            System.out.println(count + ") " + product);
        }

        Scanner productScanner = new Scanner(System.in);
        System.out.print("\nTo search, enter the product name: ");
        String pattern = productScanner.nextLine();

        System.out.println("\nThe purchase set contains " + pattern + ":");

        count = 0;

        for (String product : goods ) {
            if (product.equals(pattern)){
                count++;
                System.out.println(count + ") product - " + product);
            }
        }

        if (count > 0)
            // Метод repeat() використовується для виведення рядка,
            // Який складається зі значення, що повторюється задану кількість разів.
            // У дужках необхідно вказати параметр -
            // Ціле число, яке означає кількість разів,
            // Яких необхідно повторити це значення.
            System.out.println("-".repeat(33) + "\nYou've bought " +
                    pattern + " " + count + " time(s)");

        if (count == 0)
            System.out.println("You have not purchased " + pattern);

        productScanner.close();
    }
}
