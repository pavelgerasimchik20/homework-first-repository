package by.gerasimchik;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Задание 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введине количество рублей: ");
        int x = scanner.nextInt();
        if ((x % 10 == 1 && x != 11) || x == 1)
            System.out.println(x + " рубль");
        else if (x % 10 == 2 && x != 12 || x == 2)
            System.out.println(x + " рубля");
        else if (x % 10 == 3 && x != 13 || x == 3)
            System.out.println(x + " рубля");
        else if (x % 10 == 4 && x != 14 || x == 4)
            System.out.println(x + " рубля");
        else
            System.out.println(x + " рублей");

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
        //Задание 7
        Scanner sc = new Scanner(System.in);
        System.out.println("Ширина первого дома:");
        int a1 = sc.nextInt();
        System.out.println("Длина первого дома:");
        int b1 = sc.nextInt();
        System.out.println("Ширина второго дома:");
        int c1 = sc.nextInt();
        System.out.println("Длина второго дома:");
        int d1 = sc.nextInt();
        System.out.println("Размер участка OY:");
        int e = sc.nextInt(); // размеры
        System.out.println("Размер участка OX:");
        int f = sc.nextInt(); // участка

        if (f >= b1 + c1 && e >= d1 && e >= a1) {
            System.out.println("Дома вмещаются на участке");
        } else if (f >= b1 + d1 && e >= c1 && e >= a1) {
            System.out.println("Дома вмещаются на участке");
        } else if (f >= a1 + c1 && e >= b1 && e >= d1) {
            System.out.println("Дома вмещаются на участке");
        } else if (f >= a1 + d1 && e >= b1 && e >= c1) {
            System.out.println("Дома вмещаются на участке");
        } else {
            System.out.println("Дома НЕ вмещаются на участке");
        }
    }
}
