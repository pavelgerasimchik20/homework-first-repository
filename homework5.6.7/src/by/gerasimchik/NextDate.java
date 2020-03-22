package by.gerasimchik;

import java.util.Scanner;

public class NextDate {

    public static void main(String[] args) {
        //Задание 6
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число в месяце:");
        int a = scan.nextInt();
        System.out.println("Введите номер месяца:");
        int b = scan.nextInt();
        System.out.println("Введите год:");
        int c = scan.nextInt();

        if (b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10) {
            if (a >= 1 && a < 31) {
                a++;
                System.out.println(a + " " + b + " " + c);
            } else if (a == 31) {
                a = 1;
                b++;
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println("Такого числа не существует");
            }
        } else if (b == 4 || b == 6 || b == 9 || b == 11) {
            if (a >= 1 && a < 30) {
                a++;
                System.out.println(a + " " + b + " " + c);
            } else if (a == 30) {
                a = 1;
                b++;
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println("Такого числа не существует ");
            }
        } else if (b == 12) {
            if (a >= 1 && a < 31) {
                a++;
                System.out.println(a + " " + b + " " + c);
            } else if (a == 31) {
                a = 1;
                b = 1;
                c++;
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println("Такого числа не существует");
            }
        } else if (b == 2) {
            if (c % 400 == 0 || (c % 4 == 0 && c % 100 != 0)) {
                if (a >= 1 && a < 29) {
                    a++;
                    System.out.println(a + " " + b + " " + c);
                } else if (a == 29) {
                    a = 1;
                    b++;
                    System.out.println(a + " " + b + " " + c);
                } else {
                    System.out.println("Такого числа не существует");
                }
            } else {
                if (a >= 1 && a < 28) {
                    a++;
                    System.out.println(a + " " + b + " " + c);
                } else if (a == 28) {
                    a = 1;
                    b++;
                    System.out.println(a + " " + b + " " + c);
                } else {
                    System.out.println("Такого числа не существует");
                }
            }
        } else {
            System.out.println("Такого месяца не существует");
        }
    }
}
