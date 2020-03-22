package by.gerasimchik;

import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {
        //ЗАДАНИЕ 13
        while (true) {
            System.out.println("Введите число для проверки : ");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            if (a == 0) {
                System.out.println("Не вводи ноль !!!");
                continue;
            } else if (a < 0) {
                System.out.println("Введите положительно число");
                continue;
            }
            boolean sost = false;
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    sost = true;
                    break;
                }
            }
            if (sost == true) {
                System.out.println("Введенное число - составное");
            } else {
                System.out.println("Введенное число - простое");
            }
        }
    }
}
