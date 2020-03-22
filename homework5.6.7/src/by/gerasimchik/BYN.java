package by.gerasimchik;

import java.util.Scanner;

public class BYN {

    public static void main(String[] args) {

        //Задание 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введине количество рублей: ");
        int x = scanner.nextInt();
        if (x % 100 == 11)
            System.out.println(x + " рублей");
        else if ((x % 10 == 1 && x != 11) || x == 1)
            System.out.println(x + " рубль");
        else if (x % 10 == 2 && x != 12 || x == 2)
            System.out.println(x + " рубля");
        else if (x % 10 == 3 && x != 13 || x == 3)
            System.out.println(x + " рубля");
        else if (x % 10 == 4 && x != 14 || x == 4)
            System.out.println(x + " рубля");
        else
            System.out.println(x + " рублей");
    }
}
