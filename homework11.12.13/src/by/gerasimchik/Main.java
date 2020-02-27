package by.gerasimchik;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //ЗАДАНИЕ 11
        System.out.println("Введите число для проверки : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean sost = false;
        for (int i = 2; i < a; i++) {
            if (a % i == 0)
                sost = true;
        }
        if (sost == true)
            System.out.println("Введенное число - составное");
        else
            System.out.println("Введенное число - простое");
    }

}
