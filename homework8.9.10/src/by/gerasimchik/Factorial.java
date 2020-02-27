package by.gerasimchik;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial { //ЗАДАНИЕ 8 (ВАРИАНТ ЧЕРЕЗ КЛАСС BigInteger)

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter value to find the factorial: ");
            Scanner input = new Scanner(System.in);
            int fac = input.nextInt();
            System.out.println("factorial is ");
            System.out.println(factorial(fac).toString());
        }

    }

    static BigInteger factorial(int fac) {
        BigInteger first = BigInteger.valueOf(1);
        for (int i = 1; i <= fac; i++) {
            first = first.multiply(BigInteger.valueOf(i));
        }
        return first;

    }
}
